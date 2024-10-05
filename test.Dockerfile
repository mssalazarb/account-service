FROM gradle:8.10.1-jdk22-alpine AS build
WORKDIR /app
COPY . ./