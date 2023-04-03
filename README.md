# springboot-data-engine-app
[Spring Boot](http://projects.spring.io/spring-boot/) Data Engine.


## Requirements

For building and running the application you need:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 2](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `EngineApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

access swagger in the url http://localhost:8085/swagger-ui.html to test.

access admin h2 in the url http://localhost:8085/h2-console with the user and password configured in the properties to test.