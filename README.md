📌 Project Overview

This project demonstrates how to update student marks in a MySQL database using Java JDBC.
The program updates marks based on the student ID using PreparedStatement.
This task represents a common UPDATE operation in database-driven Java applications.

🛠 Technologies Used
Java
JDBC (Java Database Connectivity)
MySQL
MySQL Connector/J
IDE:IntelliJ 

📂 Database Details
Database Name: studentdb
Table Name: students
Table Structure
Column	Data Type
id	INT
name	VARCHAR
age	INT
marks	INT

✨ Features
Establish JDBC connection with MySQL
Update student marks using student ID
Uses PreparedStatement to avoid SQL Injection
Displays update status message

⚙️ Prerequisites
Before running the project, ensure:
Java JDK installed
MySQL Server running
MySQL Connector/J added to project
Basic knowledge of Java & SQL

🚀 How the Program Works
Load MySQL JDBC Driver
Establish database connection
Accept student ID and new marks from user
Execute UPDATE query using PreparedStatement
Update record in database
Close the connection

🧑‍💻 Sample Input
Enter Student ID: 1
Enter New Marks: 85

🧑‍💻 Sample Output
Student marks updated successfully!

📂 Project Use Case
This project is useful for:

JDBC beginners
College assignments and practicals
Understanding UPDATE operations in Java

✅ Conclusion
This repository provides a clear and beginner-friendly example of updating student marks using JDBC and MySQL, following best practices for database updates.
