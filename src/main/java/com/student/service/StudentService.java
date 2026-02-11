
package com.student.service;
import java.util.*;
import com.student.model.Student;
public interface StudentService{
 void addStudent(Student s);
 List<Student> getAllStudents();
 Student getStudent(int id);
 void updateStudent(Student s);
 void deleteStudent(int id);
}
