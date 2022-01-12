plugins {
    kotlin("jvm") version "1.4.21" apply true
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }
    repositories {
        mavenCentral()
    }
}