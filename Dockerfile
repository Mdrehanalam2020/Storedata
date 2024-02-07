FROM openjdk:17
EXPOSE 8082
ADD ./store-data-web-client-0.0.1-SNAPSHOT.jar store-data-web-client-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/store-data-web-client-0.0.1-SNAPSHOT.jar"]
