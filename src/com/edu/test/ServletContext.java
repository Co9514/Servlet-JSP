package com.edu.test;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/context3")
public class ServletContext extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out= resp.getWriter();
		
		javax.servlet.ServletContext sc = this.getServletContext();
		
		ShareObject obj1=new ShareObject();
		obj1.setCount(100);
		obj1.setStr("��ü ���� �׽�Ʈ -1");
		sc.setAttribute("data1", obj1);
		
		ShareObject obj2=new ShareObject();
		obj2.setCount(200);
		obj2.setStr("��ü ���� �׽�Ʈ -2");
		sc.setAttribute("data2", obj2);
		
		out.print("ServletContext ��ü�� ������ ����� �Ͽ����ϴ�.");
		out.close();
		
	}
}
