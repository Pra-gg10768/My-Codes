<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Help Service Page</title>
</head>
<body bgcolor="lightblue">
    <h2>Service Request Form</h2>

    <form:form method="post" action="helpdesk" modelAttribute="helper">
        <table>
            <tr>
                <td>Select Service:</td>
                <td>
                    <form:select path="serviceType" id="serviceType">
                        <form:options items="${serviceList}" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Enter Number of Hours:</td>
                <td>
                    <form:input path="noOfHours" id="noOfHours" />
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" id="submit" name="submit" value="TotalCost" />
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
