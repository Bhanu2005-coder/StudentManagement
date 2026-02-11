
package com.student.dao;
import java.sql.*;
import java.util.*;
import com.student.model.Student;
import com.student.util.DBConnection;
public class StudentDAOImpl implements StudentDAO{
 public void addStudent(Student s){
  try(Connection con=DBConnection.getConnection()){
   PreparedStatement ps=con.prepareStatement("insert into students(name,email,course) values(?,?,?)");
   ps.setString(1,s.getName());
   ps.setString(2,s.getEmail());
   ps.setString(3,s.getCourse());
   ps.executeUpdate();
  }catch(Exception e){e.printStackTrace();}
 }
 public List<Student> getAllStudents(){
  List<Student> list=new ArrayList<>();
  try(Connection con=DBConnection.getConnection()){
   ResultSet rs=con.createStatement().executeQuery("select * from students");
   while(rs.next()){
    list.add(new Student(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("course")));
   }
  }catch(Exception e){e.printStackTrace();}
  return list;
 }
 public Student getStudentById(int id){
  try(Connection con=DBConnection.getConnection()){
   PreparedStatement ps=con.prepareStatement("select * from students where id=?");
   ps.setInt(1,id);
   ResultSet rs=ps.executeQuery();
   if(rs.next())
    return new Student(rs.getInt("id"),rs.getString("name"),rs.getString("email"),rs.getString("course"));
  }catch(Exception e){e.printStackTrace();}
  return null;
 }
 public void updateStudent(Student s){
  try(Connection con=DBConnection.getConnection()){
   PreparedStatement ps=con.prepareStatement("update students set name=?,email=?,course=? where id=?");
   ps.setString(1,s.getName());
   ps.setString(2,s.getEmail());
   ps.setString(3,s.getCourse());
   ps.setInt(4,s.getId());
   ps.executeUpdate();
  }catch(Exception e){e.printStackTrace();}
 }
 public void deleteStudent(int id){
  try(Connection con=DBConnection.getConnection()){
   PreparedStatement ps=con.prepareStatement("delete from students where id=?");
   ps.setInt(1,id);
   ps.executeUpdate();
  }catch(Exception e){e.printStackTrace();}
 }
}
