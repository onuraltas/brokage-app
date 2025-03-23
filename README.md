# brokage-app

------------------------------------------------------------------------------------------

-- HOW TO RUN

Spring active profile is set to prod. To change it you should edit application.yaml in resources folder.

There are 3 ways to run this application;

1) Maven Command 
mvn spring-boot:run

2) Java Command
./mvnw clean install
cd target
java -jar .\brokage-1.0.0.jar

3) Docker Container
mvn compile jib:dockerBuild
docker run -p 80:80 brokage:latest

------------------------------------------------------------------------------------------

-- H2 Database

http://localhost/h2-console

JDBC URL;
dev : jdbc:h2:mem:dev
test: jdbc:h2:mem:test
prod: jdbc:h2:mem:prod

------------------------------------------------------------------------------------------

Endpoints can be seen with swagger. 

http://localhost/swagger-ui/index.html

Postman collection is provided as a json file. (brokage_postman_collection.json)

3 different user logins are provided with collection.

After successful login response returns Bearer JWT token as Authorization key in headers.

You should set this JWT token in every request header as Authorization key.

------------------------------------------------------------------------------------------