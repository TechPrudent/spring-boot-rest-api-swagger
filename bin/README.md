# spring-boot-rest-crud-jpa-mysql
spring boot rest services crud operations using jpa and mysql

====================================
Contact and feedback:


- https://www.youtube.com/channel/UCVyvT1t3p-ciOeInzaSbIcQ

- https://github.com/TechPrudent/

- techprudent91@gmail.com

- https://trello.com/b/8QKy3byG/techprudent

- https://techprudent91.blogspot.com/

- https://www.facebook.com/techprudents/

- https://twitter.com/techprudent

- https://www.linkedin.com/in/tech-prudent-37831216b/

- https://plus.google.com/u/0/114035390968854033062

====================================

spring boot - rest services crud operations - live coding
=========================================================

source code: https://github.com/TechPrudent/spring-boot-rest-crud-jpa-mysql

Requests sample: https://github.com/TechPrudent/spring-boot-rest-crud-jpa-mysql/blob/master/data.json

- crud - create, read, update, delete
- mysql
- jpa
- jdbc
- hibernate
- rest controller
- customer service

dependencies:
- web, lombok, jpa, mysql connector

<maven.test.skip>true</maven.test.skip>

yml:
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/customer?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false
    username: root
    password: admin
    
  jpa:
    hibernate:
      ddl-auto: update
    generate-ddl: true
    show-sql: true
    database-platform: org.hibernate.dialect.MySQL57Dialect
