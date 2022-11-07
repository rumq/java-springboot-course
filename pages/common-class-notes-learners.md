>[Home](../README.md)

# Common class notes by attendees

## 2 Nov 22, Wednesday 

Today's notes taken by : Ilda
Next day's notes will be taken by : ?


**Chapter 1**

Setting IntelliJ IDEA Ultimate edition because the community edition does not support spring boot 
We can use free trial for that which is for 30 days

Most of the companies are using IntelliJ, Eclipse is also a good option to use too.

To create a new project for spring boot there is also a website Spring initializr  https://start.spring.io/

You can choose 
Project : Maven
Language: Java
Spring boot: 2.7.5 
Project Metadata : Fill in the fields.


**Chapter 2**

Create a simple app using IntelliJ
Yellow -java code
Blue- configurations

IntelliJ Java dependencies that we should have installed 
- JDK (e.g. JDK 11)
- Set JAVA_HOME to the JDK folder
- PATH to include the JDK binary folder


Create a new project 
- Enter a suitable name
- Location 
- Language: Java
- Type: Maven
- Group id : the name of the company
- artifact id: is the name of the jar file
- Package name
- Project SDK: is the JDK version (version 11)
- Always choose the jar option - so it can be a complete a stand alone project


In intelliJ there is a Spring Initializr that we can use to create our project.

Aplication Structure
Maven project with a pom.xml file with the information of your project.


Exercise - create the basic spring app using the spring initilizer website
See if you are able to run it using maven.

## 3 Nov 22, Thursday

Today's notes taken by : Stelina
Next day's notes will be taken by : ?

1. **The application structure (continuation of yesterday's notes)**
   - We can find a test Spring Boot class under the test folder that is called Application in the video class. Inside there we can see an anotation @SpringBootApplication which is equivalent to three separate annotation (@Configuration, @EnableAutoConfiguration, @ComponentScan). 

2. **Run the application**
   - Open the terminal on IntelliJ and there type: mvn spring-boot:run. If you don't have maven installen in your machine then you can type: mvnw spring-boot:run . When we run the application a lot of configurations happen and that's why it takes a lot of time for the Spring Boot applications to start. Another way to run the application is to click with the left side of your mouse and pick the "Run" option. 

3. **How to create a web application (demo 3 on GitHub)**
   - Most Spring Boot applications are web applications. 
  ![webapp.png](../assets/webapp.png)
   - Create a new Spring Boot application on IntelliJ and make sure to add the Spring Web dependency on the Dependencies section.

4. **The structure of the Web Application**

The video stopped at minute 73.


## 4 Nov 22, Thursday

Today's notes taken by : Lediana
Next day's notes will be taken by : ?


## 7 Nov 22, Thursday

Notes taken by: Ada
s
Creating a Spring Boot Web App

When it is created as an Web app it has an embeded server such as Tom Cat and it usually run on port 8080
Listen for HTTP request from web client (browser)and it return static or dynamic content. 

**Create the Spring Boot Web App project:**
1.Open IntellIJ or you can created through start.spring.io
2. Click "New Project"
3. Go to Spring iNtializr on the left side of the window and give your project a name
4. Choose your location and the group name, package name
5. Select java version 11 and packing **jar**
6. Click Next 
7. Choose dependency and click Web, select Spring Web dependency. Finish

Change the version of the package to avoid the bug in spring boot

The generated project is a regulare Maven project they have the pom file, where the dependencies are listed 

The video stopped at minute 89. Slide number 8 on the Web App







>[Home](../README.md)