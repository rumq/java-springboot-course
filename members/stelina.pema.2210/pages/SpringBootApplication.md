# Spring Boot basic tutorial from Amigoscode

Following one of the [tutorials](https://www.youtube.com/watch?v=9SGDpanrc8U) from Amigoscode 

### 1. Spring Initializer 
- Create a new project with Spring Initializer
- Add dependencies (**Spring Web** to build spring web apps, **Spring Data JPA** to connect the application to the database,  **PostgresSQL Driver** a real database, Spring ).



### 2. Create the API Layer (here is where we create the APIs endpoints)
This layer will contain every resource that we need for the APIs
@RequestMapping(path) is an annotation we use to organize the APIs better. Different path for different object (Student, Teacher, Janitor, etc).
@RestController we are telling to spring boot that this is not just a normal class but it's a class that contains rest endpoints.
for the endpoint to serve as a restful endpoint we add @GetMapping
*Create a method of type list here*


### 3. Create the Service Layer (Business Logic)
This layer will communicate with the API layer.
And all the layers of the application need to be separated from each other because the business logic can be very complex and if we need to change something from the database for example, we will change it only on the database layer and we won't touch the business logic layer.


### 4. Depenency Injection
We use @Autowired to inject an object without us needed to initiated the object ourselves. 
On the service layer we will add the @Component to show Spring that this class is a bean and its objects are the ones that need to be injected.

### 5. Connecting with the database
@Entity and @Table to map our student(object) to the database

