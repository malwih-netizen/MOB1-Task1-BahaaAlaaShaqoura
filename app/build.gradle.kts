plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.bahaa.task1"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.bahaa.task1"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
}
