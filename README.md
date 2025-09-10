## 📚 Library Management System – Spring Boot Web Application

The **Library Management System** is a **Spring Boot-based** web application developed using **Spring MVC, Spring Data JPA, Thymeleaf, and MySQL/Oracle**. The application manages **students, books, and issue/return records** in a systematic way.  

The workflow is simple: first, students and books are added, then a book can be issued to a student, and finally returned. The book’s availability status is **automatically updated** upon return. The backend uses **Spring Boot controllers and repositories** to handle requests and database operations, while the frontend uses **Thymeleaf HTML templates** such as `add-student.html`, `books.html`, and `issue-book.html`.

### 🔑 Key Features
- Manage students (add, update, delete)  
- Manage books (add, update, delete)  
- Issue books to students  
- Return books with automatic availability update  
- Track issue history  

### 🛠 Tech Stack
- **Backend:** Spring Boot, Spring MVC, Spring Data JPA  
- **Frontend:** Thymeleaf (HTML, CSS, Bootstrap)  
- **Database:** MySQL / Oracle  
- **Architecture:** MVC Pattern  

---

## ✨ Highlights

- Both projects follow a **clean MVC design**.  
- Demonstrates **full-stack Java web development** using two approaches:  
  - Traditional **Java EE with Servlets & JSP**  
  - Modern **Spring Boot with JPA and Thymeleaf**  
- End-to-end implementation of **CRUD operations and entity relationships**.  
- Suitable as **portfolio projects** for Java developers.  

---

## 📂 Project Structure

┣ 📂 src
┃ ┣ 📂 main
┃ ┃ ┣ 📂 java
┃ ┃ ┃ ┗ 📂 com.library
┃ ┃ ┃ ┃ ┣ 📂 controller
┃ ┃ ┃ ┃ ┃ ┗ StudentController.java
┃ ┃ ┃ ┃ ┃ ┗ BookController.java
┃ ┃ ┃ ┃ ┃ ┗ IssueController.java
┃ ┃ ┃ ┃ ┣ 📂 entity
┃ ┃ ┃ ┃ ┃ ┗ Student.java
┃ ┃ ┃ ┃ ┃ ┗ Book.java
┃ ┃ ┃ ┃ ┃ ┗ Issue.java
┃ ┃ ┃ ┃ ┣ 📂 repository
┃ ┃ ┃ ┃ ┃ ┗ StudentRepository.java
┃ ┃ ┃ ┃ ┃ ┗ BookRepository.java
┃ ┃ ┃ ┃ ┃ ┗ IssueRepository.java
┃ ┃ ┃ ┃ ┣ 📂 service
┃ ┃ ┃ ┃ ┃ ┗ StudentService.java
┃ ┃ ┃ ┃ ┃ ┗ BookService.java
┃ ┃ ┃ ┃ ┃ ┗ IssueService.java
┃ ┃ ┃ ┃ ┗ LibraryManagementSystemApplication.java
┃ ┃ ┣ 📂 resources
┃ ┃ ┃ ┣ 📂 static
┃ ┃ ┃ ┃ ┣ 📂 css
┃ ┃ ┃ ┃ ┣ 📂 js
┃ ┃ ┃ ┣ 📂 templates
┃ ┃ ┃ ┃ ┣ add-student.html
┃ ┃ ┃ ┃ ┣ books.html
┃ ┃ ┃ ┃ ┣ issue-book.html
┃ ┃ ┃ ┃ ┣ return-book.html
┃ ┃ ┃ ┣ application.properties
┃ ┣ 📂 test
┃ ┃ ┗ (JUnit test classes)
┣ 📜 pom.xml
┗ 📜 README.md




---

## 🚀 Getting Started
### For Library Management System
1. Clone the project.  
2. Import into your IDE as a **Spring Boot project**.  
3. Configure `application.properties` with **MySQL/Oracle database**.  
4. Run the project using:  
   ```bash
   mvn spring-boot:run

---
## 👤 Author  
Pitta Neelaveni  
Java Developer | Spring Boot & Full Stack Web Application Enthusiast  

