Spring Compose – REST API with Docker and Kubernetes
Overview

This project consists of a REST API developed using Spring Boot for user management (CRUD operations).

The system was initially containerized using Docker Compose for local execution and later evolved into a Kubernetes-orchestrated architecture.

The objective of this project is to demonstrate the evolution of a simple containerized application into a distributed and scalable solution ready for production environments.

Architecture

Application:
- Spring Boot
- Spring Data JPA
- REST API
- Profiles: dev and prod

Database:
- MySQL
- Persistent Volume in Kubernetes

Containerization:
- Dockerfile for application build
- Docker Compose for local environment

Kubernetes Orchestration:
- Deployment
- Service
- ConfigMap
- Secret
- Persistent Volume

Running with Docker Compose

Build and start:
docker-compose up --build

Stop containers:
docker-compose down

Kubernetes Deployment

Create MySQL resources:
kubectl apply -f k8s/mysql/

Create application resources:
kubectl apply -f k8s/app/

Verify resources:
kubectl get pods
kubectl get services

Environment Configuration

The project uses Spring profiles:
- application.yml
- application-dev.yml
- application-prod.yml

The active profile can be controlled via environment variable:
SPRING_PROFILES_ACTIVE=dev

In Kubernetes, this is configured through a ConfigMap.

Project Structure

src/
 ├── controller/
 ├── entity/
 ├── repository/
 └── resources/

Main components:
- UserController → REST endpoints
- User → JPA entity
- UserRepository → Persistence interface

Implemented Best Practices

- Environment-based configuration separation
- Use of Secrets for credentials
- Persistent storage for database
- Infrastructure as Code (Kubernetes YAML)
- Architecture prepared for scalability

Lessons Learned

- Differences between local and cluster environments
- Externalized configuration with ConfigMap
- Secure credential management
- Persistence in containerized environments
- Declarative deployment with Kubernetes

Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Docker
- Docker Compose
- Kubernetes
- Maven

