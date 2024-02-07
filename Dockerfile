# Use the official OpenJDK 17 base image
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/store-data-api-0.0.1-SNAPSHOT-2024.02.07.11.40.59.jar app.jar

# Expose the port your application will run on
EXPOSE 8082

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]
