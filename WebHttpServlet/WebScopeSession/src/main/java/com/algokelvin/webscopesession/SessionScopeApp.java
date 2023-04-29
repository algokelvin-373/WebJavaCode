package com.algokelvin.webscopesession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/isVisited")
public class SessionScopeApp extends HttpServlet {
	private static final long serialVersionUID = 1465854534L;
       
    public SessionScopeApp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		request.getCookies(); // ==> JSESSIONID
		HttpSession httpSession = request.getSession();
		
		Object sessionObj = httpSession.getAttribute("isVisited");
		if (sessionObj == null) {
			httpSession.setAttribute("isVisited", true);
			
			// Attribute: Server-side
			// Cookie: Client-side
			
			printWriter.print("Thanks for visiting our application");
		} else {
			printWriter.print("Welcome Back");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
