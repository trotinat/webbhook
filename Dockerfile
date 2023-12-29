FROM openjdk:17
WORKDIR /App

COPY /target/Point-of-sale-0.0.1-SNAPSHOT.jar .


ENTRYPOINT ["java", "-jar" , "Point-of-sale-0.0.1-SNAPSHOT.jar"]