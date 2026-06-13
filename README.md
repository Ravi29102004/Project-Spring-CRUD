# 🚀 Project Spring CRUD

> A clean and beginner-friendly CRUD application built with **Spring Core**, showcasing how enterprise applications are structured using **IoC**, **Dependency Injection**, and **Layered Architecture**.

---

## 📖 About The Project

This project simulates a simple user management system where users can be created and retrieved through a structured architecture.

Rather than focusing only on CRUD operations, the project emphasizes **Spring Core fundamentals** and demonstrates how objects are managed by the Spring Container.

---

## 🏗️ Architecture

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database Connection
```

Each layer has a dedicated responsibility, making the application modular, maintainable, and scalable.

---

## ✨ Key Features

✔️ Spring Core Configuration

✔️ Dependency Injection (DI)

✔️ Inversion of Control (IoC)

✔️ Constructor Injection

✔️ Bean Management

✔️ ApplicationContext

✔️ Layered Architecture

✔️ Maven Dependency Management

---

## 🛠️ Tech Stack

| Technology    | Purpose                                |
| ------------- | -------------------------------------- |
| Java          | Core Programming                       |
| Spring Core   | Dependency Injection & Bean Management |
| Maven         | Build & Dependency Management          |
| IntelliJ IDEA | Development Environment                |

---

## 📂 Project Structure

```text
src/main/java/com/example

├── Config
│   └── AppConfig

├── Controller
│   └── UserController

├── Service
│   └── UserService

├── Repository
│   └── UserRepository

├── DataBase
│   └── DataBaseConnection

└── MainApp
```

---

## ⚙️ Sample Output

```text
DB Connected (Simulated)

User added:- Ravi
User added:- Rohit

All Users:- [Ravi, Rohit]
```

---

## 🎯 Concepts Practiced

* Spring Beans
* Bean Lifecycle
* ApplicationContext
* Constructor-Based Injection
* Component Scanning
* Layered Design Pattern
* Loose Coupling
* Separation of Concerns

---

## 🚀 Future Enhancements

* Add Update & Delete Operations
* Integrate MySQL Database
* Add Spring Data JPA
* Convert to Spring Boot
* Create REST APIs
* Add Exception Handling
* Implement Unit Testing

---

## 💡 What I Learned

This project helped me understand how enterprise Java applications are built using Spring Framework and how Dependency Injection improves maintainability, scalability, and code reusability.

---

### 👨‍💻 Author

**Ravi Ranjan**

ECE Student • Java Backend Enthusiast • Spring Framework Learner

⭐ If you found this project useful, consider giving it a star!
