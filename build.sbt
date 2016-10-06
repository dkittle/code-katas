name := "code-katas"

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint",
  "-Xfatal-warnings"
)

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test"

