# Factory Pattern with Caching Example

This project demonstrates the usage of the Factory Design Pattern with caching in a Spring Boot application.

## Introduction

The Factory Design Pattern is a creational pattern that provides an interface for creating objects without specifying their concrete classes. In this project, we utilize the Factory Pattern to create instances of `Product` objects (`ConcreteProductA` and `ConcreteProductB`) based on a given type. Additionally, we implement caching to improve performance by reusing already created objects.

## Features

- Spring Boot application showcasing Factory Design Pattern with caching.
- `ProductFactory` class responsible for creating instances of `Product` objects (`ConcreteProductA` and `ConcreteProductB`), using a HashMap for caching.
- `TestController` class with a RESTful endpoint to demonstrate the usage of the Factory Pattern with caching.
  
### Usage of HashMap for Caching

In the `ProductFactory` class, a HashMap is used to implement caching of `Product` objects. Here's how it works:

1. **Caching Mechanism**: The `ProductFactory` checks if a product of a certain type is already cached in the HashMap before creating a new instance.

2. **Efficient Lookup**: HashMap provides efficient lookup based on the product type. If the product is found in the cache, the cached instance is returned directly.

3. **Creation and Caching**: If the product is not found in the cache, a new instance of the product is created and added to the HashMap cache, associating it with the corresponding type as the key.

4. **Performance Improvement**: Subsequent requests for the same product type can then be satisfied by retrieving the cached instance from the HashMap, improving performance by avoiding redundant object creation.

### Advantages of HashMap for Caching

- **Fast Access**: HashMap provides constant-time performance for basic operations like put and get, making it ideal for fast retrieval of cached objects.
- **Key-Value Mapping**: HashMap allows associating each cached object with a unique key, enabling efficient lookup and retrieval.
- **Dynamic Size**: HashMap dynamically resizes itself to accommodate more entries as needed, ensuring efficient memory usage and scalability.
- **Flexible Caching**: HashMap allows for flexible caching strategies, such as time-based or size-based eviction, by modifying the caching logic within the `ProductFactory`.
<!-- - **Thread-Safety**: While HashMap itself is not thread-safe, it can be made thread-safe using synchronization or by using ConcurrentHashMap, which provides concurrent access to the map. -->

## Usage

To run the application locally:

1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Maven: `mvn clean install`.
4. Run the application: `java -jar target/<project-name>.jar`.
5. Access the endpoint: `http://localhost:8080/api/v1/test-factory-pattern-with-caching`.

## Prerequisites

- Java 17 or higher
- Maven
- 
## Contact

For any questions or feedback, feel free to reach out:
- Email: hamidreza.shahian@gmail.com
 
