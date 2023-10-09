package com.trackobit;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String action = request.getParameter("action");
//        String acto=request.getParameter()

//        if ("donate".equals(action)) {
//            response.sendRedirect("donate.jsp");
//        } else if ("receive".equals(action)) {
//            request.setAttribute("donors", BloodBank.getDonorList());
        System.out.println("from HomeServlet------------>");
//            request.getRequestDispatcher("receive.jsp").forward(request, response);
//        }

//      PrintWriter v= response.getWriter();
//        v.println("Heloo................");

    }
}
