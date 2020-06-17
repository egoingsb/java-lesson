package org.otu.account.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

class IndexServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		Random rand = new Random();
		System.out.println(get_data());
		out.write("<html>"+
				"<h1>Account</h1>\n" + 
				"<p>\n" +
				"	<form method=\"POST\">"+
				"		<input type=\"text\" name=\"total\" placeholder=\"Please enter the amount\">\n" + 
				"		<input type=\"submit\" value=\"save\">\n" +
				"	</form>"+
				"</p>\n" + 
				"<textarea style=\"height:300px;\">"+get_data()+"</textarea></html>");
		out.close();
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String total = req.getParameter("total");
		Person p1 = new Person(1, "Michael", 0.5);
		Person p2 = new Person(2, "Calvin", 0.3);
		Person p3 = new Person(3, "Robin", 0.2);
		Person[] profitRate = {p1, p2, p3};
		Accounting acc = new Accounting(Double.parseDouble(total), profitRate);
		String output = acc.makeOutput();
		Print.file(output);
		resp.sendRedirect("/accounting");
	}
	
	public static String get_data() throws FileNotFoundException {
		String data = "";
		for(Scanner sc = new Scanner(new File("journal.txt")); sc.hasNext(); ) {
		  String line = sc.nextLine();
		  data+=line+"\n";
		}
		return data;
	}

}

public class AccountWebApp {
	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8011);
		Context appContext = tomcat.addWebapp("/accounting", new File("").getAbsolutePath());
		Tomcat.addServlet(appContext, "index-servlet", new IndexServlet());
		appContext.addServletMappingDecoded("/*", "index-servlet");
		tomcat.start();
		tomcat.getServer().await();
	}

}

