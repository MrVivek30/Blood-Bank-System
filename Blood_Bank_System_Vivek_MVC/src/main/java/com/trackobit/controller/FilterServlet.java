package com.trackobit.controller;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.service.Filter_DonorService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/FilterServlet")
public class FilterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filterCriteria = request.getParameter("filterCriteria");
        String filterValue = request.getParameter("filterValue");

        System.out.println("Filter Criteria: " + filterCriteria);
        System.out.println("Filter Value: " + filterValue);



        List<Donor>donorList= BloodBank.getAllDonors();
//      ----------------filterList---------------------------------
        List<Donor> filterList= Filter_DonorService.filterDonors(filterCriteria,filterValue,donorList);

   request.setAttribute("vivek",filterList);



        RequestDispatcher dispatcher = request.getRequestDispatcher("filterResult.jsp");
        dispatcher.forward(request, response);
    }
}

