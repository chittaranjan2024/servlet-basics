package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class MyController extends HttpServlet {
	
	@Override
    public void init()
    {
    	System.out.println("Servlet initialized");
    }
	
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		System.out.println("Service method called");
		response.sendRedirect("test.jsp");
	}
	
	
	@Override
	public void destroy()
	{
		System.out.println("Servlet destroyed");
	}
    
   

}
