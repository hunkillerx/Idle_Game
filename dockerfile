FROM openjdk:17-jdk-corretto

WORKDIR /app

COPY .mvn/ ./mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]