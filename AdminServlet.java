package com.vpnproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("username");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome Admin, " + user + "</h2>");
        out.println("<p>Admin panel for managing users and data.</p>");
    }
}
