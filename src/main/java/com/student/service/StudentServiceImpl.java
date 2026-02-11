
package com.student.service;
import java.util.*;
import com.student.dao.*;
import com.student.model.Student;
public class StudentServiceImpl implements StudentService{
 StudentDAO dao=new StudentDAOImpl();
 public void addStudent(Student s){dao.addStudent(s);}
 public List<Student> getAllStudents(){return dao.getAllStudents();}
 public Student getStudent(int id){return dao.getStudentById(id);}
 public void updateStudent(Student s){dao.updateStudent(s);}
 public void deleteStudent(int id){dao.deleteStudent(id);}
}
