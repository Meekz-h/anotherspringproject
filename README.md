# This project is a Java-based web application developed using Spring Boot, designed to manage customer orders for vacation packages. The application leverages several key technologies:

Spring Data JPA for ORM and database interactions
Spring Data REST for building RESTful APIs
MySQL as the relational database
Lombok to reduce boilerplate code
## Project Structure
### The application is organized into the following packages:

Controllers: Contains the REST controllers responsible for handling HTTP requests and routing them to appropriate services.
Entities: Includes the entity classes representing the database models.
DAO (Data Access Objects): Houses the repository interfaces extending JpaRepository, providing data access functionalities with cross-origin support.
Services: Contains service classes that handle business logic, including order processing and validation.
Config: Includes configuration classes, such as RestDataConfig.java, customized for the application.
### Key Features
<b>Service Layer:</b> Developed a service layer to manage customer orders, including a purchase data model, response handling, and order tracking.
<b>REST API:</b> Created RESTful endpoints for order placement, integrated with an Angular front-end.
<b>Validation:</b> Added server-side validation to ensure data integrity for inputs received from the front-end.



