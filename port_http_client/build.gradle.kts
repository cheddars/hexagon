
apply(from = "../gradle/kotlin.gradle")
apply(from = "../gradle/publish.gradle")
apply(from = "../gradle/dokka.gradle")

dependencies {
    "api"(project(":hexagon_core"))

    "testImplementation"(project(":http_server_jetty"))
}
