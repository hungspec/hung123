# Stage 1: Build ứng dụng bằng Maven
FROM maven:3.9.3-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml và source code vào container
COPY complete/pom.xml ./
COPY complete/src ./src

# Build executable JAR, bỏ qua test
RUN mvn clean package -DskipTests

# Stage 2: Chạy ứng dụng
FROM eclipse-temurin:17-jdk-slim
WORKDIR /app

# Copy JAR từ stage build sang stage chạy
COPY --from=build /app/target/*.jar app.jar

# Mở cổng 8080
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
