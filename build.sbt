lazy val root = (project in file("."))
  .settings(
    name := "scala-string-metrics",
    organization := "de.scharom",
    licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt")),
    description := "A pure functional library to compute string metrics.",
    scalaVersion := "3.1.0"
  )

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked"
)