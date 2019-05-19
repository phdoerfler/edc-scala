import sbt._

object Dependencies {
  def specs2 = specs2Libs("4.3.4", Seq("core", "html"))
  
  def specs2Libs(version: String, features: Seq[String]) =
    features.map(fe => "org.specs2" %% f"specs2-$fe%s" % version % "test")
}
