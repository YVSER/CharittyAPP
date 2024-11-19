FROM openjdk:17
ENV JAVA_JAR=target/*.jar
COPY ${JAVA_JAR} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]