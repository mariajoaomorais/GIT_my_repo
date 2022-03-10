FROM openjdk:17-alpine
COPY ./src/ /src
WORKDIR /src
RUN javac ./academy/mindswap/WebServer.java
#ENV PORT=8002
COPY /out/production/web-server/ /app
COPY ./www/ /app/www
WORKDIR /app
ENTRYPOINT ["java","academy.mindswap.WebSeraver"]