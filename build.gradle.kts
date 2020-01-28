plugins {
    war
    id("org.gretty") version "3.0.1"
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jboss.resteasy:resteasy-jackson2-provider:4.4.2.Final")
    implementation("org.jboss.resteasy:resteasy-client:4.4.2.Final")
    providedCompile("javax.servlet:javax.servlet-api:4.0.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.1")

    // Use JUnit Jupiter Engine for testing.
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.1")
}

val test by tasks.getting(Test::class) {
    // Use junit platform for unit tests
    useJUnitPlatform()
}
