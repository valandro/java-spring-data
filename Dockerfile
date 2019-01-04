FROM openjdk:10.0.1-slim
VOLUME /tmp
COPY build/libs/*.jar target/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
EXPOSE 8090
