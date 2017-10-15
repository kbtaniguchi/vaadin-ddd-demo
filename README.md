# vaadin-ddd-demo

Demo application with DDD and MVP by Spring Boot and Vaadin Framework8.

## Description

### frameworks

* Web Application framework: Spring Boot https://projects.spring.io/spring-boot/ 
* UI framework: Vaadin Framework https://vaadin.com/framework
* SQL mapper: MyBatis http://blog.mybatis.org/

### supported database

* PostgreSQL https://www.postgresql.org/

### tools

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

`./bootRun.sh`

access http://localhost:8080/

## Wiki

more information refer to https://github.com/bububu10/vaadin-ddd-demo/wiki
