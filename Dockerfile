FROM openjdk:8-jdk-alpine
ARG JAR_FILE=first-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD ["nohup","java","-jar","first-0.0.1-SNAPSHOT.jar","&"]
