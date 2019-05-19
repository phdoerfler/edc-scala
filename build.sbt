import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "1"
ThisBuild / organization     := "io.doerfler"
ThisBuild / organizationName := "Philipp Dörfler"

lazy val root = (project in file("."))
  .settings(
    name := "edc",
    libraryDependencies ++= specs2,
    
    scalacOptions in Test += "-Yrangepos" // specs2
  )