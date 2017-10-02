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

### framework & tool

* Web Application framework: Spring Boot https://projects.spring.io/spring-boot/ 
* UI framework: Vaadin Framework https://vaadin.com/framework

* Build tool: Gradle https://gradle.org/
* IDE: IntelliJ IDEA https://www.jetbrains.com/idea/

* plan to use
  * SQL mapper: MyBatis http://blog.mybatis.org/
  * Database: PostgreSQL https://www.postgresql.org/

## Usage

### start application

`./gradlew :demo-ui:bootRun`

access http://localhost:8080/