# Junior Backend Engineer Interview

## First round: Recruiter call
 **Questions**

 1. The interview started with a small talk about the weather
 2. Introduce yourself and describe your working experiences
 3. Have you used any other technology apart from the ones you mentioned?
 4. What drew your attention in the job description that made you apply for this position
 5. Are you only interested in doing backend work? What about front end or full-stack?
 6. Do you have any experience with DevOps tools?
 7. What do you expect from the new company?
 8. What do you expect from the new role?
 9. What would you like to find in a team?
 10. What are your salary expectations?
 11. Would you be okay with relocating to where the company is based?
 12. The last 15 minutes of the interview are for your to ask any question to the recruiter/HR manager.



## Second Round: Meet your soon to be Team Leader and the Head of the department
**This round was full of curiosity questions from the interviewers to get to know you better**

1. Introduce yourself shortly
2. The head of department explained the company's services and the tech team structure. 
3. The Team Leader explained what the tech team does in a general point of view without getting into too many details.
4. If you would deploy the application and then you would find out something is not working like it is supposed to, how would you deal with this situation technicaly?
5. If you were the senior in the team would you check the junior's code or would you let them push the code into master without checking?
6. If you were the senior in the team and you would check junior's code, what are the first things you would check?
7. If two colleagues are arguing about which java version is better, which of the colleagues would you support and how would you end their discussion about which java version is the best?
8. If the team will have a discussion about picking a suitable tool for a certain project, which tool would you suggest.
9. What is the difference between unit testing and integration testing?
10. Have you ever had a tough social situation to deal with at work and how did you solve it? Please give a concrete example. 
11. The last 15 minutes are for you to ask questions to the team.


## Third round: Take home task

### The assignment description

The task consists in building a small web application that can provide access to some data via Rest API.

For our web application, we need an endpoint that would allow our users to create a new bus station and also edit,delete
and retrieve an existing one.

A bus station must have a name, coordinates, country code and unique id. You can add other fields if necessary.

Also, the user should be able to find all stations in a country, by providing a country code.

Finally, we want to give users the possibility to find all stations by their position. In particular, we want to provide
an endpoint that returns all the stations that are located inside a given circle measures (circle center coordinates
and max distance from it).

### Requirements

- The project can be done both in Java and Kotlin. You should have all the necessary libraries but feel free to add more
  if needed.
- Data should be persisted in SQL in-memory database.
- Implementation logic should be covered by unit tests.
- Consider performance improvements.
- Use git during development to track progress milestones.
- `./gradlew bootRun` should start the application successfully.
- `./gradlew test` should run tests.

