name := "specific-generation-test"

sourceGenerators in Compile += (avroScalaGenerateSpecific in Compile).taskValue

scalaVersion := "2.12.15"

libraryDependencies += "org.apache.avro" % "avro" % "1.8.2"