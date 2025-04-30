# E-Commerce Microservices Application

This is a microservices-based e-commerce backend application built using the Spring ecosystem. It features service discovery, API gateway routing, secure authentication, asynchronous messaging with Kafka, distributed tracing, and containerized infrastructure setup.

| Feature                         | Technology                 |
|-------------------------------|----------------------------|
| Configuration Management      | Spring Cloud Config Server |
| Service Discovery             | Netflix Eureka             |
| API Gateway                   | Spring Cloud Gateway       |
| Synchronous Communication     | OpenFeign, RestTemplate    |
| Asynchronous Messaging        | Apache Kafka               |
| Distributed Tracing           | Zipkin, Spring Actuator    |
| Security                      | Keycloak (OAuth 2.0)       |
| Infrastructure & Orchestration| Docker, Docker Compose     |

## Microservices
- **Config Server**: Centralized configuration management for all services.
- **Discovery Server (Eureka)**: Service registry for dynamic service resolution.
- **API Gateway**: Entry point for all client requests, handles routing and load balancing.
- **Customer Service**: Manages customer profiles.
- **Product Service**: Manages product catalog (CRUD).
- **Order Service**: Manages order creation and tracking.
- **Payment Service**: Processes and validates payments.
- **Notification Service**: Sends emails via Kafka events.


## Setup & Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/cherylcy/spring-ms-ecommerce.git
   cd spring-ms-ecommerce
   ```

2. **Start Services**:
   ```bash
   docker-compose up -d
   ```

3. **Access Points**
- API Gateway: http://localhost:8222
- Eureka Dashboard: http://localhost:8761
- Zipkin UI: http://localhost:9411
- Keycloak: http://localhost:9098


## REST APIs (via Gateway)
| Endpoint                        | Method | Description           |
|---------------------------------|--------|-----------------------|
| `/api/v1/customers`             | POST   | Create a new customer | 
| `/api/v1/customers`             | PUT    | Update a customer     | 
| `/api/v1/customers`             | GET    | Get all customers     | 
| `/api/v1/customers/{id}`        | GET    | Get a customer        | 
| `/api/v1/customers/{id}`        | DELETE | Delete a customer     |
| `/api/v1/products`              | GET    | List all products     | 
| `/api/v1/products`              | POST   | Add a new product     | 
| `/api/v1/orders`                | POST   | Create a new order    | 
| `/api/v1/orders`                | GET    | Get all orders        | 
| `/api/v1/orders/{id}`           | GET    | Get order details     | 


## Project Structure
```
.
├── services/
│   ├── config-server/
│   ├── customer/
│   ├── discovery/
│   ├── gateway/
│   ├── notification/
│   ├── order/
│   ├── payment/
│   ├── product/
└── docker-compose.yml
```
