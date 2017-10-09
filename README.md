# vaadin-ddd-demo

demo application by Vaadin Framework.  

## Description

### core design concept

Domain Driven Design.
This application has multi projects.

#### demo-application project

* domain layer: isolating any layers
* application layer: depending on domain layer
* infrastructure layer: depending on domain layer

#### demo-ui project

![mvp-concept](./mvp-concept.png)

* presentation layer: depending on domain & application layer
* oriented MVP architecture
  * Model: not depending on Vaadin, depending on domain layer
  * Presenter: not depending on Vaadin, depending on domain & application layer
  * View: depending on Vaadin and domain layer

### frameworks

* Web Application framework: Spring Boot https://projects.spring.io/spring-boot/ 
* UI framework: Vaadin Framework https://vaadin.com/framework
* SQL mapper: MyBatis http://blog.mybatis.org/

### supported database

* Database: PostgreSQL https://www.postgresql.org/

### libraries and tools

* Lombok https://projectlombok.org/
  * do away with boilerplate code from domain model
  * for resolution accessor and constructor which ui binder require

* Build tool: Gradle https://gradle.org/
* IDE: IntelliJ IDEA https://www.jetbrains.com/idea/

## Usage

### setup database

* install PostgreSql.
* create user + database, and grant all to the user. 

```
postgres=# CREATE USER vaadin_demo_app_user WITH PASSWORD 'abcdefg';
CREATE ROLE
postgres=# CREATE DATABASE vaadin_demo_app;
CREATE DATABASE
postgres=# GRANT ALL ON DATABASE vaadin_demo_app TO vaadin_demo_app_user;
GRANT
```

### start application

`./gradlew :demo-ui:bootRun`

access http://localhost:8080/