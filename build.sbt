name := """akka-sample-remote-scala"""

version := "2.3.10"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.3.10"
)



fork in run := true