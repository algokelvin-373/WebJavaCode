package com.algokelvin.webscope;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextParamTraining
 */
@WebServlet("/ContextParamTraining")
public class ContextParamTraining extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		config.getServletContext();
	}
	
    public ContextParamTraining() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = request.getServletContext();
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h2>Context Parameter</h2><br>");
		printWriter.print("<h3>DB Param - IP   : "+ servletContext.getInitParameter("dp-ip") +"</h3>");
		printWriter.print("<h3>DB Param - Port : "+ servletContext.getInitParameter("dp-port") +"</h3>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
