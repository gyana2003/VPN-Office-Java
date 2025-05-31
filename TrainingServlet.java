package com.vpnproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TrainingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Training Module</h2>");
        out.println("<p>Simulating network test and training environment.</p>");
    }
}
