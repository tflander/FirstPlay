Step 4 Instructions
===================

- Retrieve code from this branch:  git checkout -f step4
- Verify that once again ListController is broken.  The controller 
expects an optional field for the contact's phone number.
- Add the optional phone number field to the Contact case class
- Verify the app runs with the proper JSON response.

Change history:
===============

Step 4
------

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
