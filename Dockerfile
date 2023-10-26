FROM eclipse-temurin:17-jdk-alpine
WORKDIR /user-app
COPY target/user_registration_back_end.jar user_registration_back_end_docker.jar
EXPOSE 8080
CMD ["java","-jar","user_registration_back_end_docker.jar"]
