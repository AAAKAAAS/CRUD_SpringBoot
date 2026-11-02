# Student CRUD Application | Spring Boot

A simple **Student Management REST API** built using Java and Spring Boot. This project demonstrates the implementation of basic CRUD (Create, Read, Update, Delete) operations using Spring Data JPA.

## 🚀 Features

- Create a new student.
- Retrieve a student by ID.
- Retrieve all students.
- Update existing student details.
- Delete a student by ID.
- RESTful API architecture.
- Database operations using Spring Data JPA.

## 🛠️ Technologies Used

- **Java** – Programming Language
- **Spring Boot** – Backend Framework
- **Spring Data JPA** – Database Interaction
- **Hibernate** – ORM Framework
- **MySQL** – Database
- **Maven** – Dependency Management
- **Postman** – API Testing

## 📁 Project Structure

```text
CRUDSpring/
│
├── src/
│   └── main/
│       ├── java/com/example/CRUDSpring/
│       │   ├── Controller/
│       │   │   └── StudentController.java
│       │   │
│       │   ├── Service/
│       │   │   └── StudentService.java
│       │   │
│       │   ├── Entity/
│       │   │   └── Student.java
│       │   │
│       │   ├── Repo/
│       │   │   └── StudentRepo.java
│       │   │
│       │   └── CrudSpringApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
```

### 2. Navigate to the Project Directory

```bash
cd CRUDSpring
```

### 3. Configure the Database

Update your `application.properties` file with your database configuration.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Make sure MySQL is running and the database exists.

### 4. Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run the main application class from IntelliJ IDEA.

The application will start at:

```text
http://localhost:8080
```

## 🔗 API Endpoints

Base URL: `/api/students`

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/students` | Create a student |
| GET | `/api/students/{id}` | Get student by ID |
| GET | `/api/students` | Get all students |
| PUT | `/api/students/{id}` | Update student |
| DELETE | `/api/students/{id}` | Delete student |

## 📌 Sample API Requests

### 1. Create Student

**POST** `/api/students`

Request Body:

```json
{
    "name": "Rahul",
    "age": 21,
    "email": "rahul@gmail.com",
    "subject": "Computer Science",
    "rollNo": 101
}
```

### 2. Get Student By ID

**GET** `/api/students/1`

### 3. Get All Students

**GET** `/api/students`

### 4. Update Student

**PUT** `/api/students/1`

Request Body:

```json
{
    "name": "Rahul Sharma",
    "age": 22,
    "email": "rahul@gmail.com",
    "subject": "Java",
    "rollNo": 101
}
```

### 5. Delete Student

**DELETE** `/api/students/1`

## 📚 Concepts Learned

Through this project, I practiced:

- Spring Boot project structure.
- REST API development.
- Dependency Injection.
- Controller-Service-Repository architecture.
- Spring Data JPA.
- Entity mapping.
- CRUD operations.
- HTTP methods and status codes.
- RequestBody and PathVariable annotations.


## 👨‍💻 Author

**Aakash Kumar Singh**

GitHub: [Your GitHub Profile](https://github.com/AAAKAAAS)

---

⭐ If you find this project useful, feel free to star the repository!
