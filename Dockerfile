
FROM amazoncorretto:8-alpine-jdk
COPY target/mgb4-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "/app.jar"]
