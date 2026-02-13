# 🎓 Student Management System

A simple Java-based **Student Management System** built using **Servlet, JSP, JDBC, and MySQL**.
The project is deployed on **Apache Tomcat** and automated using **Jenkins CI/CD pipeline**.

---

## 🚀 Features

* ➕ Add Student
* 📋 View All Students
* ✏ Update Student Details
* ❌ Delete Student
* 🗄 MySQL Database Integration
* 🔄 CI/CD Deployment using Jenkins
* 🌐 Deployed on Apache Tomcat (AWS EC2)

---

## 🛠️ Tech Stack

* Java 8
* Servlet & JSP
* JDBC
* MySQL
* Maven
* Apache Tomcat 9
* Jenkins
* AWS EC2
* Git & GitHub

---

## 📁 Project Structure

```
student-management-system/
│
├── src/main/java/
│   ├── model/
│   ├── dao/
│   ├── service/
│   └── controller/
│
├── src/main/webapp/
│   ├── index.jsp
│   ├── add-student.jsp
│   ├── view-students.jsp
│   └── WEB-INF/
│       └── web.xml
│
├── pom.xml
└── Jenkinsfile
```

---

## ⚙️ How to Run Locally

### 1️⃣ Clone Repository

```
git clone https://github.com/your-username/student-management-system.git
```

### 2️⃣ Build Project

```
mvn clean package
```

### 3️⃣ Deploy to Tomcat

Copy generated WAR file from:

```
target/student-management-system.war
```

Paste into:

```
/opt/tomcat/webapps/
```

Restart Tomcat:

```
/opt/tomcat/bin/shutdown.sh
/opt/tomcat/bin/startup.sh
```

---

## 🌐 Application URL

```
http://<server-ip>:8080/student-management-system/
```

Example:

```
http://54.221.93.58:8080/student-management-system/
```

---

## 🔄 CI/CD Pipeline

The project uses **Jenkins Pipeline**:

1. Pulls code from GitHub
2. Builds using Maven
3. Deploys WAR to Tomcat on EC2
4. Verifies deployment

---

## 🗄 Database Configuration

Update database credentials in:

```
DBConnection.java
```

Example:

```java
String url = "jdbc:mysql://localhost:3306/studentdb";
String username = "root";
String password = "yourpassword";
```

---

## 👨‍💻 Author

Bhanu Chandra
B.Tech CSE (IoT)
Passionate about Java, DevOps & Cloud

---

## 📌 Future Enhancements

* Login Authentication
* Spring Boot Migration
* REST API Support
* Docker Deployment
* Role-based Access

---

## ⭐ If You Like This Project

Give it a ⭐ on GitHub!
