buildscript {
    repositories {
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/google") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/gradle-plugins") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/maven-central") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/obt-android") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/sem-libs-internal") }
    }
    dependencies {
        classpath(libs.kotlin.gradle.plugin.v1720)
        classpath(libs.eacscigradleplugin)
        classpath(libs.gradle)
    }
}

allprojects {
    repositories {
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/google") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/gradle-plugins") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/maven-central") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/obt-external-deliveries") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/obt-android") }
        maven { url = uri("https://esw-artifactory.got.volvo.net/artifactory/sem-libs-internal") }
    }
}