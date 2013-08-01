package services

import models.Contact
import play.api.libs.json.JsString
import play.api.libs.json.JsObject

object ContactServices {

  def contacts(): Seq[JsObject] = {
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
    
    for (contact <- contacts) 
      yield contactToJson(contact)
  }
}