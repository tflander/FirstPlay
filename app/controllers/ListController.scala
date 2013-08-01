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
    val httpResponse = (JsArray(ContactServices.contacts())).toString
    Ok(httpResponse).as("application/json")
  }

}