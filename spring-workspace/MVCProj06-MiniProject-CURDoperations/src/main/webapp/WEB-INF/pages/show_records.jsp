<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:choose>
   <c:when test="${!empty empsList }">
      <table align="center" bgcolor="cyan" border="1">
         <tr style="color:yellow">
            <th>EmpNo</th><th>EmpName</th><th>Job</th><th>Salary</th><th>DeptNo</th><th>Operations</th>
         </tr>
         <c:forEach var="emp" items="${empsList }">
            <tr>
              <td>${emp.empno }</td>
              <td>${emp.ename }</td>
              <td>${emp.job }</td>
              <td>${emp.sal }</td>
              <td>${emp.deptno }</td>
              <td>
                <a href="emp_edit?no=${emp.empno }"><img src="resources/images/edit.png" width="30px" height="30px" /></a>
                <a href="emp_delete?no=${emp.empno }" onclick="return confirm('do you want to delete?')"><img src="resources/images/delete.jpg" width="30px" height="30px" /></a>
              </td>
            </tr>
         </c:forEach>
      </table>
   </c:when>
   <c:otherwise>
       <h3 style="color:red;text-align:center">Records not found!!</h3>
   </c:otherwise>
</c:choose> 

<br><br>
<h3 style="color:green; text-align:center"> ${result } </h3>

<br><br>
<center><a href="./"><img src="resources/images/home.jpg" width="50px" hieght="50px" />home </a></center>

<br><br>
<center><a href="add_emp"><img src="resources/images/addemp.png" width="50px" hieght="50px" />Add Record </a></center>