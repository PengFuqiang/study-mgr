package web;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BeerExpert;

import java.io.*;
import java.util.Iterator;
import java.util.List;

public class BeerSelect extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse  response) throws IOException, ServletException {
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection Advice<br>");
		String c = request.getParameter("color");
		//out.println("<br>Got beer color " + c);
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
//		Iterator it = result.iterator();
//		while(it.hasNext()) {
//			out.println("<br>try: " + it.next());
//		}
	}

}
