plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
    buildToolsVersion(AndroidSdk.buildToolsVersion)

    defaultConfig {
        applicationId = "com.jairoavila.pokedex"
        minSdkVersion(AndroidSdk.minSdkVersion)
        targetSdkVersion(AndroidSdk.compileSdkVersion)
        multiDexEnabled = true
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Support Libraries
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(AndroidPlugins.kotlinStdLibPlugin)
    implementation(AndroidSupport.coreKtxPlugin)
    implementation(AndroidSupport.appcompatPlugin)

    // UI Libraries
    implementation(UIPlugin.constraintLayoutPlugin)
    implementation(UIPlugin.materialPlugin)

    // Utils Libraries
    implementation(UtilsLibraries.leakCanary)

    // Testing Libraries
    testImplementation(Testing.junit)
    androidTestImplementation(Testing.testJunit)
    androidTestImplementation(Testing.testEspresso)
}
