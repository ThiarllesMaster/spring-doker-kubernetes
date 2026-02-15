📖 Overview

This project demonstrates the evolution of a Spring Boot REST API from a local containerized setup using Docker Compose to a Kubernetes-orchestrated architecture.

The system provides CRUD operations for user management and showcases best practices in:

Containerization

Environment-based configuration

Infrastructure as Code

Kubernetes resource management

Persistent storage handling

The main objective is to illustrate the transition from a development environment to a production-ready cloud-native architecture.

🏗 Architecture Overview
Phase 1 – Docker Compose (Local Development)
Client
   ↓
Spring Boot Container
   ↓
MySQL Container


Multi-container setup

Internal Docker network

Service dependency management

Phase 2 – Kubernetes (Orchestrated Environment)
Client
   ↓
Kubernetes Service
   ↓
Spring Boot Pod
   ↓
MySQL Service
   ↓
MySQL Pod
   ↓
Persistent Volume


Implemented Kubernetes resources:

Deployment

Service

ConfigMap

Secret

Persistent Volume

🚀 Running the Project
🐳 Running with Docker Compose
1️⃣ Clone repository
git clone https://github.com/ThiarllesMaster/spring-doker-kubernetes.git
cd spring-doker-kubernetes

2️⃣ Build and start containers
docker-compose up --build

3️⃣ Stop containers
docker-compose down


The environment will start:

Spring Boot API

MySQL database

Application available at:

http://localhost:8080

☸️ Deploying to Kubernetes
Prerequisites

Kubernetes cluster (Minikube, Kind, etc.)

kubectl configured

1️⃣ Deploy MySQL resources
kubectl apply -f k8s/mysql/

2️⃣ Deploy Application resources
kubectl apply -f k8s/app/

3️⃣ Verify resources
kubectl get pods
kubectl get services

⚙ Environment Configuration

The application supports multiple Spring profiles:

application.yml

application-dev.yml

application-prod.yml

The active profile can be defined using:

SPRING_PROFILES_ACTIVE=dev


In Kubernetes, this is configured using ConfigMap.

Sensitive credentials are managed through Secrets.

📡 API Endpoints
Method	Endpoint	Description
GET	/users	Retrieve all users
GET	/users/{id}	Retrieve user by ID
POST	/users	Create a new user
PUT	/users/{id}	Update existing user
DELETE	/users/{id}	Delete user
📂 Project Structure
src/
 ├── controller/
 ├── entity/
 ├── repository/
 └── resources/

Core Components

UserController → REST endpoints

User → JPA entity

UserRepository → Data persistence layer

🛠 Technologies Used

Java

Spring Boot

Spring Data JPA

MySQL

Docker

Docker Compose

Kubernetes

Maven

🧠 Architectural Decisions

Spring Boot chosen for rapid REST API development

Docker Compose used for local multi-container setup

Kubernetes introduced for scalability and orchestration

ConfigMap & Secrets used for externalized configuration

Persistent Volume implemented to prevent data loss

Stateless application design for horizontal scalability

🔭 Future Improvements

Add Kubernetes Liveness and Readiness Probes

Implement Horizontal Pod Autoscaler (HPA)

Add CI/CD pipeline (GitHub Actions)

Implement automated integration tests

Introduce Helm charts

Add monitoring (Prometheus + Grafana)

📈 What This Project Demonstrates

Understanding of containerized environments

Evolution from local to orchestrated architecture

Infrastructure as Code principles

Kubernetes resource management

Secure configuration handling

Backend development with persistence layer

👨‍💻 Author

Developed by Thiarlle Gomes
Backend Developer | Cloud-Oriented Engineer
