package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.JsObject
import play.api.libs.json.JsArray
import play.api.libs.json.JsString
import play.api.libs.json.Json
import models.Contact
import services.ContactServices

object ListController extends Controller {

  def index = Action {

    /*
    val contacts = Seq(
      Contact("Todd", "Flanders", Some("313-555-1212")),
      Contact("Dave", "Moore"))

    def toJson(fieldName: String, value: String) = {
      Some((fieldName, JsString(value)))
    }
    
    def toJsonOption(fieldName: String, valueOrNot: Option[String]) = {
      valueOrNot match {
        case None => None
        case Some(value) => toJson(fieldName, value)
      }
    }
    
    def contactToJson(contact: Contact) = {
      JsObject(Seq(
        toJson("fName", contact.firstName),
        toJson("lName", contact.lastName),
        toJsonOption("phone", contact.phone)).flatten)
    }
    
    val contactsAsJson = for (contact <- contacts) yield contactToJson(contact)
*/
    
    val contactsAsJson = ContactServices.contacts()
    
    val httpResponse = JsArray(contactsAsJson).toString

    Ok(httpResponse).as("application/json")
  }

}