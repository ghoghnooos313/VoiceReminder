plugins {
    kotlin("jvm") version "1.8.0"
    id("com.android.application") version "8.0.0"
}

android {
    namespace = "com.example.voicereminder"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.voicereminder"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}
