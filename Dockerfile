FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/calculator-project-1.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
