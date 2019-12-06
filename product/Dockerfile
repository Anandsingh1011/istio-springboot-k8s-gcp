# latest oracle openjdk is the basis
FROM openjdk:oracle

# copy jar file into container image under app directory
COPY target/product-1.0.0.1.jar app/product-1.0.0.1.jar
# expose server port accept connections
#EXPOSE 9966

# start application
CMD ["java", "-jar", "app/product-1.0.0.1.jar"]