<html>
<head>
<title>Scripting Tag</title>
</head>
<body>
<%!
 String data = "hello";
String lower(String data){
return data.toLowerCase();
}	%>
<%out.println("HELLO"); %>
<%= lower("GANGNAM") %>


</body>
</html>