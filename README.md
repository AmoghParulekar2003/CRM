# Customer Relationship Management (CRM) System

Hello Everyone!

This is a simple Java Backend Project (no GUI) showcasing customer database transactions (CRUD operations) and how the database is managed.

## Technologies Used

1. **Java Spring Boot**: For creating a Java Spring Boot Server on localhost.
2. **Hibernate**: Java-based library used for easy JDBC connectivity.
3. **Postman**: For REST API data transportation.
4. **MySQL**: Database to store Customer records.

## Architecture of this Project

This project comprises five main components:

1. **Postman**: Used for sending and viewing data using GET, POST, PUT, DELETE methods. Basically sending requests and getting responses for the request.
2. **Controller**: Handles requests coming from Frontend/Postman.
3. **Service**: Where we write the business logic code. We define what sort of tasks are supposed to be done with the data.
4. **Data Access Object (DAO)**: Code for doing CRUD operations on Databases. Basically querying the database.
5. **Database**: Place to store the data and records.

## Setup Instructions

1. **Clone the repository**:
    ```sh
    git clone <repository_url>
    cd <repository_directory>
    ```

2. **Configure MySQL Database**:
    - Create a database named `crm`.
    - Update the `application.properties` file with your MySQL database credentials.

3. **Run the Spring Boot Application**:
    ```sh
    ./mvnw spring-boot:run
    ```

4. **Using Postman**:
    - Import the provided Postman collection (if available) to test the API endpoints.

## Example API Requests

- **Create a Customer**:
    ```
    POST /customers
    {
        "name": "John Doe",
        "email": "john.doe@example.com"
    }
    ```

- **Get All Customers**:
    ```
    GET /customers
    ```

- **Update a Customer**:
    ```
    PUT /customers/{id}
    {
        "name": "Jane Doe",
        "email": "jane.doe@example.com"
    }
    ```

- **Delete a Customer**:
    ```
    DELETE /customers/{id}
    ```

I know this is not much of a project, but I got to learn the CRUD operations in Java using Spring Boot and Hibernate.

---

Feel free to modify the instructions and examples based on your actual project setup and requirements.
