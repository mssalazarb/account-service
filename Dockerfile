FROM gradle:8.10.1-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src/producer
WORKDIR /home/gradle/src/producer
RUN gradle build --no-daemon --stacktrace -x test

FROM openjdk:17-bullseye
EXPOSE 8085
ARG JAR_FILE=build/libs/*.jar
COPY --from=build /home/gradle/src/producer/build/libs/*.jar /home/app.jar
ENV SPRING_PROFILES_ACTIVE=default
ENV APP_NAME=account-service
ENV PORT=8085
ENV DB_HOST=localhost
ENV DB_PORT=5432
ENV DB_NAME=account_service
ENV DB_USER=postgres
ENV DB_PASSWORD=postgres
CMD java -server -Dserver.tomcat.threads.max=200 -Duser.country=EC -Duser.language=es -Duser.timezone=America/Guayaquil -jar /home/app.jar