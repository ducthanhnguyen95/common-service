## The requirement of the scenario
Say you are implementing an app a team uses to manage their tasks. One of the
app’s features is allowing the users to leave comments for the tasks. When a user publishes a comment, it is stored somewhere (e.g., in a database), and the app sends an
email to a specific address configured in the app.
We need to design the objects and find the right responsibilities and abstractions
for implementing this feature.
## Summary
- Decoupling implementations through abstractions is a good practice in implementing a class design. Decoupling objects makes implementations easy to
change without affecting too many parts of the application. This aspect makesyour application more easily extended and maintained.
- In Java, we use interfaces to decouple implementations. We also say that wedefine contracts between implementations through interfaces.
- When using abstraction with dependency injection, Spring knows to search for a bean created with an implementation of the requested abstraction.
- You use stereotype annotations on classes for which Spring needs to create instances and add these instances as beans to its context. 
You never use stereotype annotations on interfaces.
- When the Spring context has more beans created with multiple implementations of the same abstraction, to instruct Spring which bean to inject, you can
    + use the @Primary annotation to mark one of them as default, or
    + use the @Qualifier annotation to name the bean and then instruct Spring to inject that bean by name. 
- When we have service responsibility components, we use the @Service stereotype annotation instead of @Component. Likewise, when a component has repository responsibility, we use the @Repository stereotype annotation instead of @Component. This way, we mark the component’s responsibility explicitly, and
we make the class design more comfortable to read and understand.