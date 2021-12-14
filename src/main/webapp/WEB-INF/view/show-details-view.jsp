<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, you are WELCOME!!!</h2>

<br>
<br>

<h2>Your name: </h2> ${employee.name}
<h2>Your surname: </h2> ${employee.surname}
<h2>Your salary: </h2> ${employee.salary}
<h2>Your department: </h2> ${employee.department}
<h2>Your car: </h2> ${employee.carBrand}
<h2>Your language(s): </h2>
<ul>

    <c:forEach var="lang" items="${employee.languages}">

        <li> ${lang} </li>

    </c:forEach>

</ul>
<h2>Your phone number: </h2> ${employee.phoneNumber}
</body>

</html>