# Use an OpenJDK 11 base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy Maven wrapper and pom.xml first to leverage Docker cache for dependencies
COPY mvnw .
COPY pom.xml .
COPY .mvn/ .mvn/

# Give execute permission to the Maven wrapper
RUN chmod +x mvnw

# Download dependencies to cache them
RUN ./mvnw dependency:go-offline

# Copy the rest of the application source code
COPY src/ src/

# Build the application, skipping tests for faster build
RUN ./mvnw clean package -DskipTests

# Expose the port that your app runs on (usually 8080)
EXPOSE 8080

# Define the command to run your app.
# Update the jar file name if it differs from the one below.
CMD ["java", "-jar", "target/traveller-backend-0.0.1-SNAPSHOT.jar"]
