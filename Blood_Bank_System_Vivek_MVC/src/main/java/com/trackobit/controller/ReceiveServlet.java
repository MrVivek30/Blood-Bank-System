package com.trackobit.controller;

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.model.DonorDTO;
import com.trackobit.model.Receiver;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@WebServlet("/ReceiveServlet")
public class ReceiveServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


     int id= Integer.parseInt(request.getParameter("enterDonorId"));

        String name = request.getParameter("name");

        String address = request.getParameter("address");
        int units = Integer.parseInt(request.getParameter("unit"));

        Receiver receiver=new Receiver(id,name, LocalDateTime.now(),address,units);

//        List<Donor> donorById = (List<Donor>) BloodBank.getDonorById(id);
//        List<Donor>donorList= Collections.synchronizedList(donorById);
//        Iterator<Donor> it = donorList.iterator();
//        while (it.hasNext()){
//            Donor d=it.next();
//
//            if (d.getUnit() >= units) {
//                d.setUnit(d.getUnit() - units);
//            }
//
//        }
//=============================================================================================

        Donor d=BloodBank.getDonorById(id);
//        DonorDTO d2=BloodBank.getDonorPendingById(id);
        if (units<=d.getUnit()) {
            d.setUnit(d.getUnit() - units);

            BloodBank.addReceiver(receiver);
            System.out.println("from receiveServlet---------------" + receiver);


            request.setAttribute("successMessage", "Received successful!");


            request.getRequestDispatcher("success2.jsp").forward(request, response);
        }else{

        d.setCount(d.getCount()+1);

        BloodBank.addReceiverPending(receiver);
            System.out.println("from receiveServlet Pending Blood---------------" + receiver);


            request.setAttribute("successMessage", "Received successful!");


            request.getRequestDispatcher("pendingSuccess2.jsp").forward(request, response);
        }


    }
}
