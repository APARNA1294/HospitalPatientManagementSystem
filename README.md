# Hospital Patient Management System

## Overview
The Hospital Patient Management System is a web-based application developed using Java Servlets, JDBC, MySQL, HTML, and CSS. It allows users to manage patient records efficiently through Create, Read, Update, and Delete (CRUD) operations.

## Features
- Register new patients
- View all patient records
- Update patient information
- Delete patient records
- MySQL database integration using JDBC
- User-friendly web interface
- Apache Tomcat deployment

## Technologies Used
- Java
- Java Servlets
- JDBC
- MySQL
- HTML
- CSS
- Apache Tomcat
- Eclipse IDE

## Database Details

### Database Name
HOSPITALDB

### Table Name
PATIENTS

### Columns
| Column Name | Data Type |
|------------|------------|
| id | INT (Primary Key, Auto Increment) |
| patient_name | VARCHAR(100) |
| disease | VARCHAR(100) |
| doctor_name | VARCHAR(100) |
| mobile | VARCHAR(15) |

## Project Structure

HospitalPatientManagementSystem
│
├── src/main/java/com/hospital
│   ├── DBConnect.java
│   ├── RegisterPatientServlet.java
│   ├── ViewPatientsServlet.java
│   ├── EditPatientServlet.java
│   ├── UpdatePatientServlet.java
│   └── DeletePatientServlet.java
│
├── src/main/webapp
│   ├── PatientRegistration.html
│   ├── RegistrationSuccess.html
│   └── ViewPatients.html
│
└── MySQL Database

## CRUD Operations

### Create
Register a new patient and store details in the MySQL database.

### Read
Display all patient records in a tabular format.

### Update
Modify existing patient information.

### Delete
Remove patient records from the database.

## How to Run
1. Install Java JDK.
2. Install Apache Tomcat.
3. Install MySQL Server and MySQL Workbench.
4. Create the database `HOSPITALDB`.
5. Create the `PATIENTS` table.
6. Configure MySQL credentials in `DBConnect.java`.
7. Add MySQL Connector/JAR file to the project.
8. Deploy the project on Apache Tomcat.
9. Run the application in a web browser.

## Output
The application successfully performs patient registration, viewing, updating, and deletion operations using MySQL database connectivity.

## Author
**Aparna Kanamarlapudi**
**B. Tech Electronics and COmmunication Engineering**
