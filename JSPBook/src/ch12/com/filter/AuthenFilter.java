package ch12.com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthenFilter implements Filter 
{
	public void init(FilterConfig filterConfig) throws ServletException
	{
		System.out.println("Filter01 �ʱ�ȭ...");	
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException
	{
		System.out.println("Filter01.jsp ����");
		String name = request.getParameter("name");
		
		if(name == null || name.equals(""))
		{
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			String message = "�Էµ� name���� null�Դϴ�";
			writer.println(message);
			return;
		}
		filterChain.doFilter(request, response);
	}
	
	public void destroy()
	{
		System.out.println("Filter01 ����");
	}
}



