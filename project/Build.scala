import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "FirstPlay"
  val appVersion      = "1.0-SNAPSHOT"
    
//  val coberturaIgnore = "controllers.javascript"
//    
//  val a = ScctPlugin.instrumentSettings
//  println("##############")
//  println(a)
//  println(a.getClass.getName)
//  println(a.size)
//  a.foreach { thing =>
//    println(thing)
//    println("")
//  }
//  println("##############")

  lazy val additionalSettings = Defaults.defaultSettings ++ seq(ScctPlugin.instrumentSettings: _*)
    
  val appDependencies = Seq(
   "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test",
    "org.mockito" % "mockito-core" % "1.9.5" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies, settings = additionalSettings).settings(
    // Add your own project settings here      
  )

}
