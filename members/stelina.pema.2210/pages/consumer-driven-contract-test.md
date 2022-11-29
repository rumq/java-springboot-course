# What is contract testing?

On a broad level, contract testing can be thought of as testing (and therefore guaranteeing) the communication layer between services. Contract testing tests that any pair of dependent services can properly send and decode messages between each other, but doesn’t test the services’ internal logic. As such, contract testing exists somewhere on the boundary between integration testing and end-to-end testing.

Let’s get some definitions out of the way. There are two main types of actors in contract testing, Providers and Consumers. The Provider is an application responsible for publishing an API; a Consumer of the Provider is another application using (consuming) said API. The Consumers of a Provider will always have basic expectations of the API, such as:

What endpoints can I use?
What input do the endpoints take?
What does the output look like?
Or, more simply,

How does the API work?
Consumer-driven contract testing is a way to formalize these expectations into a contract between each Consumer-Provider pair. Once this contract is established, contract testing ensures, automatically, that the contract doesn’t break unexpectedly.

[website reference](https://medium.com/kreuzwerker-gmbh/introduction-to-consumer-driven-contract-testing-3a130c8c2ea0)