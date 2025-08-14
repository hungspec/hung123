# Stage 1: Build với Maven
FROM maven:3-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.war app.war

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.war"]
