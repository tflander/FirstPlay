Step 1 Instructions
===================

- Make sure you have play framework installed.  Follow step-0 instructions if you don't.
- Retrieve code from this branch:  git checkout -f step1
- Run tests with code coverage:  play scct:test
- Verify the code coverage report in target/scala-2.10/coverage-report/index.html
- Verify poor or no coverage on generated code.  SCCT doesn't support a way to ignore generated code???

Change history:
===============

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
