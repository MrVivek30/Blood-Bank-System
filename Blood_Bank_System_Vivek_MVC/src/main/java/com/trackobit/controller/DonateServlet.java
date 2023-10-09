package com.trackobit.controller;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.service.DonorExist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/DonateServlet")
public class DonateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String bloodGroup = request.getParameter("bloodGroup");
        int units = Integer.parseInt(request.getParameter("unit"));
        String address = request.getParameter("address");

LocalDateTime l=LocalDateTime.now();

if (DonorExist.isExist(id,l)) {
    Donor donor = new Donor(id, name, age, bloodGroup, units, l, address);


    BloodBank.addDonor(donor);

    System.out.println("from donateServlet---------------" + donor);

    request.setAttribute("successMessage", "Donation successful!");


    request.getRequestDispatcher("success.jsp").forward(request, response);
}else{
    System.out.println("date exception ");
    request.setAttribute("errorMessage", "Date exception!");
    request.getRequestDispatcher("error.jsp").forward(request,response);

}
    }
}