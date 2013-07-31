package controllers
import org.scalatest._

import play.api.test._
import play.api.test.Helpers._


class ListControllerTest extends FunSpec with ShouldMatchers {
  it("Should render json") {
    running(FakeApplication()) {
      val jsonResponse = route(FakeRequest(GET, "/list")).get

      status(jsonResponse) should be(OK)
      contentType(jsonResponse) should be(Some("application/json"))
      contentAsString(jsonResponse) should be("""[{"fName":"Todd","lName":"Flanders"},{"fName":"Dave","lName":"Moore"}]""")
    }
  }
}