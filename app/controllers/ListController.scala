package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.JsObject
import play.api.libs.json.JsArray
import play.api.libs.json.JsString
import play.api.libs.json.Json
import models.Contact

object ListController extends Controller {

  def index = Action {

    val contacts = Seq(
      Contact("Todd", "Flanders"),
      Contact("Dave", "Moore"))

    val c = for (contact <- contacts) yield {
      JsObject(Seq(
        ("fName", JsString(contact.firstName)),
        ("lName", JsString(contact.lastName))))
    }

    val httpResponse = JsArray(c).toString

    Ok(httpResponse).as("application/json")
  }

}