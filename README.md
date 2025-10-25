<h1 align="center">🔒 File Hider – Java & MySQL Secure File Management System</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Database-MySQL-blue?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Architecture-MVC%20%26%20DAO-green?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Build-Maven-red?style=for-the-badge&logo=apachemaven&logoColor=white" />
</p>

<p align="center">
<b>File Hider</b> is a <b>Java-based secure file management system</b> designed to hide and unhide files with <b>OTP-based authentication</b>.  
It ensures data privacy using <b>MySQL database integration</b> and <b>JavaMail OTP verification</b>, offering an extra layer of security.
</p>

---

## 📌 Project Overview

**File Hider** provides a safe and reliable way to manage sensitive files.  
The system encrypts files, hides them from unauthorized users, and allows recovery through OTP verification.  
It combines **Java**, **MySQL**, and **JavaMail API** to create a powerful file security solution following a **clean MVC + DAO architecture**.

---

## 🚀 Features

✅ **User Authentication & OTP Verification** – Secure login using **email-based One-Time Passwords (OTP)**.  
✅ **File Hiding & Unhiding** – Encrypts and stores files securely in the **MySQL database**.  
✅ **Database Integration** – Uses **JDBC** for efficient database interaction.  
✅ **Modular & Scalable Architecture** – Built using **DAO Pattern** and **MVC Design** for maintainability.  
✅ **Maven Project Structure** – Manages dependencies efficiently using **Apache Maven**.  

---

## 🧩 Tech Stack

| Component | Technology |
|:-----------|:------------|
| **Language** | Java ☕ |
| **Database** | MySQL 🛢️ |
| **Libraries** | JavaMail (OTP), JDBC (Database Connectivity) |
| **Architecture** | DAO Pattern, MVC |
| **Build Tool** | Maven |

---

## 🏗️ Project Structure

fileHider/
├── src/
│   └── main/
│       └── java/
│           ├── dao/        # Data Access Objects for database interactions
│           ├── db/         # Database connection setup
│           ├── model/      # Java classes for Users & File Data
│           ├── service/    # OTP generation & email sending services
│           ├── views/      # User interface and file handling
│           └── Main.java   # Entry point of the application


---

## ⚙️ How It Works

1. 👤 **User Registration/Login:**  
   The user logs in with valid credentials or signs up for a new account.

2. ✉️ **OTP Verification:**  
   On login, an OTP is sent to the user’s email via **JavaMail API**.

3. 🔐 **File Encryption & Hiding:**  
   Once verified, users can securely hide selected files in the database using **JDBC**.

4. 📂 **File Unhiding:**  
   Files can be retrieved and decrypted only by authenticated users.

5. 🧩 **Database Management:**  
   All user credentials and file metadata are stored in **MySQL** using **DAO classes** for structured access.

---


- **MVC Pattern:** Separates business logic, UI, and data access layers.  
- **DAO Layer:** Ensures modular and reusable database operations.  
- **Service Layer:** Handles OTP generation and email delivery.

---

## 🔐 Security Highlights

- 🔒 Email-based OTP Verification for login.  
- 🧑‍💻 Encrypted file storage to prevent unauthorized access.  
- 💾 Secure database handling with parameterized SQL queries.  
- 🧱 Modular design prevents data breaches and maintains scalability.

---

## 🧾 Future Enhancements

- 🧠 **AES Encryption** for stronger file security.  
- ☁️ **Cloud Backup Integration** for remote file access.  
- 📱 **GUI Upgrade** using JavaFX or Swing UI for modern design.  
- 📊 **Activity Logs** to monitor user file operations.  

---

## 📚 Conclusion

The **File Hider Project** is a practical implementation of secure file management using **Java and MySQL**.  
With **OTP authentication**, **data encryption**, and **modular architecture**, it provides a solid foundation for secure information storage systems.

---

## 👨‍💻 Author

**Arghya Chattaraj**  
💼 Java Developer & Software Engineer  
📧 [arghya.chattaraj2003@gmail.com]  
🌐 [www.linkedin.com/in/arghya-chattaraj]  

---

## 🏷️ License

This project is licensed under the **MIT License** — feel free to use, modify, and enhance it for learning or research purposes.

---

## ⭐ Support

If you like this project, consider giving it a **⭐ star** on GitHub — it helps others discover it and supports my work!



