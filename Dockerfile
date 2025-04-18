FROM alpine/git as clone
WORKDIR /app
ARG BRANCH
ARG REPOSITORY
ARG CACHE_DATE=2024-01-09
RUN git clone -b $BRANCH $REPOSITORY

FROM maven:3.9-amazoncorretto-21 as build
WORKDIR /app
COPY --from=clone /app/onlinestore /app
EXPOSE 8085
RUN mvn package -DskipTests

FROM openjdk:22-ea-21-jdk-slim
WORKDIR /app
COPY --from=build /app/core/target/*.jar /app
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar *.jar"]