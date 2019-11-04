#docker build -t agh/ms-details:0.0.1-SNAPSHOT .
#docker run --rm -d -p 8181:8181 --network="host" agh/ms-details:0.0.1-SNAPSHOT
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]