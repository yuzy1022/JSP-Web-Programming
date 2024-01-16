<%@ page import="java.sql.*"%> 
<%
	Connection conn = null;

	String url = "jdbc:mysql://localhost:3306/JSPBookDB";
	String user = "root";
	String password = "0000";

	Class.forName("com.mysql.jdbc.Driver");  //중요
	conn = DriverManager.getConnection(url, user, password);  //중요
%>