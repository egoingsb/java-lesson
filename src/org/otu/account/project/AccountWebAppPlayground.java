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

class HomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		Random rand = new Random();
		System.out.println(get_data());
		// 아래에 HTML 코드가 옵니다. 
		out.write("Hello World");
		out.close();
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 사용자의 요청이 들어오면 아래의 코드가 동작됩니다. 
		
		// 폼을 통해서 전송한 total 값을 알아내야 합니다. 
		// 검색 : how to get post parmeter servlet  예) https://stackoverflow.com/a/11042
		
		// Accounting 클래스를 활용해서 total값을 계산하고 그 결과를 파일에 저장하는 코드를 이곳에 적어주세요. 
		
		// 모든 작업이 끝나면 사용자를 /accounting 페이지로 리디렉션시켜야 합니다. 
		// 검색 : servlet redirect   예) https://www.javatpoint.com/sendRedirect()-method
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

public class AccountWebAppPlayground {
	public static void main(String[] args) throws LifecycleException {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8011);
		Context appContext = tomcat.addWebapp("/accounting", new File("").getAbsolutePath());
		Tomcat.addServlet(appContext, "index-servlet", new HomeServlet());
		appContext.addServletMappingDecoded("/*", "index-servlet");
		tomcat.start();
		tomcat.getServer().await();
	}

}

