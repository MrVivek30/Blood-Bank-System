package com.trackobit.controller;//package com.trackobit.controller;
//
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

@WebServlet("/getAllDonor")
public class GetAllDonorServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Donor> donors = BloodBank.getAllDonors();



        request.setAttribute("donors", donors);
donors.removeIf(i->i.getUnit()==0);
        request.getRequestDispatcher("allDonors.jsp").forward(request, response);

    }}




