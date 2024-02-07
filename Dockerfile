FROM openjdk:17 AS BUILD_IMAGE
RUN git clone https://github.com/Mdrehanalam2020/storedata.git
RUN cd storedata && mvn install

FROM tomcat:9-jre11

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=BUILD_IMAGE **/target/*.jar /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
