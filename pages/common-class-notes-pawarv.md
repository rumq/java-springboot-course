>[Home](../README.md)

## 2 Nov 22, Wednesday 

Started today at Session 1 at 30 minutes

Stopping at 48 minutes.


## 3 Nov 22, Thursday

### Notes from the Video

`alt + enter` to expand `@SpringBootAppplication`

### Running first Spring Boot application using Maven

First Clone the [Spring Boot in 3 weeks repository](https://github.com/andyolsen/spring-boot-in-3-weeks.git).

```bash
# Clone course repository
git clone https://github.com/andyolsen/spring-boot-in-3-weeks.git
```

Then change to that director and 
```bash
# Go root directory
cd C:\home\git\spring-boot-in-3-weeks\demos\demo-02-simple-app
```
Run the spring-boot command

```bash
# Run spring boot application
mvn spring-boot:run
```

### Running Spring Boot web application using Maven


Go to the right directory

```bash
# Go root directory
cd C:\home\git\spring-boot-in-3-weeks\demos\demo-03-web-app
```
Run the spring-boot command

```bash
# Run spring boot application
mvn spring-boot:run
```
## 4 Nov 22, Friday

### Creating simple Spring Boot project.

Create a simple spring boot project following [02_Creating_Simple_App Pages 4 & 5](https://docs.google.com/presentation/d/1dRzG3eRyW2DAEgPZcUqeC-hp6hvnSVs4/edit#slide=id.p4)

Steps 
- Start IntelliJ, click New Project, and select Spring Initializr
- Specify project info as follows:
  - Enter a suitable project name and location
  - Language - Java
  - Enter a suitable group ID, artifact ID, and package name
  - Project SDK - Java 11
  - Java version - 11
  - Packaging - JAR
  - Then click Next

### Understanding Maven

**Paren Pom** : `org.springframework.boot` (groupId) , `spring-boot-starter-parent` (artifactId)

**Spring Boot dependency** :  `org.springframework.boot` (groupId), `spring-boot-starter`(artifactId)

**Spring Boot Test dependency** : `org.springframework.boot` (groupId), `spring-boot-starter-test` (artifactId)

### Understanding Application code

`@SpringBootAppplication` annotation is equivalent to:
- `@Configuration`
- `@EnableAutoConfiguration`
- `@ComponentScan`
 


>[Home](../README.md)