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

Explaining the business logic
-------------------
As the main scope of the lab is to play with MVC 1.0, e.q to create controllers, views and models the project already contains same "business logic" classes that you need to use in order to implement a specific task.

In the package ro.jug.mvc.entities we have JPA entities: JugSession and User.


In the package ro.jug.mvc.home we have the HomeController class which is a simple controller that display the home page.


In the package ro.jug.mvc.rest we a class to start JAX-RS


In the package ro.jug.mvc.sessions we have classes that deals whith JUG sessions:
  * SessionManager -> use it when you need to read or to create a session
  
  
In the package   ro.jug.mvc.test we have a startup bean named TestDataInserter which insert same dummy data into database and also login and default user into the app.


In the package ro.jug.mvc.users we have classes that deals with the application users:
  * UserContext -> holds data about the logged user
  * UserManager -> read users informations










