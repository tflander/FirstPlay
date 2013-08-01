package models

case class Contact(
  firstName: String,
  lastName: String,
  phone: Option[String] = None)
  