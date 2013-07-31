package controllers

import org.scalatest._

import play.api.test._
import play.api.test.Helpers._

class ApplicationSpec extends FunSpec with ShouldMatchers {

  it("Should send 404 on a bad request") {
    running(FakeApplication()) {
      route(FakeRequest(GET, "/boum")) should be(None)
    }
  }

  it("Should render the index page") {
    running(FakeApplication()) {
      val home = route(FakeRequest(GET, "/")).get

      status(home) should be(OK)
      contentType(home) should be(Some("text/html"))
      contentAsString(home) should include("Your new application is ready.")
    }
  }
}