# 📄 Resume Builder Application

## Overview

A full-stack web application built following the **MVC (Model-View-Controller)** architectural pattern, designed to streamline the creation and management of professional resumes. The application provides complete CRUD functionality, allowing users to create, read, update, and delete resume entries with ease.

## 🎥 Live Demo

**See it in action:** (https://www.youtube.com/watch?v=4Q79J-Yplvw&feature=youtu.be)

## ✨ Key Features

- **Full CRUD Operations** - Create, Read, Update, and Delete resume sections and entries
- **Dynamic CV Generation** - Build professional resumes with real-time updates
- **Secure Authentication** - User registration and login with Spring Security
- **Persistent Storage** - MySQL database integration for reliable data management
- **Responsive Design** - Mobile-friendly interface using Bootstrap
- **RESTful Architecture** - Clean API design following MVC principles

## 🛠️ Technology Stack

### Backend
- **Java 17** - Core programming language
- **Spring Boot** - Application framework
- **Spring MVC** - Web layer architecture
- **Spring Data JPA** - Database abstraction and ORM
- **Spring Security** - Authentication and authorization

### Database
- **MySQL** - Relational database management

### Frontend
- **Bootstrap** - Responsive UI framework
- **Thymeleaf/JSP** - Server-side templating *(implicit from Spring MVC)*

## 🏗️ Architecture

The application follows the **MVC design pattern**:
- **Model** - JPA entities representing resume data
- **View** - Bootstrap-styled templates
- **Controller** - Spring MVC REST endpoints handling business logic

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- MySQL Server
- Maven

### Installation

1. Clone the repository
```bash
git clone [repository-url]
```

2. Configure database connection in `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/resume_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Build and run
```bash
mvn clean install
mvn spring-boot:run
```

## 👩‍💻 Author: Katarzyna Majzel-Pośpiech

Developed as a demonstration of full-stack Java development capabilities using modern Spring Framework technologies.



## 📸 Application Screenshots

User part:

![CV](https://user-images.githubusercontent.com/104032721/229305876-9d99e86d-81b7-462b-833f-8e2123f0cf62.jpg)


![CV work experience](https://user-images.githubusercontent.com/104032721/229306008-630e4045-2049-4a82-9aaf-4361fec65cd6.jpg)

Admin part:
![CVedit](https://user-images.githubusercontent.com/104032721/229305891-a5a05e13-91c5-4b72-ba5b-b4cbe9ee38c8.jpg)

GitHub part:
![CV GitHub](https://user-images.githubusercontent.com/104032721/229305916-40157f06-2040-4992-98bb-0bb98110b398.jpg)
