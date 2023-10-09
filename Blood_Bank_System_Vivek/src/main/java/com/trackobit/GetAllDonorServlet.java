package com.trackobit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getAllDonor")
public class GetAllDonorServlet extends HttpServlet {
    List<Donor> donors = BloodBank.getAllDonors();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Donor> donors = BloodBank.getAllDonors();

//
//        //---------------updating logic-------------------------------
List<Receiver>receivers=BloodBank.getAllReceivers();

PrintWriter v=response.getWriter();
for (Donor d:donors){

    for (Receiver r:receivers){
        if (d.getId()==r.getEnterDonorId()){
            if(d.getUnit()>=r.getUnit()){
                d.setUnit(d.getUnit()-r.getUnit());
                System.out.println("Updating------------------>>>>");
                donors.removeIf(s->s.getUnit()==0);
            }else{
                d.setUnit(d.getUnit());
                v.println("Blood bank closed");
                donors.removeIf(s->s.getUnit()==0);
            }


        }
        }
    }

//-----------------------------------------------------
//        int i = ReceiveServlet.i;
//        Donor d=BloodBank.getDonorById(i);
//        System.out.println(d+" from static");

//Donor d=BloodBank.getDonorById(BloodBank.findId);
//        System.out.println(d+ "getting from findID objetc-------------++++++++++++++");




        System.out.println(donors+"----------------------");
        request.setAttribute("donors", donors);

        request.getRequestDispatcher("allDonors.jsp").forward(request, response);

//        PrintWriter v=response.getWriter();
//        v.println(donors);
    }
}
