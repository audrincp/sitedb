FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
COPY src ./src

RUN chmod 777 mvn

RUN ./mvnw package

CMD ["java", "-jar", "target/sitebd.war"]
