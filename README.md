# To-Do List Application

This is a simple To-Do list application built using Spring Boot. It includes functionality to create, read, update, and delete (CRUD) To-Do items. The application uses Spring Data JPA for data persistence and an H2 in-memory database.

## Features

- Create a new To-Do item
- Retrieve all To-Do items
- Retrieve a specific To-Do item by ID
- Update an existing To-Do item
- Delete a To-Do item by ID

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/ToDo-Test.git
    cd ToDo-Test
    ```

2. Build the project using Maven:
    ```bash
    mvn clean install
    ```

3. Run the application:
    ```bash
    mvn spring-boot:run
    ```

### Accessing the Application

- The application will start on `http://localhost:8080`.
- The H2 database console is available at `http://localhost:8080/h2-console`.

### API Endpoints

#### Retrieve All To-Dos
- **URL**: `/api/todos`
- **Method**: `GET`
- **Description**: Retrieves all To-Do items.

#### Retrieve a To-Do by ID
- **URL**: `/api/todos/{id}`
- **Method**: `GET`
- **Description**: Retrieves a specific To-Do item by its ID.

#### Create a New To-Do
- **URL**: `/api/todos`
- **Method**: `POST`
- **Headers**:
  - `Content-Type: application/json`

- **Body**:
  ```json
  {
    "title": "Test To-Do",
    "completed": false
  }
  ```
- **Description:** Creates a new To-Do item.

#### Update an Existing To-Do
- **URL:** `/api/todos/{id}`  
- **Method:** `PUT`  
- **Headers:**  
  - `Content-Type: application/json`

- **Body:**
  ```json
  {
    "title": "Updated Test To-Do",
    "completed": true
  }
  ```

#### Delete a To-Do
- **URL:** `/api/todos/{id}`  
- **Method:** `DELETE`  
- **Description:** Deletes a To-Do item by ID.
