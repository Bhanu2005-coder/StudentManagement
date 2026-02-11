
<%@ page import="com.student.model.Student" %>
<%
Student s=(Student)request.getAttribute("student");
%>
<html><body>
<h2>Edit Student</h2>
<form action="student" method="post">
<input type="hidden" name="id" value="<%=s.getId()%>">
Name:<input name="name" value="<%=s.getName()%>"><br><br>
Email:<input name="email" value="<%=s.getEmail()%>"><br><br>
Course:<input name="course" value="<%=s.getCourse()%>"><br><br>
<input type="submit">
</form>
</body></html>
