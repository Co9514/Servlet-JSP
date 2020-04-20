package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String[] hobby=req.getParameterValues("hobby");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String religion=req.getParameter("religion");
		String intro=req.getParameter("introduction");
		out.print("<html><head><title>Query test</title></head>");
		out.print("<body><h1>GET방식으로 호출</h1>");
		out.print("ID : "+id+"<br>");
		out.print("PASSWORD : "+password+"<br>");
		out.print("NAME : "+name+"<br>");
		out.print("gender : "+gender+"<br>");
		out.print("religion : "+religion+"<br>");
		out.print("intro : "+intro+"<br>");
		out.print("hobby :");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+"<br>");
		}
		out.print("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id=req.getParameter("id");
		String password=req.getParameter("password");
		String[] hobby=req.getParameterValues("hobby");
		String name=req.getParameter("name");
		String gender=req.getParameter("gender");
		String religion=req.getParameter("religion");
		String intro=req.getParameter("introduction");
		out.print("<html><head><title>Query test</title></head>");
		out.print("<body><h1>POST방식으로 호출</h1>");
		out.print("ID : "+id+"<br>");
		out.print("PASSWORD : "+password+"<br>");
		out.print("NAME : "+name+"<br>");
		out.print("gender : "+gender+"<br>");
		out.print("religion : "+religion+"<br>");
		out.print("intro : "+intro+"<br>");
		out.print("hobby :");
		for(int i=0;i<hobby.length;i++) {
			out.print(hobby[i]+"<br>");
		}
		out.print("</body></html>");
		out.close();
	}

}
