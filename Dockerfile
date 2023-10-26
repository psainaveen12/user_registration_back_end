FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/user_registration_back_end.jar /app/user_registration_back_end_docker.jar
EXPOSE 8080
CMD ["java","-jar","-Dspring.profiles.active=docker","user_registration_back_end_docker.jar"]
