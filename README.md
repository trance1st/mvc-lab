# MVC 1.0 LAB
Repo for the Hands-on lab: MVC 1.0 with Java EE 8 -> https://bjug.ro/hands-on-lab-mvc-1-0-with-java-ee-8/

The lab instructions are in **/docs/lab.pdf** -> https://github.com/trance1st/mvc-lab/blob/master/docs/lab.pdf

Slides available here -> http://slides.com/bogdanposa/mvc-1-0/#/


Project set-up
============

Check-out the project form github https://github.com/trance1st/mvc-lab

Import the project into your favortie IDE. For this demos we will use IntelliJ IDEA but you can simply you another IDE.

Compile the project
-------------------
```sh
mvn clean package
```
Run the project
-------------------

To run the project simply execute the following command:
```sh
mvn clean package embedded-glassfish:run   
```
We use **Maven Embedded GlassFish plugin** (https://embedded-glassfish.java.net/)


*Of course you can mannualy deploy the war into GlassFish but keep in mind that you need at leat Glassfish 4.1.1 to run this project (you can get the server from here: http://download.oracle.com/glassfish/4.1.1/nightly/index.html)*


Familiriaze with the project
============

The main scope of the project is to play with the MVC 1.0 and we will try to create a small application to manage BJUG sessions. 
We will implement a small set of functionalities: login into the app, submit a new presesentation, and view all the presentations.












