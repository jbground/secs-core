plugins {
    id("java")
}

group = "org.jbground.mcs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //lib
    implementation(fileTree(mapOf("dir" to "lib" , "include" to listOf("*.jar"))))


    //logging
    implementation("org.slf4j:slf4j-api:2.0.12")
    implementation("org.slf4j:slf4j-log4j12:2.0.12")

    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-slf4j-impl:2.22.0")

    implementation("org.jetbrains:annotations:24.0.0")

    //jboss logging
    testImplementation("org.jboss.logmanager:jboss-logmanager:3.0.4.Final")
    compileOnly("org.jboss.logging:jboss-logging-annotations:2.2.1.Final")
//    implementation("org.jboss.slf4j:slf4j-jboss-logmanager:2.0.1.Final")
    implementation("org.jboss.logging:jboss-logging:3.5.3.Final")

    //proxy
    implementation("cglib:cglib:3.3.0")
    implementation("net.bytebuddy:byte-buddy:1.14.12")

    //test
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}