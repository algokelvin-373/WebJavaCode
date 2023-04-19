package com.algokelvin.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainWebServletHttp extends HttpServlet {

    protected void HelloServletVersionOne(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head><title>Hello Servlet Version One</title></head>");
        printWriter.println("<body>");
        printWriter.println("<h1>Hello, world!</h1>");
        printWriter.println("</body>");
        printWriter.println("</html>");
    }

}