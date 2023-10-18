##FROM anapsix/alpine-java
##VOLUME /tmp
##ARG user_registration_back_end
##COPY ${user_registration_back_end.jar} user_registration_back_end_app.jar
##ENTRYPOINT ["java","-jar","/user_registration_back_end_app.jar"]
#
FROM maven:3.8.3-openjdk-17 AS build
ARG JAR_FILE=target/user_registration_back_end.jar
COPY ./target/user_registration_back_end.jar user_registration_back_end_app.jar
#ADD target/practice_webapp_1_spring_docker.jar practice_webapp_1_spring_docker.jar
ENTRYPOINT ["java", "-jar","/user_registration_back_end_app.jar"]
#
#FROM openjdk:17
#VOLUME /tmp
#EXPOSE 8088
#ARG JAR_FILE=target/user_registration_back_end.jar
#ADD ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]