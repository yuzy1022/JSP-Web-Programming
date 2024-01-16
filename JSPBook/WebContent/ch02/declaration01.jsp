<html>
<head>
<title>Scripting Tag</title>
</head>
<body>
	<%! public String str = "Hello, Java Server Pages";
	String getString(String str){
		return str;
	}
	%>
	<%= getString(str) %>
</body>
</html>