
package com.student.dao;
import java.util.*;
import com.student.model.Student;
public interface StudentDAO{
 void addStudent(Student s);
 List<Student> getAllStudents();
 Student getStudentById(int id);
 void updateStudent(Student s);
 void deleteStudent(int id);
}
