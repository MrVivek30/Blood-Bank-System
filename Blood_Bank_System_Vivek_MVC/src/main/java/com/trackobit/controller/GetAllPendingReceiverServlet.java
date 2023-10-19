package com.trackobit.controller;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.model.Receiver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/getAllPendingReceiver")
public class GetAllPendingReceiverServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int donorIdParam = Integer.parseInt(request.getParameter("donorId"));
        int unitsParam = Integer.parseInt(request.getParameter("units"));


        List<Receiver> receivers = BloodBank.getAllPendingReceivers();

        request.setAttribute("pendingList", receivers);
        request.setAttribute("id",donorIdParam);
        request.getRequestDispatcher("PendingReceiverList.jsp").forward(request, response);


    }

}


