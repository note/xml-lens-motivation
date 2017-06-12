name := """xml-lens"""

version := "1.0"

scalaVersion := "2.12.2"

lazy val monocleVersion = "1.4.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules"      %% "scala-xml"      % "1.0.6",
  "org.typelevel"               %% "cats"           % "0.9.0",
  "com.github.julien-truffaut"  %% "monocle-core"   % monocleVersion,
  "com.github.julien-truffaut"  %% "monocle-law"    % monocleVersion  % "test",
  "org.scalatest"               %% "scalatest"      % "3.0.1"         % "test"
)
