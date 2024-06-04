<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id="wrapper">
<div id="header">
<h2>CRM-Customer Relationship Manager</h2>
</div>
</div>
<div id="container">
<div id="content">
<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd';return false;"class="add-button"/>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>

<!-- loop over & print customer -->
<c:forEach var="tempCustomer" items="${customers}">
<!-- construct and update link with customer id
 -->
 <c:url var="updatelink" value="/customer/showFormForUpdate">
 <c:param name="customerId" value="${tempCustomer.id }"></c:param>
 </c:url>
 <c:url var="deletelink" value="/customer/showFormForDelete">
 <c:param name="customerId" value="${tempCustomer.id }"></c:param>
 </c:url>
 <tr>
<td>${tempCustomer.firstName}</td>
<td>${tempCustomer.lastName}</td>
<td>${tempCustomer.email}</td>
<td>
<a href="${updatelink }">Update</a>
</td>
<td>
<a href="${deletelink }">Delete</a>
</td>
</tr>
</c:forEach>
</table>
</div>
</div>
</body>
</html>