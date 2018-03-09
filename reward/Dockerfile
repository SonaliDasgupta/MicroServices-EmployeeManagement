FROM java:8
VOLUME /tmp
ADD build/libs/reward.jar App.jar
EXPOSE 8080
RUN bash -c 'touch /App.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb1/microserviceblog","-Djava.security.egd=file:/dev/./urandom","-jar","./App.jar"] 
