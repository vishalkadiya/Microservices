FROM openjdk:17

#COPY target/*.jar app.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]