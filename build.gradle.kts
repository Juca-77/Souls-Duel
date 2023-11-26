plugins {
    id ("java")
    id ("application")
    //id "org.kordamp.gradle.errorprone" version "0.47.0"
}

application {
    mainClass.set("Application")
}

group = "com.juca-77.Soul"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("com.googlecode.lanterna:lanterna:3.1.1")


}


tasks.test {
    useJUnitPlatform()
}