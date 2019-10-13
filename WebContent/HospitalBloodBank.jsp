<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BloodBank and Hospital Portal</title>
</head>
<body>
<h3> BloodBank/Hospital Portal</h3>><br /><br />
<h3>Welcome  : <%=request.getAttribute("userid") %> </h3>
<input type="text" class="searchTerm" placeholder="Search bloodtype" name= "bloodtype"><br />
<button type="submit" class="searchButton" value="Search"></button>
</body>
</html>