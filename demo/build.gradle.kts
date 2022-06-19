// SPDX-FileCopyrightText: 2022 Anthony Accioly
//
// SPDX-License-Identifier: Apache-2.0

group = "dev.accioly"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.7.0"
    id("com.adarshr.test-logger") version "3.2.0"
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-assertions-core:5.3.1")
    testImplementation("org.jetbrains.kotlin:kotlin-reflect")
}

tasks.test {
    useJUnitPlatform()
}
