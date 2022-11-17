> [Home](../README.md)

# Common class notes by attendees

## 2 Nov 22, Wednesday

Today's notes taken by : Ilda
Next day's notes will be taken by : ?

**Chapter 1**

Setting IntelliJ IDEA Ultimate edition because the community edition does not support spring boot
We can use free trial for that which is for 30 days

Most of the companies are using IntelliJ, Eclipse is also a good option to use too.

To create a new project for spring boot there is also a website Spring initializr https://start.spring.io/

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

Today's notes taken by : LedianaNext day's notes will be taken by : ?

## 7 Nov 22, Monday

Notes taken by: Ada

### Creating a Spring Boot Web App

When it is created as an Web app it has an embedded server such as Tom Cat and it usually run on port 8080
Listen for HTTP requests from a web client (browser)and it returns static or dynamic content.

**Create the Spring Boot Web App project:**
1.Open IntellIJ or you can created through start.spring.io 2. Click "New Project" 3. Go to Spring Initializr on the left side of the window and give your project a name 4. Choose your location and the group name, package name 5. Select java version 11 and packing **jar** 6. Click Next 7. Choose dependency and click Web, select Spring Web dependency. Finish

The generated project is a regular Maven project they have the pom file, where the dependencies are listed

The video stopped at minute 89. Slide number 8 on the Web App

## 08 Nov 22, Tuesday

Notes taken by: Ada

Introduction to Spring Boot class for new joiners
Here is the link https://github.com/andyolsen/spring-boot-in-3-weeks with the class slides and codes

Explaining web dependencies in pom.xml that are needed for this web app such as spring.framework.web

In the static folder (src/main/resources/static) there's were you put your statics values or html code

On the static folder create an index.html file

```java
<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <title>Home</title>
</head>
<body>
   Hello world!
</body>
</html>
```

Go to the main page inside java folder and add

```
System.out.println("**** BEFORE run() ****");
SpringApplication.run(Demo03WebAppApplication.class, args);
System.out.println(***** AFTER run()****)
```

If you run the application it will run in port 8080 and the TomCat server embedded and the index file
Go to browser and http://localhost:8080/index.html to see your application and you will see the message the content from index.html
Spring Boot has auto configuration so when you run it looks in your class path and it creates a tomcat object for you so it is automatically creating a web server and running it for you.

### Application properties

It is the folder where you initialise your properties. (src/main/resources/application.properties)

server.port=8081 // now the application (TomCat) will run in port 8081

So now it will look like this http://localhost:8081/index.html in your browser
You only have to change the properties only if you want something else, because it has defaults that work properly

Spring Boot it bootstraps your development

We finished chap 03, tomorrow we will start chap 04_Beans_Dependency

## 09 Nov 22, Wednesday

Notes taken by: Ada

### Beans and Dependency Injections

_Download the repository from GitHub https://github.com/andyolsen/spring-boot-in-3-weeks and open demo-04-beans-dependency-injections on IntellIJ_

- A component is a class that spring boot will automatically create a new instance .
- _Annotations_

  - @component
  - @service
  - @repository
  - @controller/@restcontroller

- A bean is an instance, an object
- A depency injection is when one bean is automatically hooked up with another bean

**Why we use dependency injection?**

- Spring boot creates the objects in your project and to point to these objects we use depency inj
  - @autowired -- automatically links objects

Demo package: demo.beans

_We left at minutes 99_

## 10 Nov 22, Thursday

Notes taken by: Ada

Download the git repository https://github.com/andyolsen/spring-boot-in-3-weeks (_Here_ [java-corejava-2210/members/stelina.pema.2210/pages/clone-git-project.md] _you can find how to clone a git repo_)

**Demo 02**
1.Open demo-02-simple-app file from the repository that you downloaded

1. Go to main/java/com/demo02SimpleAppApplication and run the project

