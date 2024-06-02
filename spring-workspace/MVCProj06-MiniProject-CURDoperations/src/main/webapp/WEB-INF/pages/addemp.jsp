<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>

<h1 style="color:orange; text-align:center">Insert New Record into Report</h1>

<fm:form action="add_emp" method="POST" modelAttribute="emp">
<table align="center" border="1px" bgcolor="cyan">
<tr>
<td>EMPNO</td>
<td><fm:input path="empno" /></td>
</tr>

<tr>
<td>EMPNAME</td>
<td><fm:input path="ename" /></td>
</tr>

<tr>
<td>JOB</td>
<td><fm:input path="job" /></td>
</tr>

<tr>
<td>SAL</td>
<td><fm:input path="sal" /></td>
</tr>

<tr>
<td>DEPTNO</td>
<td><fm:input path="deptno" /></td>
</tr>

<tr>
<td><input type="submit" value="register" /></td>
<td><input type="reset" value="cancel" /></td>
</tr>
</table>
</fm:form>