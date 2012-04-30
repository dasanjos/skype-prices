Skype Prices
============

Simple Spring MVC 3.1 web app that display Skype calling rates based on public Skype APIs.


RUNNING
-------

The application runs on any Java Web container on any platform with Java (JRE) 1.6+ installed.  

To start, compile or download the application war file and deploy on your Java EE Application Server.

You can also start the application directly using an embedded server via Maven.

For Tomcat:
    $ mvn tomcat:run 

For Jetty: 
    $ mvn jetty:run
    
The application will be available at http://localhost:8080 and to stop the application press Cntr+C on the command line.


COMPILING
---------

Step 1 - Install Requirements
-----------------------------
To download and compile the source code you need to install: 

- Java SDK v1.6+
- Maven v2.0+
- Git v1.7+
 
Step 2 - Get the source code
----------------------------
Download the project source code from GitHub repository (https://github.com/dasanjos/skype-prices) 

    $ git clone git://github.com/dasanjos/skype-prices

This will create a folder "skype-prices" containing the project source files. 

Step 3 - Compile it!
--------------------
Go to the project root folder and run the following command: 

    $ mvn clean package

This will create a "target" folder containing the application war file: skype-prices-1.0-SNAPSHOT.war  

Sources
-------

* Skype Prices APIs: 
http://assets.skype.com/pricelist/1.0/json/en/skypeout/eur
http://assets.skype.com/pricelist/1.0/xml/en/skypeout/eur
 
* Based on SpringSource Tutorials:
http://blog.springsource.com/2011/01/04/green-beans-getting-started-with-spring-mvc/
http://blog.springsource.org/2009/03/27/rest-in-spring-3-resttemplate/

Hours worked 8h 
* 28.04.2012 17:00 - 20:00 
* 29.04.2012 10:00 - 12:00
* 30.04.2012 13:00 - 14:00 

TODO
---- 
Use XMl and JSON to get data 
http://www.informit.com/guides/content.aspx?g=java&seqNum=549
