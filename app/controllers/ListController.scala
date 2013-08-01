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
      Contact("Todd", "Flanders", Some("313-555-1212")),
      Contact("Dave", "Moore"))

    def contactToJson(contact: Contact) = {
      JsObject(Seq(
        Some(("fName", JsString(contact.firstName))),
        Some(("lName", JsString(contact.lastName))),
        contact.phone match {
          case None => None
          case Some(phone) => Some(("phone", JsString(phone)))
        }).flatten)
    }

    val contactsAsJson = for (contact <- contacts) yield contactToJson(contact)

    val httpResponse = JsArray(contactsAsJson).toString

    Ok(httpResponse).as("application/json")
  }

}