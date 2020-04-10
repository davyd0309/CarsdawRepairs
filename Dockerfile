FROM adoptopenjdk/openjdk11:alpine-jre
COPY build/libs/*.jar CarsdawRepairs-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/CarsdawRepairs-0.0.1-SNAPSHOT.jar"]