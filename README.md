# Spring Boot Course

# Links
- [Pages Home](pages/Home.md)
  
# Day 01 Introduction 

18 Apr 23, Tuesday

We'll be going through these slides and the corresponding demos for this course.

[Welcome](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/00-Welcome.pptx.pdf)

1. [01_Introduction_to_Spring_Boot](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/01_Introduction_to_Spring_Boot.pptx.pdf)
2. [02_Creating_Simple_App](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/02_Creating_Simple_App.pptx.pdf)
3. [03_Creating_Web_App](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/03_Creating_Web_App.pptx.pdf)
4. [04_Beans_Dependency](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/04_Beans_DependencyInjection.pptx.pdf)
5. [05_Injection_Techniques](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/05_Injection_Techniques.pptx.pdf)
6. [06_Configuration_Classes](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/06_Configuration_Classes.pptx.pdf)
7. [07_Spring_Boot_Techniques](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/07_Spring_Boot_Techniques.pptx.pdf)
8. [08_Integrating_Data_Sources](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/08_Integrating_Data_Sources.pptx.pdf)
9. [09_Querying_Modifying_Entities](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/09_Querying_Modifying_Entities.pptx.pdf)
10. [10_Spring_Data_Repositories](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/10_Spring_Data_Repositories.pptx.pdf)
11. [11_Simple_Rest_Services](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/11_Simple_Rest_Services.pptx.pdf)
12. [12_Full_Rest_Services](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/12_Full_Rest_Services.pptx.pdf)
13. [13_Consuming_Rest_Services](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/13_Consuming_Rest_Services.pptx.pdf)
14. [14_Messaging_Kafka](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/14_Messaging_Kafka.pptx.pdf)
15. [15_Containerization](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/15_Containerization.pptx.pdf)
16. [16_SpringCloudMicroservices](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/16_SpringCloudMicroservices.pptx.pdf)
17. [17_Authentication_OAUTH2](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/17_Authentication_OAUTH2.pptx.pdf)
18. [18_Testing](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/18_Testing.pptx.pdf)

We've gone through the first 3 today, and looked at the 4rth Bean injection briefly. We'll start from there in the next class.

Today's meeting is recorded. You can find it here [Spring Boot Day 01 Introduction](https://drive.google.com/file/d/1Y66X-1sJSfrGhCemM0Ggh50nbCrNu8mj/view?usp=share_link).

# Day 02 Bean Dependency

20 Apr 23, Thursday

Today we've gone through [04_Beans_Dependency](https://github.com/rumq/spring-boot-in-3-weeks/blob/master/slides/pdfs/04_Beans_DependencyInjection.pptx.pdf).

