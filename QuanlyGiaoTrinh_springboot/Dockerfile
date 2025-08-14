# Stage 1: Build ứng dụng bằng Maven
FROM maven:3-openjdk-17 AS build
WORKDIR /app

# Copy file cấu hình Maven và source code vào container
COPY pom.xml .
COPY src ./src

# Build ứng dụng (bỏ qua test)
RUN mvn clean package -DskipTests

# Stage 2: Chạy ứng dụng
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy file WAR/JAR từ stage build sang stage run
COPY --from=build /app/target/DrComputer-0.0.1-SNAPSHOT.war drcomputer.war

# Mở cổng 8080
EXPOSE 8080

# Lệnh chạy ứng dụng
ENTRYPOINT ["java", "-jar", "drcomputer.war"]
