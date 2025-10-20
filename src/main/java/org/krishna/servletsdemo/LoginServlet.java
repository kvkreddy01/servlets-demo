package org.krishna.servletsdemo;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.*;


public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("admin".equals(username) && "password123".equals(password)) {
            out.println("<h2>Login Successful!</h2>");
        } else {
            out.println("<h2>Invalid username or password.</h2>");
        }
    }
}
