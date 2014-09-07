Java Security Myths
=================

Java sample projects demystifying some Java security myths in web applications. Some browsers may block request parts, Mozilla Firefox is recommended.

###CSRF
Requires a web server like Apache Tomcat. Either use your own Tomcat installation or use the embedded Maven-Tomcat7-Plug-in by executing **mvn tomcat7:run-war** and point your browser to **http://localhost:8080/csrf**

###XSS
Requires a web server like Apache Tomcat. Either use your own Tomcat installation or use the embedded Maven-Tomcat7-Plug-in by executing **mvn tomcat7:run-war** and point your browser to **http://localhost:8080/xss**
