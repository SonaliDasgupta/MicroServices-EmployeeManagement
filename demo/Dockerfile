FROM java:8
VOLUME /tmp
ADD target/serviceDiscovery-0.0.1-SNAPSHOT.jar App.jar
EXPOSE 8761
RUN bash -c 'touch /App.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://localhost:27017/microservices","-Djava.security.egd=file:/dev/./urandom","-jar","./App.jar"] 
