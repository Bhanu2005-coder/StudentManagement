
<%@ page import="java.util.*,com.student.model.Student" %>
<%
List<Student> list=(List<Student>)request.getAttribute("students");
%>
<html><body>
<h2>Students</h2>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Action</th></tr>
<% for(Student s:list){ %>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName()%></td>
<td><%=s.getEmail()%></td>
<td><%=s.getCourse()%></td>
<td>
<a href="student?action=edit&id=<%=s.getId()%>">Edit</a> |
<a href="student?action=delete&id=<%=s.getId()%>">Delete</a>
</td>
</tr>
<% } %>
</table>
</body></html>
