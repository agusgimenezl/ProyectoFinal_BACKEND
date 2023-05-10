# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

FROM amazoncorretto:8-alpine-jdk
COPY target/mgb4-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "/app.jar"]
EXPOSE 8080