<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<style>
#message{
color:red;
}
</style></head>
<body style="background-color:lavender">

<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<h1>Health Care Center - V Care 4 U</h1>

	<form:form action="consultation" method="post" modelAttribute="appointment">
		<table>
			<tr>
				<td>Select Consultation:</td>
				<td>
					<form:select path="consultationFor" id="consulationFor">
						<form:options items="${consultationList}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Patient Name:</td>
				<td><form:input path="patientName" id="patientName" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" id="age" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNumber" id="phoneNumber" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;">
					<input type="submit" name="submit" value="Book Appointment" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div id="message">
						<spring:message code="${message}" />
						<c:if test="${not empty message}">
							${message}
						</c:if>
					</div>
				</td>
			</tr>
		</table>
	</form:form>


</body>
</html>	 	  	    	    	     	      	 	
