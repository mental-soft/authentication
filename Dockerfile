FROM openjdk:8-jre-alpine
ADD build/libs/authentication.jar /app/authentication.jar
EXPOSE 8080
CMD java -jar /app/authentication.jar --connection=cont_postgresql