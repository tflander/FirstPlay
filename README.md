Step 1
------
- Add dependencies to Build.scala:
  - ScalaTest
  - Mockito
  
- Remove dependencies in Build.scala for JDBC and ANORM

- add SCCT plugin through plugins.sbt

- remove IntegrationSpec.scala from test, since we will be doing end-to-end tests through a 
  FakeApplication.  We don't need to use HTTP for testing.
  
- refactor ApplicationSpec.scala from default package controllers, and convert from Specs
  to ScalaTest.
  
- add .target and .cache to .gitIgnore (also remove from repo)
  
Step 0
------
Create a new play application using the command "play new FirstPlay" (new Scala application)
