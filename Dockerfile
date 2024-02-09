# Use the official OpenJDK 17 base image
FROM openjdk:17

# Set the working directory
WORKDIR /store-api

# Copy the JAR file into the container
COPY target/*.jar store-api.jar

# Expose the port your application will run on
EXPOSE 8081

# Specify the command to run your application
CMD ["java", "-jar", "store-api.jar"]
