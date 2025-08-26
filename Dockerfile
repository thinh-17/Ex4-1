FROM tomcat:9.0-jdk17

# Xóa app mặc định
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy file WAR từ thư mục build vào Tomcat
COPY build/Ex4-1.war /usr/local/tomcat/webapps/Ex4-1.war


EXPOSE 8080

CMD ["catalina.sh", "run"]