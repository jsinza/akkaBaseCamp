name := "akkaBaseCamp"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= {
  val akkaV = "2.4.10"
  val scalaTestV = "3.0.0"
  val swaggerV = "0.7.2"
  val loggingV = "3.4.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http-core" % akkaV,
    "org.scalatest" %% "scalatest" % scalaTestV % "test",
    "com.github.swagger-akka-http" %% "swagger-akka-http" % swaggerV,
    "com.typesafe.scala-logging" %% "scala-logging" % loggingV,
    "org.slf4j" % "slf4j-simple" % "1.7.21"
  )
}