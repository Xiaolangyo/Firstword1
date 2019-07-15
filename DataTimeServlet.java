package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/api/serverdate")
public class DataTimeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		   arg1.setContentType("text/plain;charset=utf-8");
		   PrintWriter out=arg1.getWriter();
		   SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   
		   
		   try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   out.print(sf.format(new Date()));
		   out.close();
		   
	}

}
