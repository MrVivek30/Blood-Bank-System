//package com.trackobit.controller;
//
//import com.trackobit.dao.BloodBank;
//import com.trackobit.model.Donor;
//import com.trackobit.service.Filter_DonorService;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/FilterServlet")
//public class FilterServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        String filterCriteria = request.getParameter("filterCriteria");
////        String filterValue = request.getParameter("filterValue");
////-----------------------------
//
//        String filterCriteria = request.getParameter("filterCriteria");
//        String filterType = request.getParameter("filterType");
//        String filterValue = request.getParameter("filterValue");
//        String minValue = request.getParameter("minValue");
//        String maxValue = request.getParameter("maxValue");
////---------------------------------
//        System.out.println("Filter Criteria: " + filterCriteria);
//        System.out.println("Filter Value: " + filterValue);
//
//
//
//        List<Donor>donorList= BloodBank.getAllDonors();
////      ----------------filterList---------------------------------
//        List<Donor> filterList= Filter_DonorService.filterDonors(filterCriteria,filterValue,donorList);
//
//   request.setAttribute("vivek",filterList);
//
//
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("filterResult.jsp");
//        dispatcher.forward(request, response);
//    }
//}
//
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
        String filterType = request.getParameter("filterType");
        String filterValue = request.getParameter("filterValue");
        String minValue = request.getParameter("minValue");
        String maxValue = request.getParameter("maxValue");

        System.out.println("Filter Criteria: " + filterCriteria);
        System.out.println("Filter Type: " + filterType);
        System.out.println("Filter Value: " + filterValue);
        System.out.println("Min Value: " + minValue);
        System.out.println("Max Value: " + maxValue);

        List<Donor> donorList = BloodBank.getAllDonors();
        donorList.removeIf(i->i.getUnit()==0);
        List<Donor> filterList;

        if ("age".equals(filterCriteria) || "bloodUnit".equals(filterCriteria)) {
            filterList = Filter_DonorService.filterDonorsRange(filterCriteria, filterType, filterValue, minValue, maxValue, donorList);
        } else {
            filterList = Filter_DonorService.filterDonors(filterCriteria, filterValue, donorList);
        }

        request.setAttribute("vivek", filterList);

        RequestDispatcher dispatcher = request.getRequestDispatcher("filterResult.jsp");
        dispatcher.forward(request, response);
    }
}
