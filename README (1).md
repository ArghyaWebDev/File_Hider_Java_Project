
## File Hider 🔒 | Java & MySQL Project
📌 Project Overview

File Hider is a Java-based secure file management system that allows users to hide and unhide files with authentication and OTP verification. It ensures data security by storing files in a MySQL database and implements JavaMail for OTP-based user authentication.
## 🚀 Features
✅ User Authentication & OTP Verification – Secure login using email-based OTP.

✅ File Hiding & Unhiding – Encrypts and stores files securely in MySQL.

✅ Database Integration – Uses JDBC to manage user and file data efficiently.

✅ Modular & Scalable – Follows DAO Pattern & MVC Architecture for clean code structure.

✅ Maven-Based – Uses Maven for dependency management and project structuring.
## 🛠 Tech Stack
Language: Java ☕

Database: MySQL 🛢️

Libraries: JavaMail (OTP), JDBC (Database Connectivity)

Architecture: DAO Pattern, MVC
## 📂 Project Structure
fileHider/src/main/java
 ├── dao            # Data Access Objects for database interactions
 ├── db             # Database connection setup
 ├── model          # Java classes for Users & File Data
 ├── service        # OTP generation & email sending services
 ├── views          # User interface handling
 ├── Main.java      # Entry point of the application
