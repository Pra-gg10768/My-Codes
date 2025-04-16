<%-- showpage.jsp --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Help Services</title>
</head>
<body style="background-color:lavender">
    <h1><center>Welcome to Online Help Services</center></h1>
    <form method="post" action="helpdesk">
        <table style="margin: 0px auto; margin-left: auto; margin-right:auto">
 <tr>
                <td>Select Service Type:</td>
                <td>
                    <select id="serviceType" name="serviceType">
                        <c:forEach var="service" items="${serviceList}">
                            <option value="${service.key}">${service.value}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Enter Number of Hours:</td>
                <td><input type="text" id="noOfHours" name="noOfHours" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="TotalCost" name="submit" />
                </td>
            </tr>
             </table>
    </form>
    
</body>
</html>