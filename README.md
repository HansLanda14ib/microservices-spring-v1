# Microservice Spring Boot Project

This project is a demonstration of a microservices architecture using Spring Boot, Eureka Server, Gateway, and Feign for service discovery, routing, and communication between services.

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/b19454bd-0c41-4775-ba72-4e9e6ef0f9f0)

# Services
## 1. Client Service
### Description
The Client service is responsible for handling client-related operations and functionalities.

#### API Endpoints
* GET /clients: Retrieve all clients
* GET /clients/{id}: Retrieve a specific client by ID
* POST /clients: Create a new client
* PUT /clients/{id}: Update an existing client
* DELETE /clients/{id}: Delete a client by ID
* SEARCH Example : /clients/{id}/voitures

## 2. Voiture Service
### Description
The Voiture service manages operations related to cars

#### API Endpoints
* GET /voitures: Retrieve all vehicles
* GET /voitures/{id}: Retrieve a specific vehicle by ID
* POST /voitures: Create a new vehicle
* PUT /voitures/{id}: Update an existing vehicle
* DELETE /voitures/{id}: Delete a vehicle by ID


# Technologies Used
* *Spring Boot* : Framework for building microservices
* *Eureka Server* : Service registration and discovery
* *Gateway* : Routing and API gateway for incoming requests
* *Feign* : Declarative REST client for communication between services


# Getting Started
## Prerequisites
* Java JDK 17 or later
* Maven dependency management
## Setup
* Clone this repository
* Navigate to the root folder of each service (Client and Voiture)
* Build each service using Maven
* Run Eureka Server
* Run the Gateway
* Run both Client and Voiture services
## Service Communication
The services communicate with each other using Feign. Service instances are registered with Eureka Server, allowing the Gateway to route requests to the appropriate service based on service discovery.

# Usage
You can utilize the provided API endpoints to interact with the services. Use tools like Postman or curl to make requests to the Gateway, which will handle the routing to the respective services.



# SCREENSHOTS
## EUREKA SERVER : 

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/af2b12dc-f29c-4e42-a730-9b92be251333)

## GATEWAY 

### 8088/clients -----> 8888/SERVICE-CLIENT

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/1e828c6c-0e94-49a1-a4bb-9c0ade4e13a3)

### 8089/voitures -----> 8888/SERVICE-VOITURE

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/71f3d138-7f7e-4ff6-8dac-39fc64a3e569)

## MySQL DB added 

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/1171242d-e8fb-4405-9ed3-4e54c94e1f3a)

![image](https://github.com/HansLanda14ib/microservices-spring-v1/assets/100965812/011be3fc-a1ee-44cf-828e-5fd810f7b049)





