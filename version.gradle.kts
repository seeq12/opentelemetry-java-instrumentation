val stableVersion = "1.27.0-seeq"
val alphaVersion = "1.27.0-seeq-alpha"

allprojects {
  if (findProperty("otel.stable") != "true") {
    version = alphaVersion
  } else {
    version = stableVersion
  }
}
