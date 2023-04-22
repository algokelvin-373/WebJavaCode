package com.firstservletapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstHttpServlet extends HttpServlet {

	private static final long serialVersionUID = -9090212964548684574L;

	/*
	 * @Override public void service(ServletRequest req, ServletResponse res) throws
	 * ServletException, IOException { // TODO Auto-generated method stub
	 * PrintWriter printWriter = res.getWriter();
	 * printWriter.print("<h1>Hello World from Http Servlet!</h1>");
	 * printWriter.print("<h1>Today is " + new Date() + "</h1>"); }
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<h1>Hello World from doGet Http Servlet!</h1>");
		printWriter.print("<h1>Today is " + new Date() + "</h1>");
	}


}
