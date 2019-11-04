#docker build -t agh/ms-client:0.0.1-SNAPSHOT .
#docker run --rm -d -p 8585:8585 --network="host" agh/ms-client:0.0.1-SNAPSHOT
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]