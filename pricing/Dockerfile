#docker build -t agh/ms-pricing:0.0.1-SNAPSHOT .
#docker run --rm -d -p 8282:8282 --network="host" agh/ms-pricing:0.0.1-SNAPSHOT
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]