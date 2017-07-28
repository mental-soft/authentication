FROM mental/jre
ADD build/libs/authentication.jar /app/authentication.jar
EXPOSE 10020
CMD java -jar /app/authentication.jar --connection=cont_postgresql