# spring-boot-rest-api-swagger
spring-boot-rest-api-swagger for a Customer CRUD rest services with mysql and spring data jpa

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

Spring boot swagger documentation
=================================
Why documentation is required?
Can be versioned?
Multiple swagger documentation under a single UI possbile?

- How to write a rest api
https://github.com/TechPrudent?tab=repositories
	https://github.com/TechPrudent/spring-boot-rest-crud-jpa-mysql
	
- add springfox swagger2 and swagger-ui dependecies
- Configure swagger docket
- Enable swagger
- Provide necessary annotations to the controllers, methods, responses
- provide annotation to api model
- View swagger json generated
- Copy paste into swagger editor to see how it is going to be rendered
- View Swagger ui html
- Add api meta data to swagger docket bean

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
    <scope>compile</scope>
</dependency>

<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
    <scope>compile</scope>
</dependency>
==================================

Downloaded response json from swagger ui for a sample api:
{
  "id": 4,
  "name": "string",
  "contact": "string",
  "gender": "string"
}
