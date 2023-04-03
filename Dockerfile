FROM eclipse-temurin:17.0.4.1_1-jre
EXPOSE 8080
ADD target/microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/microDisplayWorkOrderApi-0.0.1-SNAPSHOT.jar","--spring.profiles.active=dev"]