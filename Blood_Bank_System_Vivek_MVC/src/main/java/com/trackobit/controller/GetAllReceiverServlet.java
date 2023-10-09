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
import java.util.Iterator;
import java.util.List;

@WebServlet("/getAllReceiver")
public class GetAllReceiverServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Receiver> receivers = BloodBank.getAllReceivers();


        request.setAttribute("receivers", receivers);
        request.getRequestDispatcher("allReciver.jsp").forward(request, response);
    }

}


