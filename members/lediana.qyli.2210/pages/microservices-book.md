## Chapter1: "What Are Microservices?"

- **Microservices at a Glance**     
 Microservices are independently releasable services that are modeled around a business domain.They are a type of service-oriented architecture and from the outside, a single microservice is treated as a black box.      
 Microservices embrace the concept of information hiding.Information hiding means hiding as much information as possible inside a component and exposing as little as possible via external interfaces(Encapsulation).

 - **Key Concepts of Microservices:**
   - **Independent Deployability**  
     Independent deployability is the idea that we can deploy microservices independently and to ensure that , we need to make sure our microservices are loosely coupled so we must be able to change one service without having to change anything else. 
   - **Modeled Around a Business Domain**   
     Database(Data)-->Backend(Business Logic)-->Web UI(Presentation). 
   - **Owning Their Own State**     
     This microservices has the ability to decide what is shared and what is hidden, so they have their own states so it's achive independent deployability.
   -  **Size**  
     The concept of size is highly contextual.
   - **Flexibility** 
     Buy you options.
- **The Monolith**
  - The monolithic architecture is a system in which all of the code is deployed as a single process.
  - As a subset of the single-process monolith, the modular monolith is a variation in which the single process consists of separate modules. Each module can be worked on independently, but all still need to be combined together for deployment .
  - A distributed monolith is a system that consists of multiple services, but for whatever
reason, the entire system must be deployed together
  - One of the advantages of monoliths is that allow to reuse the code.
- **Enabling Technology**
  - A log aggregation systems allow you to collect and aggregate logs from across all your services,providing  a central place from which logs can be analyzed, and even made part of an active alerting mechanism.
  -  Containers provide a much more lightweight way to provision isolated execution for service instances, resulting in faster spin-up times for new container instances.
  -  Apache Kafka has become the de facto choice for streaming data in a microservice environment.
- **Advantages of Microservices**
  - Technology Heterogeneity
    We can decide to use different technologies inside each microservices.
  - Robustness
    A component of a system may fail, but as long as that failure doesn’t cascade, you can isolate the problem, and the rest of the system can carry on working.
  - Scaling
    We can scale our applications in a multitude of ways, and microservices can be an effective part of this.
  - Ease of Deployment
  - Organizational Alignment
  - Composability
- **Microservice Pain Points**
   - Developer Experience
   - Technology Overload
   - Cost
   - Reporting
   - Monitoring and Troubleshooting
   - Security
   - Testing
   - Latency
   - Data Consistency





  
