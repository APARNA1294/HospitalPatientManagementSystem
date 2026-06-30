# Hospital Patient Management System

## Project Overview
The Hospital Patient Management System is a web-based application developed using Java Servlets, HTML, JDBC, MySQL, and Apache Tomcat. It helps manage patient records by allowing users to register, view, edit, and delete patient information.

## Features
- Add new patient records
- View all registered patients
- Edit patient details
- Delete patient records
- Store data in MySQL database
- Simple and user-friendly interface

## Technologies Used
- Java
- Java Servlets
- JDBC
- HTML
- MySQL
- Apache Tomcat
- Eclipse IDE

## Database Structure
### Patients Table
| Column Name | Data Type |
|------------|-----------|
| id | INT (Primary Key, Auto Increment) |
| patient_name | VARCHAR(100) |
| disease | VARCHAR(100) |
| doctor_name | VARCHAR(100) |
| mobile | VARCHAR(15) |

## Project Modules
### 1. Patient Registration
Allows users to enter:
- Patient Name
- Disease
- Doctor Name
- Mobile Number

### 2. View Patients
Displays all patient records stored in the database.

### 3. Edit Patient
Updates existing patient details.

### 4. Delete Patient
Removes patient records from the database.

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
    └── HOSPITALDB

## Screenshots
### Patient Registration Page
![Patient Registration](Screenshot%20(257).png)

### Registration Success Page
![Registration Success](Screenshot%20(258).png)

### View Patients Page
![View Patients](Screenshot%20(256).png)

### Database Records in MySQL
![Database Records](Screenshot%20(259).png)

### Edit and Delete Operations
![Edit Delete](Screenshot%20(261).png)

## How to Run

1. Install MySQL and Apache Tomcat.
2. Create the database:

CREATE DATABASE HOSPITALDB;
USE HOSPITALDB;
CREATE TABLE PATIENTS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(100),
    disease VARCHAR(100),
    doctor_name VARCHAR(100),
    mobile VARCHAR(15)
);

3. Configure database connection in `DBConnect.java`.
4. Import the project into Eclipse.
5. Run the project on Apache Tomcat Server.
6. Open:

http://localhost:8080/HospitalPatientManagementSystem/PatientRegistration.html

## Sample Output
- Register Patient Successfully
- View Patient Records
- Edit Existing Records
- Delete Patient Records

## Author
**Aparna Kanamarlapudi**  
B.Tech Electronics and Communication Engineering

## GitHub Repository
Hospital Patient Management System developed using Java Servlets, JDBC, MySQL, and Apache Tomcat for performing CRUD operations on patient records.
