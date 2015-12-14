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
mvn clean install
```
Run the project
-------------------
To run this project you will need GlassFish server al leat version 4.1.1.
You can get the server from here: http://download.oracle.com/glassfish/4.1.1/nightly/index.html

Because the project use a database we will use the JavaDB embedded server wich comes with GlassFish.

So, first we need to start the database engine by running:
```sh
***/latest-glassfish\glassfish4\javadb\bin\setNetworkClientCP.bat
```
or for Linux:
```sh
***/latest-glassfish\glassfish4\javadb\bin\setNetworkClientCP.sh
```

