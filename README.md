Step 2 Instructions
===================

- Retrieve code from this branch:  git checkout -f step2
- Verify compile error in ListController.scala
- Fix compile error by defining a case class Contact in app/models.Contact.scala
- Run the app and click the link to verify the Rest/Json call
- Examine test ListControllerTest.scala
- run all tests.  Note someone checked in a broken test.  Fix it.

Change history:
===============

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