### Assignments 
1. Go through the article [Dependency Injection Demystified](https://www.jamesshore.com/v2/blog/2006/dependency-injection-demystified)
2. Go through the article [Composition, Aggregation, and Association in Java](https://www.baeldung.com/java-composition-aggregation-association).
3. Pick a domain to build your Spring Boot app and start implementing what we are learning in the class. You'll show your app in the next class.
4. Go through the slides until 06_Configuration_Classes and run ALL the corresponding demos while you are going through the slides.
5. Write notes on the following in the corresponding markdown files
   1. What's the difference between a Framework and a Library? [Q001](Q001FrameworkVsLibary.md)
   2. What's a Bean? [Q002](Q002WhatsABean.md)
   3. What's a Component? [Q003](Q003WhatsAComponent.md)
   4. What's Singleton? [Q004](Q004WhatsASingleton.md)
   5. What's Singleton Scope and Prototype Scope? [Q005](Q005SingletonVsPrototypeScope.md)

Today's meeting is recorded. You can find it here [Spring Boot Day 02 Bean Dependency](https://drive.google.com/file/d/1EtrYeZHOkxTqGdNoDig-sBKhwwvMpy6z/view?usp=share_link).

# Day 03 Basics Chapters 1 to 4

25 Apr 23, Tuesday

We've started looking at this example [pawarv-demo-02-basics](https://github.com/rumq/spring-boot-in-3-weeks/tree/master/pawarv/pawarv-demo-02-basics).

We've seen that we need the following two dependencies in our `pom.xml` to enable 'live reload', i.e., the application restarts whenever we make any changes. 
This helps us to see the changes we make in the code without having to restart the application manually.

```xml
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-devtools</artifactId>
   <optional>true</optional>
</dependency>
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```

Assignment:

1. Go through the assignments from Day 02. Write answers to the questions in the corresponding markdown files Q001 to Q005.
2. Try to understand the code in the example `pawarv-demo-02-basics` for the print statements until `08C`. 
Come with questions for the class.


Today's meeting is recorded. You can find it here [Spring Boot Day 03 Basics Chapter 1 to 4](https://drive.google.com/file/d/1zsJtVfgeVuPQa3KpOBwRBmbcbu15hLq8/view?usp=share_link).

# Day 04 Exercise on Hospital Domain

27 Apr 23, Thursday

In the class we've started exercising the concepts we've learned from chapters 1 to 4 on the Hospital domain.

We've done until 002 getting bean by type.

We'll continue continue from there in the next class.


Assignment:

1. Try exercising 001 through to 008C on your domains.
2. See the video mentioned in the following documents.
   1. [Object Equality](https://github.com/rumq/java-corejava-course/blob/main/pages/ObjectEquality.md)
   2. [String Intering](https://github.com/rumq/java-corejava-course/blob/main/pages/StringIntern.md)

Today's recording [Day 04 Exercise on Hospital Domain](https://drive.google.com/file/d/1SLYeBkIYACke3z9QpGpGcKS2AJEZDnVa/view?usp=share_link)

# Day 05 Scope Autowiring and Constructor Injection

02 May 23, Tuesday

In this class we exercised prototype component, dependency injections (@Autowired) and constructor injection.

We've done until 07 Constructor injection

We'll continue from there in the next class.


Assignment:
1. Make the toString() method on the domain class more presentable using ```String.format``` and ```%s``` 
2. Try exercising 08 Qualifier, Collection, Map injection. Make the code ready on your personal domain for the next class.

Today's recording [Day 05 Scope Autowiring and Constructor Injection](https://drive.google.com/file/d/1Y3LHAWUr9cS98DieaRuur_yd_IB9we5A/view?usp=sharing)

# Day 06  Injection techniques

In this class we have done 08 exercising collection, map and other injection techniques.

We've partially done 09 Injecting values.

Assignment:
1. Try exercising 09 Injecting values.
2. Read the slides 

Today's recording [Day 06 Injection Techniques](https://drive.google.com/file/d/1L6Mr5gjXsKK-etgta0m8FE2IbdQbysCa/view?usp=share_link)

# Day 07 ch04 Bean Dependency Injection

In this class we continued with 04_Beans_DependencyInjection.

We looked at some more examples of injecting values from [pawarv-demo-02-basics](https://github.com/rumq/spring-boot-in-3-weeks/tree/master/pawarv/pawarv-demo-02-basics).

Later we looked at `BankService` and `BankRepository` examples from [demo-04-beans-dependencyinjection](https://github.com/rumq/spring-boot-in-3-weeks/tree/master/demos/demo-04-beans-dependencyinjection)

You can look at the diagram from the class `3 Layers of a typical application ` below :

![here](assets/BankService.png)



Assignments:
1. Do the assignment from 04_Beans_DependencyInjection slide.
2. Try recreating the BankService and BankRepository example in your chosen domain. Look at the example in this repository [pv-demo-04-beans-dependencyinjection](code/pv-demo-04-beans-dependencyinjection/README.md) for a better understanding..


Today's recording [Day 07 ch04 Bean Dependency Injection](https://drive.google.com/file/d/1TAr-eDEJNZmUlZW62VdvKZcj1ZMe7LCR/view?usp=share_link).

# Day 08 Recap

We have done a recap of the topics we have covered so far.

You'll also see how to create the constructor and the toString() method using IntelliJ IDEA generate command `ctrl-N`  or `command-N` for Mac.

We looked at the example [pawarv-demo-02-basics](https://github.com/rumq/spring-boot-in-3-weeks/tree/master/pawarv/pawarv-demo-02-basics) and recreated field and constructor injection in Restaurant domain.

Assignments:

If you have not done them already, go through the assignments from the previous classes and complete them.
Especially these ones :

1. Day 07 1 & 2
2. Day 06 1 & 2
3. Day 05 2
4. Day 04 2
5. Day 02 4

Today's recording [Day 08 Recap](https://drive.google.com/file/d/1gmf9lSF8JN_0QsUQil_EtWeGWS7PbJ3z/view?usp=share_link).