**Demo 03**
1.Open demo-03-simple-app file from the repository that you downloaded 2. Go to main/java/com/demo03WebAppApplication and run the project 3. Check the terminal for the port that the web app is running 4. If you want to change what is printed on the main page go to index.html and edit the body

**Demo 04**
1.Open demo-04-beans-dependencyinjection from the repo that you download previously 2. Go to src/main/java/demo/beans/Application and run the file (it will not start the TomCat because it didn't have web-starter dependency)

Create a new java class and name it MyComponent2 in the same folder as MyComponent.java. Copy the classes inside MyComponent and run the application. Without the annotation it will not change anything if it is runned.

Constructors have the name of the class for example (MyComponent.java):

```
@Component
public class MyComponent {

   public MyComponent() {
       System.out.println("MyComponent bean created");
   }
```

### What is TomCat?

Tomcat is a Java HTTP web server environment in which Java code can also run. The default port is 8080, but you can change the default port on resources/application.properties

### What is the difference between Simple App application vs Web Application

On the Web app we have an extra folder inside the resources folder named static that is created by the spring web dependency, that is also another difference between the two projects.
On the pom.xml you can compare the dependency between two projects, so on the web app we have spring-boot-starter-web dependency.

**Exercise:** Make changes on the project and see the results

## 11 Nov 22, Friday

Notes taken by: Ada

Walkthrough to gitHub java-spring-boot-course repository for new joiners

Go to https://github.com/andyolsen/spring-boot-in-3-weeks repository and clone his repository to do so:

1. Copy the code from gitHub
2. Open CMD and type git clone and enter the link hit enter
3. Open the repository in IntellIJ and open the project go to Demos and open the first project
4. Run the project

**Download Java with IntellIJ**
(_if you have an older or newer version than 11 of Java_)
1.Go to file --> New Project --> JDK 2. Click on Download JDK and pick version 11 and JDK 11 and click download. This will download Jav 11 in your machine

**O'Reilly Videos**

Application context contains lot's of beans where some of them are created automatically from spring boot.
and definitely an instance of component.

- When a Spring Boot application starts up, it creates beans and stores them in the "application context"
  _ctx is an application context_

```java spring boot
ApplicationContext ctx = SpringApplication.run(Application.class, args);
MyComponent bean = ctx.getBean(MyComponent.class);
     System.out.println(bean);
```

When you run the application spring boot will look in the entire package and special in the bean folders looking for the component (@Component)

SpringApplication.run displays the following information in your IDEA terminal

```
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
 '  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.5.4)

2022-11-11 20:23:08.723  INFO 3030 --- [           main] demo.beans.Application                   : Starting Application using Java 19.0.1 on Adas-MacBook-Pro.local with PID 3030 (/Users/adadedja/Downloads/spring-boot-in-3-weeks/demos/demo-04-beans-dependencyinjection/target/classes started by adadedja in /Users/adadedja/Downloads/spring-boot-in-3-weeks/demos/demo-04-beans-dependencyinjection)
2022-11-11 20:23:08.724  INFO 3030 --- [           main] demo.beans.Application                   : No active profile set, falling back to default profiles: default
MyComponent bean created
2022-11-11 20:23:09.405  INFO 3030 --- [           main] demo.beans.Application                   : Started Application in 1.156 seconds (JVM running for 2.011)
Hi from MyComponent bean
```

Wackypackage
Error message no such a bean found when a bean is outside the package where the file you are running is
on @SpringBootApplication(scanBasePackages ="wackypackage")

Minute 110 when we stopped the classes 04_beans

## 14 Nov 2022, Monday

Notes taken by: Sahil

- **O'Reilly Videos**
- Classes follow camel case with the **first letter as upper case** letter and the name for the bean with a component class is also camel case **but first letter as lower case letter**. This name can be changed as well by passing the name in the `@component` annotation as a parameter.
- `@scope` defines when is the bean created. by default the scope is `singleton`. Which mean there will only be one instance of it and we will get the same object again and again no matter how many times we call that bean.

- Assignment
  - Create a new component in a new package and try to use this component in main class

We stopped at 114 slide 9

## 15 Nov 2022, Tuesday

Notes take by: Sahil

- **O'Reilly Videos**

- What is service annotation: service annotation is used for classes containing business logic.
- What is repository annotation: repository annotation is used for classes that do CRUD operations in database.
  In the image below we can see when a user hit a url, the request first goes to `rest controller` which pass it to the `service` where all the business logic is present and does some operation on the data which can include passing it to the `repository` if any database operation is required. This is an example of an abstraction where each level of abstraction simplifies things for us.
  ![](../assets/2022-11-15-09-36-04.png)

- Singleton instance are default because of the reason that most of the time when we are creating bean we are creating it for `service` classes and `repository` classes which only have functionalities rather than data.

- `@Lazy` annotation for waiting until the bean is required. When a spring boot application is started a bean is created as part of application startup but using `Lazy` annotation we can avoid creating all beans at once hence decreasing the startup time and creating beans only when they are required. **Lazy Evaluation worth checking out** will clear up a lot of things about this `Lazy` annotation.

- Different types of scopes apart from `singleton` which is default scope

  1.  prototype: used for creating a new instance whenever we try to get the bean.
  2.  request
  3.  session
  4.  application

- Assignemnt:

1. create singleton and prototype beans and print out to show it.
2. show the difference in output when @Lazy annotation is used.

We stopped at slide 12 timestamp 128

## 16 Nov 2022, Wednesday

Notes taken by: Sahil

### First part of the class

- what is Monolith : A monolith architecture is the one where all the services are crammed into one service. For eg. Imagine an application and it does everything for eg. frontened, backend, authentication, APIs, Internal admin panels. This way all the things are crammed into one application and its really hard to manage such applicatoin and as a result came the concept of microservices.

- What is microservices: A microservices architecture is the architecture where a big application is split into multiple small applications with each application serving a specific purpose.

- What is docker: A docker is some sort of virtual machine with bare minimum setup to run the applications. These docker machines can also be customised according to our needs. They are very popular in microservices since they are very light weight and the machines themselves doesn't consume much memory by itself in idle state. **Keep in mind windows docker images can't run on linux and vice-versa, reason being to make this docker images very light weight they use the underlying libraries or host machine. So to run the linux docker image we need the underlying host to be linux and same goes for windows**.

- links shared in the class
  https://learning.oreilly.com/videos/architectural-katas-october-november/0636920631439/
  https://learning.oreilly.com/library/view/building-microservices/9781491950340/
  https://learning.oreilly.com/live-events/microservice-fundamentals/0636920054839/

### O'reilly video

- What are microservices?
  - properties
    1. independent deployability: Ability to deploy a service without needing to deploy other services again. A microservice is different from distribute monolith as in monolith even though the services are distributed but deployment of one service require the deployment of all other services as well.

We stopped at 15 min.

## 17 Nov 2022, Thursday

### O'reilly video
#### Microservices
- arranging microservices around the business domain. For eg. different business domains can be shipping, inventory, customer service, accounts, invoicing
- microservices and domain driven design go together very well.
- If we have independent deployability then changing the version of one of the microservice doesn't mean other microservices would be notified about that change and this problem can be hanlded using backward compability (which means even though we have updraded the version of the microservices it needs to still provide the older services until the version is updated in all the other microservices)
- Domain driven design : is how we model our architechture  and event driven architecture is one type of domain driven design.
- Event driven architecture is the mechanism by which different microservices communicate using events


#### Java Spring Boot
For new joiners
- you can clone [this repository](https://github.com/rumq/java-springboot-course)
- to know how to clone check out [this link](https://github.com/rumq/java-corejava-2210/blob/main/members/stelina.pema.2210/pages/clone-git-project.md)

We stopped at 27

> [Home](../README.md)
