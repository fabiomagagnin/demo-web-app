#FROM openjdk:8
#FROM alpine-oraclejdk8
#FROM openjdk:8-jre-alpine
#FROM pepe:jre8-alpine
FROM frolvlad/alpine-oraclejre8

RUN mkdir -p /usr/src/demo-web-app

WORKDIR /usr/src/demo-web-app

COPY demo-web-app-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

RUN echo $JAVA_HOME $PATH

RUN java -version

CMD ["java","-version"]

ENTRYPOINT ["java","-jar","/usr/src/demo-web-app/demo-web-app-0.0.1-SNAPSHOT.jar"]
