# Microsevices 

## Chapter 1

### - Overview <br>
  - Microservices are independently releasable services and an architecture choice. A single microservice is treated like a black box. For example, if the microservice hosts business functionality on one or more network endpoints, the consumers will access this functionality via these networked endpoints.
  - Microservices embrace the concept of information hiding(Encapsulation), which means hiding the informations inside a component and exposing as little as possible via external interfaces.

### - The monolithic architecture <br>
When all functionality in a system must be deployed together, we consider it a monolith.
  - The modular monolith is a variation in which the single process consists of separate modules. Each module can be worked on independently, but all still need to be combined together for deployment.
  - A distributed monolith is a system that consists of multiple services, but for whatever reason, the entire system must be deployed together.


### - Advantages of Microservices
  - Technology Heterogeneity <br>
With a system composed of multiple, collaborating microservices, we can decide to use different technologies inside each one. This allows us to pick the right tool for each job rather than having to select a more standardized, one-size-fits-all approach that often ends up being the lowest common denominator.

  - Scaling <br>
With a large, monolithic service, we need to scale everything together. Perhaps one small part of our overall system is constrained in performance, but if that behavior is locked up in a giant monolithic application, we need to handle scaling everything as a piece. With smaller services, we can scale just those services that need scaling, allowing us to run other parts of the system on smaller, less powerful hardware,

  - Ease of Deployment <br>
With microservices, we can make a change to a single service and deploy it independently of the rest of the system. This allows us to get our code deployed more quickly. If a problem does occur, it can be quickly isolated to an individual service, making fast rollback easy to achieve.


