package com.trackobit.controller;

import javax.servlet.annotation.WebServlet;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.BloodRequest;
import com.trackobit.model.Donor;
import com.trackobit.service.DonorExist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
@WebServlet("/BloodRequestServlet")

public class BloodRequestServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int donorId = Integer.parseInt(request.getParameter("donorId"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        int unitsRequested = Integer.parseInt(request.getParameter("units"));


        BloodRequest bloodRequest = new BloodRequest(donorId, name, address, unitsRequested);


        Donor donor = BloodBank.getDonorById(donorId);
//        donor.addBloodRequest(bloodRequest);

        // Redirect to a page indicating successful request submission
        response.sendRedirect("requestSuccess.jsp");
    }
}
