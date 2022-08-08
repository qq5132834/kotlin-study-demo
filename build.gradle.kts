/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.1/userguide/tutorial_java_projects.html
 *
 * gradle.kotlin.dsl文档地址：
 *  https://gradle.github.io/kotlin-dsl-docs/api/org.gradle.kotlin.dsl/index.html
 *
 */

//plugins是KotlinBuildScript.kt类中的函数
plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the kotlin plugin to add support for kotlin
    kotlin("jvm") version "1.4.31"

    // Apply the application plugin to add support for building a CLI application.
    application
}

sourceSets {

}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // This dependency is used by the application.
    implementation("com.google.guava:guava:28.1-jre")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.2.30")
    // Use JUnit test framework
    testImplementation("junit:junit:4.12")
}

application {
    // Define the main class for the application.
    mainClassName = "zuk.ubisec.demo.App"
}
