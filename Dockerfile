FROM openjdk:17
EXPOSE 8082
RUN cd /home/ubuntu
ADD ./store-data-api-0.0.1-SNAPSHOT.jar store-data-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/store-data-api-0.0.1-SNAPSHOT.jar"]
