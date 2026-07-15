# Employee Management System

## 📌 Overview
This is a simple Employee Management System developed using Spring Boot and MySQL. It performs basic CRUD (Create, Read, Update, Delete) operations through REST APIs.

## 🚀 Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Postman

## ✨ Features
- Add Employee
- View All Employees
- View Employee by ID
- Update Employee Details
- Delete Employee

## 📁 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.example.demo
│   │       ├── DemoApplication.java
│   │       ├── User.java
│   │       ├── UserRepository.java
│   │       ├── UserController.java
│   │       └── LoginController.java
│   └── resources
│       └── application.properties
```

## 🌐 REST APIs

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/users` | Add User |
| GET | `/users` | Get All Users |
| GET | `/users/{id}` | Get User By ID |
| PUT | `/users/{id}` | Update User |
| DELETE | `/users/{id}` | Delete User |

## 🗄️ Database

Database: MySQL

Table: `user`

Columns:

- id
- name
- email
- department
- salary

## ▶️ How to Run

1. Clone the repository
2. Create a MySQL database named `employee_db`
3. Update `application.properties` with your MySQL username and password
4. Run the Spring Boot application
5. Test APIs using Postman

## 👨‍💻 Author

Teja Sai
