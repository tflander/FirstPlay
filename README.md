Step 6 Instructions
===================

- Retrieve code from this branch:  git checkout -f step6
- Verify our controller is doing too much.  The commended 
block should be delegated to the singleton ContactServices.
- Create a singleton service to retrieve the contact JSON

Change history:
===============

Step 6
------
- Create ContactService

Step 5
------
- Add the optional phone field to the case class for step 4

Step 4
------
- Controller now expects an optional phone field for the contact

Step 3
------
- Implement case class for step 2

Step 2
------
- Replace default page with REST/JSON service description (index.scala.html)
- create route and controller for /list rest call

Step 1
------
- Add dependencies to Build.scala:
  - ScalaTest
  - Mockito
  
- Remove dependencies in Build.scala for JDBC and ANORM

- add SCCT plugin through plugins.sbt and Build.scala

- remove IntegrationSpec.scala from test, since we will be doing end-to-end tests through a 
  FakeApplication.  We don't need to use HTTP for testing.
  
- refactor ApplicationSpec.scala from default package controllers, and convert from Specs
  to ScalaTest.
  
- add .target and .cache to .gitIgnore (also remove from repo)
  
Step 0
------
Create a new play application using the command "play new FirstPlay" (new Scala application)
