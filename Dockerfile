FROM tomcat:8
COPY target/java-example.war /usr/local/tomcat/webapps/HelloWorldSpringBoot.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
