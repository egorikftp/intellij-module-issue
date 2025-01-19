plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.intelliJPlatform.module)
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.1")
    }
}