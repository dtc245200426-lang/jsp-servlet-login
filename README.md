# JSP Servlet Login
Java 17, Maven WAR, Jakarta Servlet 6 và Tomcat 10.1.

Chạy `mvn clean package`, copy `target/jsp-servlet-login.war` vào `webapps` của Tomcat và khởi động server.
Mở http://localhost:8080/jsp-servlet-login/.

- admin/admin: Welcome admin to website
- Nhập sai: Login Error

Form gửi POST tới /login. Tài khoản cố định dùng theo đề thực hành.
