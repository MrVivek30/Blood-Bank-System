package com.trackobit.controller;

// processSelectionServlet.java

import com.trackobit.dao.BloodBank;
import com.trackobit.model.Donor;
import com.trackobit.model.Receiver;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ApprovalServlet")
public class ApprovalServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        int id= Integer.parseInt(request.getParameter("donorId"));
        int reqUnit= Integer.parseInt(request.getParameter("reqUnit"));

        System.out.println(action);
        System.out.println(id);
        Donor d=BloodBank.getDonorById(id);
        List<Receiver> allReceivers  = BloodBank.getAllReceivers();

        List<Receiver> allPendingReceivers = BloodBank.getAllPendingReceivers();

        if ("Accept".equals(action)) {
            //fetching diff----------------
            int diff=reqUnit-d.getUnit();
//            ------------------addding diff----------------
            d.setUnit(d.getUnit()+diff);
            //----------------

//------------after getting blood receiver gayab------------
            System.out.println("chal rha");

                response.sendRedirect("ApprovalSuccessfull.jsp");
                } else if ("Reject".equals(action)) {
            if (d.getCount()<0){
                d.setCount(0);
            }
d.setCount(d.getCount()-1);

   allPendingReceivers.removeIf(i->i.getEnterDonorId()==id);
//   allPendingReceivers.remove()
            System.out.println(allPendingReceivers+"===================");
               response.sendRedirect("DeclineSuccessfull.jsp");
                } else {

                }
    }
}
