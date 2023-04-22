package com.algokelvin.servletlifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackServlet
 */
@WebServlet(
		urlPatterns = { "/FeedbackServlet" }, 
		initParams = { 
				@WebInitParam(
					name = "company-email", 
					value = "algokelvin@gmail.com", 
					description = "Organization Email"
				)
		})
public class FeedbackServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1254645336534L;
	private String companyInitParameter = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
        super();
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	companyInitParameter = config.getInitParameter("company-email");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h2>Init param values is "+ companyInitParameter +" </h2>");
		
		String feedback = request.getParameter("feedbackParam");
		
		printWriter.print("<h3>We will send "+ feedback +" to "+ companyInitParameter +"</h3>");
	}

}
