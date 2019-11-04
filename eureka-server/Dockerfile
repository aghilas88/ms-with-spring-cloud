#docker build -t agh/eureka-server:0.0.1-SNAPSHOT .
#docker run --rm -d -p 9102:9102 --network="host" agh/eureka-server:0.0.1-SNAPSHOT
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]