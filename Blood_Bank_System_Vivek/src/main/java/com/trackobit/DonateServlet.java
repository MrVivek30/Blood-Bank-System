package com.trackobit;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DonateServlet")
public class DonateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String bloodGroup = request.getParameter("bloodGroup");
        int units = Integer.parseInt(request.getParameter("unit"));
        String address = request.getParameter("address");


        Donor donor = new Donor(id, name, age, bloodGroup, units, LocalDateTime.now(), address);


        BloodBank.addDonor(donor);

//        request.setAttribute("donor",donor);

        System.out.println("from donateServlet---------------");

        request.setAttribute("successMessage", "Donation successful!");

//request.getRequestDispatcher("receive.jsp").forward(request,response);

        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}