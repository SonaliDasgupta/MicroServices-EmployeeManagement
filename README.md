
# About this Repo

This is the Git repo to follow for Spring Boot and Docker integration, to run microservices.

TO RUN THE PROJECT:

1. Run mvn clean and mvn package on following projects:
    1. reward_microservice
    2. mission_microservice
    3. employee_microservice
    4. demo (service discovery Eureka server)

2. Follow the docker commands instructions in this repo to build and run docker containers of the services.

3. Hit the URLs:
    1. Service Registry: http://localhost:8761 
    2. Reward microservice: http://localhost:8080/reward/
    3. Employee microservice: http://localhost:8081/employee/{employeeId}
    4. Mission microservice: http://localhost:8082/mission/
    
4. Use the above URLs for CURL POST requests and follow the sample data files for posting objects as JSON documents.

5. Be sure to expose the correct ports while running the containers. Follow the docker run commands in the repo for that, or configure your own appropriate ports if afore mentioned ports are busy.



TODO next:

1. Add Netflix Hysterix Circuit Breaker.
2. Integrate the services using MongoDB.
3. Transition Spring Boot project to Scala.

