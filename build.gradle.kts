plugins {
    id("java")
}

group = "com.Teroooo.Undertale"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.googlecode.lanterna", "lanterna", "3.1.1")
}

tasks.test {
    useJUnitPlatform()
}