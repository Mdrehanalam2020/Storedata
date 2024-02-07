FROM openjdk:17
RUN apt update && apt install maven -y
RUN git clone https://github.com/Mdrehanalam2020/storedata.git
RUN cd storedata && mvn install

FROM tomcat:9-jre11

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=BUILD_IMAGE **/target/*.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
