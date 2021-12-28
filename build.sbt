ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.6"

val lwjglVersion = "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "imageee"
  )



libraryDependencies += "org.lwjgl" % "lwjgl" % lwjglVersion
libraryDependencies += "org.lwjgl" % "lwjgl" % lwjglVersion classifier "natives-windows"
libraryDependencies += "org.lwjgl" % "lwjgl-opengl" % lwjglVersion
libraryDependencies += "org.lwjgl" % "lwjgl-opengl" % lwjglVersion classifier "natives-windows"
libraryDependencies += "org.lwjgl" % "lwjgl-glfw" % lwjglVersion
libraryDependencies += "org.lwjgl" % "lwjgl-glfw" % lwjglVersion classifier "natives-windows"
