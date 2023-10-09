package com.trackobit;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReceiveServlet")
public class ReceiveServlet extends HttpServlet {
//static int i;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

int id= Integer.parseInt(request.getParameter("enterDonorId"));
        String name = request.getParameter("name");

        String address = request.getParameter("address");
        int units = Integer.parseInt(request.getParameter("unit"));
//BloodBank.setId(id);

//i=id;
        Receiver receiver=new Receiver(id,name, LocalDateTime.now(),address,units);
//List<Donor>lists=BloodBank.getAllDonors();
//        Donor d = lists.get(id);
//        System.out.println("prinitng----------------------");
////        Donor d = BloodBank.getDonorById(id);
//        System.out.println(d);
//    if (d.getUnit()>=units){
//        System.out.println(d.getUnit());
//        d.setUnit(d.getUnit()-units);
//        System.out.println(d.getUnit());
        BloodBank.addReceiver(receiver);
        System.out.println("from receiveServlet---------------");


        request.setAttribute("successMessage", "Donation successful!");


        request.getRequestDispatcher("success.jsp").forward(request, response);
//    }else {
//        request.getRequestDispatcher("error.jsp").forward(request,response);
//    }

////---------------------------------------------

    }
}
