# Use the official OpenJDK 17 base image
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/*.jar app.jar

# Expose the port your application will run on
EXPOSE 8082

# Specify the command to run your application
CMD ["java", "-jar", "app.jar"]
