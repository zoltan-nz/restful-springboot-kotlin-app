import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    id("org.springframework.boot") version "2.1.4.RELEASE"
    kotlin("jvm") version "1.3.30"
    kotlin("plugin.spring") version "1.3.30"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
}

group = "nz.zoltan"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
        freeCompilerArgs = listOf("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}