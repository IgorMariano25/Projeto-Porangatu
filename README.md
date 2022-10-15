# Introduction

The Dropwizard example application was developed to, as its name implies, provide examples of some of the features
present in Dropwizard.

# Overview

Included with this application is an example of the optional DB API module. The examples provided illustrate a few of
the features available in [Hibernate](http://hibernate.org/), along with demonstrating how these are used from within
Dropwizard.

This database example is comprised of the following classes:

* The `PersonDAO` illustrates using the Data Access Object pattern with assisting of Hibernate.

* The `Person` illustrates mapping of Java classes to database tables with assisting of JPA annotations.

* All the JPQL statements for use in the `PersonDAO` are located in the `Person` class.

* `migrations.xml` illustrates the usage of `dropwizard-migrations` which can create your database prior to running
your application for the first time.

* The `PersonResource` and `PeopleResource` are the REST resource which use the PersonDAO to retrieve data from the database, note the injection
of the PersonDAO in their constructors.

As with all the modules the db example is wired up in the `initialize` function of the `HelloWorldApplication`.

# Running The Application

To test the example application run the following commands.

* To create the example, package the application using [Apache Maven](https://maven.apache.org/) from the root dropwizard directory.

        cd dropwizard
        ./mvnw package
        cd dropwizard-example

* To setup the h2 database run.

        java -jar target/dropwizard-example-1.0.0-SNAPSHOT.jar db migrate example.yml

* To run the server run.

        java -jar target/dropwizard-example-1.0.0-SNAPSHOT.jar server example.yml

* To hit the Hello World example (hit refresh a few times).

	http://localhost:8080/hello-world

* To post data into the application.

	curl -H "Content-Type: application/json" -X POST -d '{"fullName":"Other Person","jobTitle":"Other Title"}' http://localhost:8080/people
	
	open http://localhost:8080/people

## URLs encontradas no projeto

GET     /filtered/hello (com.example.helloworld.resources.FilteredResource)  
GET     /hello-world (com.example.helloworld.resources.HelloWorldResource)  
POST    /hello-world (com.example.helloworld.resources.HelloWorldResource)  
GET     /hello-world/date (com.example.helloworld.resources.HelloWorldResource)  
GET     /people (com.example.helloworld.resources.PeopleResource)  
POST    /people (com.example.helloworld.resources.PeopleResource)  
GET     /people/{personId} (com.example.helloworld.resources.PersonResource)  
GET     /people/{personId}/view_freemarker (com.example.helloworld.resources.PersonResource)  
GET     /people/{personId}/view_mustache (com.example.helloworld.resources.PersonResource)  
GET     /protected (com.example.helloworld.resources.ProtectedResource)  
GET     /protected/admin (com.example.helloworld.resources.ProtectedResource)  
GET     /views/iso88591.ftl (com.example.helloworld.resources.ViewResource)  
GET     /views/iso88591.mustache (com.example.helloworld.resources.ViewResource)  
GET     /views/utf8.ftl (com.example.helloworld.resources.ViewResource)  
GET     /views/utf8.mustache (com.example.helloworld.resources.ViewResource)  
POST    /tasks/echo (com.example.helloworld.tasks.EchoTask)  
POST    /tasks/log-level (io.dropwizard.servlets.tasks.LogConfigurationTask)  
POST    /tasks/gc (io.dropwizard.servlets.tasks.GarbageCollectionTask)  

## Visualizador para o banco de Dados

- http://www.h2database.com/html/main.html
