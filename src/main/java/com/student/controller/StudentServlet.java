
package com.student.controller;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.student.model.Student;
import com.student.service.*;
public class StudentServlet extends HttpServlet{
 StudentService service=new StudentServiceImpl();
 protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
  String action=req.getParameter("action");
  if(action==null){
   req.setAttribute("students",service.getAllStudents());
   req.getRequestDispatcher("viewStudents.jsp").forward(req,res);
  }else if(action.equals("edit")){
   int id=Integer.parseInt(req.getParameter("id"));
   req.setAttribute("student",service.getStudent(id));
   req.getRequestDispatcher("editStudent.jsp").forward(req,res);
  }else if(action.equals("delete")){
   int id=Integer.parseInt(req.getParameter("id"));
   service.deleteStudent(id);
   res.sendRedirect("student");
  }
 }
 protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
  String id=req.getParameter("id");
  Student s=new Student(req.getParameter("name"),req.getParameter("email"),req.getParameter("course"));
  if(id==null||id.isEmpty()){
   service.addStudent(s);
  }else{
   s.setId(Integer.parseInt(id));
   service.updateStudent(s);
  }
  res.sendRedirect("student");
 }
}
