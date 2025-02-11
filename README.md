# Online Chat Server

## Overview
This project is an online chat server built with **Spring Boot** and **Kotlin**. It provides a **RESTful API** and **WebSocket** support for real-time messaging. The backend utilizes **MongoDB** as the database and supports user authentication, message management, and chat sessions.

## Technologies Used
- **Spring Boot** (Web, WebSocket, MongoDB, Security)
- **Kotlin** (JVM 17)
- **MongoDB** (NoSQL Database)
- **SpringDoc OpenAPI** (API Documentation)
- **Docker** (for MongoDB container management)

## Setup and Installation
### Prerequisites
Ensure you have the following installed:
- **Java 17** (or later)
- **Docker** (for running MongoDB)
- **Maven or Gradle** (for dependency management)

### Running the Server
1. **Clone the repository:**
   ```bash
   git clone https://github.com/NoaGilboa/ChatSdk-server/tree/version1
   cd chat-server
   ```

2. **Start MongoDB using Docker:**
   ```bash
   docker-compose up -d
   ```

3. **Build and run the project:**
   ```bash
   ./gradlew bootRun
   ```
   OR using Maven:
   ```bash
   mvn spring-boot:run
   ```

4. The server will start on `http://localhost:8080`

## API Documentation
The API documentation is available at:
```
http://localhost:8080/swagger-ui/index.html#/
```

## API Endpoints

### User Management
- **Register User**
  - `POST /users/register`
  - Params: `username`, `passwordHash`

- **Login**
  - `GET /users/login`
  - Params: `username`, `password`

- **Get User Details**
  - `GET /users/loadUser`
  - Params: `userId`

- **Get All Users**
  - `GET /users/get-all-users`

- **Logout User**
  - `PUT /users/logout`
  - Params: `id`

- **Delete All Users**
  - `DELETE /users/delete-all-users`

### Messaging
- **Send Message**
  - `POST /messages/send`
  - Params: `chatId`, `senderId`, `receiverId`, `content`

- **Get Messages in Chat**
  - `GET /messages/messages-in-chat/{chatId}`

- **Delete All Messages**
  - `DELETE /messages/delete-all-messages`

### Chat Management
- **Get Chats by User**
  - `GET /chats/user/{userId}`

- **Create or Retrieve Chat**
  - `POST /chats/create`
  - Params: `user1Id`, `user2Id`

- **Delete All Chats**
  - `DELETE /chats/delete-all-chats`

## WebSocket Support
The server also supports real-time communication using WebSocket. Clients should connect to:
```
ws://localhost:8080/chat
```
Messages are sent in JSON format and handled in real-time.

## Running Tests
To run unit tests:
```bash
./gradlew test
```
OR
```bash
mvn test
```

## License
Copyright (c) 2025 Noa Gilboa | Yarden Cherry

## Video demonstration


https://github.com/user-attachments/assets/257d2a3b-c261-4aae-a2ee-0da95e78043d



