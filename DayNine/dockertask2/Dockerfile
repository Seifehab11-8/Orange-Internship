FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy your jar into the container at /app
COPY target/carShow-0.0.1-SNAPSHOT.jar app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]