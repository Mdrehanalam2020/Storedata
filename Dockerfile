FROM openjdk:17
EXPOSE 8082
ADD ./store-data-api-0.0.1-SNAPSHOT.jar store-data-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/store-data-api-0.0.1-SNAPSHOT.jar"]
