# 💬 Chat Application

A full-stack real-time chat application built using **Spring Boot**, **React**, **MySQL**, and **WebSocket (STOMP + SockJS)**. Users can register, log in securely, and exchange real-time messages through an intuitive chat interface.

---

## 🚀 Features

- User Registration & Login
- JWT Authentication
- Real-time Messaging
- WebSocket Communication
- One-to-One Chat
- Responsive React UI
- Secure REST APIs
- MySQL Database

---

## 🛠 Tech Stack

### Frontend

- React.js
- Tailwind CSS
- Axios
- SockJS
- STOMP.js

### Backend

- Spring Boot
- Spring Security
- Spring WebSocket
- Spring Data JPA
- JWT Authentication
- Maven

### Database

- MySQL

---

## 📂 Project Structure

```
chatApplication
│
├── backend
│   ├── src
│   ├── pom.xml
│   └── ...
│
├── frontend
│   ├── src
│   ├── package.json
│   └── ...
```

---

## ⚙️ Backend Setup

### Clone Repository

```bash
git clone  https://github.com/srikanthreddy-2910/chatApplication.git
```

### Go to Backend

```bash
cd backend
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/chatdb
spring.datasource.username=root
spring.datasource.password=your_password
```

### Run

```bash
./mvnw spring-boot:run
```

## 💻 Frontend Setup

```bash
cd frontend
```

Install dependencies

```bash
npm install
```

Run

```bash
npm start
```

---

## 🔑 Environment Variables

Frontend

```
REACT_APP_API_URL=http://localhost:8080
```

Backend

```
Database URL
Database Username
Database Password
JWT Secret
```

---

## 📄 License

This project is for educational purposes.
