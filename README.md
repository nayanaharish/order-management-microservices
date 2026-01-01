# Order Management Microservices System

## Overview
This project implements an Order Management System using a microservices architecture.
The goal of the project is to design, implement, and rigorously test independent services
using Spring Boot, with a strong emphasis on automated testing and research-oriented
software quality practices.

The project is being developed incrementally, following testable and maintainable
microservice design principles.

---

## Microservices Architecture
The system is composed of the following microservices:

- User Service (implemented)
- Product Service (planned)
- Order Service (planned)
- Notification Service (optional, future work)

Each microservice is independently deployable and testable.

---

## User Service (Current Implementation)

### Responsibilities
The User Service is responsible for:
- Managing user data
- Creating users
- Fetching user information

### REST Endpoints
| Method | Endpoint        | Description              |
|--------|-----------------|--------------------------|
| POST   | `/users`        | Create a new user        |
| GET    | `/users`        | Fetch all users          |
| GET    | `/users/{id}`   | Fetch user by ID         |

---

## Project Structure

order-management-system
├── user-service
│ ├── controller
│ ├── service
│ ├── repository
│ ├── entity
│ └── test
│ ├── controller
│ └── service
├── product-service (planned)
├── order-service (planned)
└── README.md



The project follows a layered architecture separating concerns between
controller, service, repository, and entity layers.

---

## Testing Strategy

Testing is integrated throughout development rather than added later.

### Unit Testing
- **Service Layer**
  - Tested using JUnit 5 and Mockito
  - Repository interactions are mocked
  - Business logic is validated independently

- **Controller Layer**
  - Tested using Spring MockMvc (`@WebMvcTest`)
  - Service layer is mocked
  - HTTP request/response mapping is validated

### Testing Tools
- JUnit 5
- Mockito
- MockMvc

This approach ensures high testability, reliability, and maintainability.

---

## Design Decisions

- Service interfaces were intentionally avoided to reduce unnecessary abstraction,
  as each microservice currently has a single implementation.
- Testing was prioritized alongside development to support clean architecture
  and research-oriented experimentation.

---

## Future Work

Planned next steps include:
- Implementing Product Service and Order Service
- Integration testing using Test Containers
- Contract testing between microservices
- CI/CD pipeline using GitHub Actions
- Research-oriented evaluation of microservice reliability and testing effectiveness

---

## Author
Developed as part of a research-focused learning project on microservices
architecture and automated testing using Spring Boot.
