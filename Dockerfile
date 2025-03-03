# Use official OpenJDK as base image
FROM openjdk:17

# Set working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY target/moviereview-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
