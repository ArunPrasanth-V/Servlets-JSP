package com.selikapro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("getServletName()num2"));
         PrintWriter out=res.getWriter();
         System.out.println(i+j);
         out.println("result is : "+(i+j));
	}
}
