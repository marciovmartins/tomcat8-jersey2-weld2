FROM tomcat:8.5.4-alpine

MAINTAINER "Marcio Vinicius <marciovmartins@hotmail.com>"

RUN rm -Rf /usr/local/tomcat/webapps/*

COPY ./target/tomcat8-jersey2-weld2-1.0-SNAPSHOT /usr/local/tomcat/webapps/ROOT