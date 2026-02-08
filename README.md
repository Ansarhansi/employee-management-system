Employee Management System

A console-based Employee Management System developed using Java, JDBC, and PostgreSQL.
The application enables efficient management of employee records by performing CRUD operations through a menu-driven interface.

🚀 Features

Add new employee records

View all employee details

Search employee by ID

Update employee email by ID

Delete employee records

Interactive console-based menu

🛠️ Technologies Used

Java

JDBC

PostgreSQL

Eclipse IDE

Git & GitHub


📁 Project Structure

employee-management-system
│
├── controller
│   └── EmployeeController.java
│
├── dao
│   └── EmployeeDao.java
│
├── entity
│   └── Employee.java
│
├── connection
│   └── GetConnection.java
│
└── README.md

🗄️ Database Details

Database Name: employee_database
Table Name: employee

CREATE TABLE employee (
    e_id INT PRIMARY KEY,
    e_name VARCHAR(50),
    e_salary DOUBLE PRECISION,
    e_loc VARCHAR(50)
);


▶️ How to Run the Project

Clone the repository:

git clone https://github.com/ansarhansi/employee-management-system.git


Open the project in Eclipse IDE

Add PostgreSQL JDBC Driver to the build path

Update database credentials in:

connection/GetConnection.java


Run:

EmployeeController.java

🎯 Learning Outcomes

Hands-on experience with JDBC

Practical understanding of DAO Design Pattern

Real-time database connectivity using PostgreSQL

Improved skills in Java, SQL, and exception handling

Experience building a structured backend application
