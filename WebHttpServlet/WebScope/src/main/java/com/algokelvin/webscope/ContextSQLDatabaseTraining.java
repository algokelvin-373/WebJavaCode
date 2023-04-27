package com.algokelvin.webscope;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContextSQLDatabaseTraining")
public class ContextSQLDatabaseTraining extends HttpServlet {
	private static final long serialVersionUID = 14839849375838L;
      
    public ContextSQLDatabaseTraining() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/db_training", "root", "Calvin_Ht@273373");
			printWriter.print("<h2> Status Connection is "+ connection +" </h2>");
			
			getServletContext().setAttribute("employee-connection-db", connection);
		} catch (Exception e) {
			e.printStackTrace();
			printWriter.print("<h2>Exception in connection database: "+ e.getMessage() +" </h2>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
