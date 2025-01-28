pluginManagement {
    repositories {
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/google") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/maven-central") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/gradle-plugins") }
    }
}

rootProject.name = "MaterialTheme"
include(":app")
