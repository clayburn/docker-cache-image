plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    id("com.gradle.develocity") version "3.18.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.0.2"
}

rootProject.name = "docker-cache-image"
include("app", "list", "utilities")

develocity {
    server = "https://ge.solutions-team.gradle.com"
    buildScan.uploadInBackground = false
}
