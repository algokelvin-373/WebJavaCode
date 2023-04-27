package com.algokelvin.webscope;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContextParamSQL")
public class ContextParamSQL extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext servletContext = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		servletContext = config.getServletContext();
	}
       
    public ContextParamSQL() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		Connection connection = (Connection) servletContext.getAttribute("employee-connection-db");
		printWriter.print("<h1> Employee DB : "+ connection);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
