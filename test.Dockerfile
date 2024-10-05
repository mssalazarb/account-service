FROM gradle:8.10.1-jdk17-alpine AS build
WORKDIR /app
COPY . ./