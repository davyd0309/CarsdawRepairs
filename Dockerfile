FROM openjdk:latest
COPY build/libs/*.jar CarsdawRepairs-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/CarsdawRepairs-0.0.1-SNAPSHOT.jar"]