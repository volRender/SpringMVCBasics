<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, please, enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    <%-- hardcoded>
<%--    Department: <form:select path="department">--%>
<%--        <form:option value="Information Technology" label="IT"/>--%>
<%--        <form:option value="Human Resources" label="HR"/>--%>
<%--        <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>
    Department: <form:select path="department">
            <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>

    <%-- hardcoded>
<%--    Choose a car:--%>
<%--    BMW <form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    Volks <form:radiobutton path="carBrand" value="Volkswagen"/>--%>
<%--    MB <form:radiobutton path="carBrand" value="Mercedez-Benz"/>--%>

    Choose a car:
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    <%-- hardcoded>
<%--    Language(s):--%>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>

    Language(s):
    <form:checkboxes path="languages" items="${employee.languageMap}"/>
    <br><br>

    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <input type="submit" value="OK">

</form:form>

</body>

</html>