# Stage 1: Build ứng dụng với Maven
FROM maven:3.9.4-eclipse-temurin-17 AS build
WORKDIR /app

# Copy file pom.xml và source code
COPY complete/pom.xml .
COPY complete/src ./src

# Build ứng dụng, bỏ qua test
RUN mvn clean package -DskipTests

# Stage 2: Chạy ứng dụng
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy file JAR từ stage build
COPY --from=build /app/target/*.jar app.jar

# Mở cổng 8080
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
