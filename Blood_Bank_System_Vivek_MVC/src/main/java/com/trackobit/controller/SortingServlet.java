package com.trackobit.controller;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.service.Sorting_DonorService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SortingServlet")
public class SortingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sortingCriteria = req.getParameter("sortingCriteria");

        System.out.println(sortingCriteria+"------------>>>>>>>>>>>>>>");

        List<Donor> donorList= BloodBank.getAllDonors();
//        ----------------sortingList---------------------------------
        List<Donor> sortingList= Sorting_DonorService.sortedDonors(sortingCriteria,donorList);

        System.out.println("sortedList "+sortingList);
        req.setAttribute("vivek",sortingList);


        // Forward the request to a result page or perform further processing
        RequestDispatcher dispatcher = req.getRequestDispatcher("sortingResult.jsp");
        dispatcher.forward(req, resp);
    }
}
