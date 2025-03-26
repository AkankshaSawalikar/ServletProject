//package com.example.servlet;
////import java.io.IOException/;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/hello")
//public class MyServlet extends HttpServlet{
//	public void doGet(HttpServletRequest req,HttpServletResponse res)
//	
//		throws ServletException, IOException{
//			res.setContentType("text/html");
//			res.getWriter().println("<h2>Hello Servlet</h2>");
//		}
//	
//}
package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.getWriter().println("<h2>Hello Servlet</h2>");
    }
}
