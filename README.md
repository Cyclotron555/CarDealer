CarDealer - Spring Boot Application

Overview

CarDealer is a Java Spring Boot application designed to manage car listings, integrating with a MySQL database for data storage. The project is structured with a backend API that allows CRUD operations on car inventory, providing a solid foundation for a dealership management system.

Features

🛠 Spring Boot Backend

🗄 MySQL Database Integration

🔄 REST API for CRUD operations

📦 JPA & Hibernate for ORM

🔍 Find cars by model

🔧 Easily extensible for new features

Technologies Used

Java 21

Spring Boot 3.4.3

Spring Data JPA

Hibernate

MySQL

Maven

Database Configuration

Ensure you have MySQL installed and running. Create a database named cardb. Update application.properties with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/cardb?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

Running the Application

Clone the repository:

git clone https://github.com/Cyclotron555/CarDealer.git
cd CarDealer

Build the project:

mvn clean install

Run the application:

mvn spring-boot:run

Access the API at:

http://localhost:8080/cars

API Endpoints

Method

Endpoint

Description

GET

/cars

Get all cars

GET

/cars/{model}

Get car by model

POST

/cars

Add a new car

PUT

/cars/{id}

Update car details

DELETE

/cars/{id}

Delete a car

Future Enhancements

🚀 React Frontend

🛒 Car purchase management

📈 Admin dashboard

🔄 Automated data sync

Contributing

Feel free to fork the repository, submit pull requests, or open issues for feature requests and improvements!

License

This project is licensed under the MIT License.

