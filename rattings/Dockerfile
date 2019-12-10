# latest oracle openjdk is the basis
FROM openjdk:oracle

# copy jar file into container image under app directory
COPY target/rettings-1.0.0.1.jar app/rettings-1.0.0.1.jar
# expose server port accept connections
#EXPOSE 9966

# start application
CMD ["java", "-jar", "app/rettings-1.0.0.1.jar"]