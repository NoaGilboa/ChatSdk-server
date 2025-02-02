# Build stage
FROM eclipse-temurin:21-jdk-alpine AS builder

WORKDIR /app
COPY . .
RUN chmod +x gradlew
RUN ./gradlew bootJar

# Run stage
FROM eclipse-temurin:21-jdk-alpine AS runner

WORKDIR /app
RUN ls -l

CMD ["./gradlew", "bootRun"]
