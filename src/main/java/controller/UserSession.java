package controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class UserSession implements HttpSessionListener{
	
	ServletContext context=null;
	
	
	public void sessionCreated(HttpSessionEvent event)
	{
		context=event.getSession().getServletContext();
		context.setAttribute("LoggedIn", "yes");
		context.setAttribute("userName", "test");
	}
	
	
	
	public void sessionDestroy(HttpSessionEvent event)
	{
		context.setAttribute("LoggedIn", "No");
		context.setAttribute("userName", "");
	}

}
