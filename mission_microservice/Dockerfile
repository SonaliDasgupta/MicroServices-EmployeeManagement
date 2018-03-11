FROM java:8
VOLUME /tmp
ADD target/mission_microservice-0.0.1-SNAPSHOT.jar App.jar
EXPOSE 8080
RUN bash -c 'touch /App.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb1/microservices","-Djava.security.egd=file:/dev/./urandom","-jar","./App.jar"] 
