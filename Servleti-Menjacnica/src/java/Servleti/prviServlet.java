/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servleti;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hajruš Hot
 */
public class prviServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String operacija1=request.getParameter("izvalute");
        String operacija2=request.getParameter("uvalutu");
        String izn=request.getParameter("iznos");
        float br;
        Menjacnica menjacnica = new Menjacnica();
        if(izn.equals(""))
            br = 0;
        else
            br = Float.valueOf(izn);
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Menjacnica</title>");
            out.println("<style>a:link{color: rgb(0, 0, 77);}a:hover{color: blue;}</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div style=\" background-image: url('folder1/slika4.jpg'); height: 200px; width: 250px;\">");
            out.println("<table style='color: rgb(0, 0, 77)'><tr><td><b>Rezultat:<b></td></tr>");
            out.println("<tr><td><input type=\"text\" size=\"15\" value='"+menjacnica.menjacnica(operacija1,operacija2,br)+"'/></td></tr>");
            out.println("<tr><td><a href=\"index.html\">Vrati se na pocetnu</a></td></tr></table>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        } finally {
        out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
