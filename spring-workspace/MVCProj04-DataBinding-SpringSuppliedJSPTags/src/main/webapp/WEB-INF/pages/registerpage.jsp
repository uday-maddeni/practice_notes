<%@page isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>

<h1>Registration Page</h1>

<fm:form action="register" method="POST" modelAttribute="std">
<table>
<tr>
<td>Student id:</td>
<td> <fm:input path="sid" /> </td>
</tr>

<tr>
<td>Student name:</td>
<td> <fm:input path="sname" /> </td>
</tr>

<tr>
<td>Student address:</td>
<td> <fm:input path="addr" /> </td>
</tr>

<tr>
<td>average :</td>
<td> <fm:input path="avg" /> </td>
</tr>

<tr>
<td> <input type="submit" name="submit" > </td>
</tr>

</table>
</fm:form>