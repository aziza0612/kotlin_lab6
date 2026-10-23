
plugins {
    kotlin("jvm") version "2.2.20"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(19)
}

sourceSets {
    main {
        kotlin.srcDir("task01")
        kotlin.srcDir("task02")
        kotlin.srcDir("task03")
        kotlin.srcDir("task04")
        kotlin.srcDir("task05")
        kotlin.srcDir("task06")
        kotlin.srcDir("task07")
        kotlin.srcDir("task08")
        kotlin.srcDir("task09")
        kotlin.srcDir("task10")
        kotlin.srcDir("task11")
        kotlin.srcDir("task12")
        kotlin.srcDir("task13")
        kotlin.srcDir("task14")
        kotlin.srcDir("task15")
    }
}

