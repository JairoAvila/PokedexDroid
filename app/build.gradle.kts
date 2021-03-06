plugins {
    id("com.android.application")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
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

    buildFeatures {
        viewBinding = true
    }

    dynamicFeatures = mutableSetOf(":dashboard", ":login")
}

dependencies {
    // Support Libraries
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(AndroidPlugins.kotlinStdLibPlugin)
    implementation(AndroidSupport.coreKtxPlugin)
    implementation(AndroidSupport.appcompatPlugin)

    // UI Libraries
    api(UIPlugin.constraintLayoutPlugin)
    implementation(UIPlugin.materialPlugin)

    // Architecture Components Libraries
    api(ArchComponentsLibraries.navigationFragment)
    api(ArchComponentsLibraries.navigationUI)
    api(ArchComponentsLibraries.navigationFeatureModule)
    implementation(ArchComponentsLibraries.hiltRuntime)
    kapt(ArchComponentsLibraries.hiltCompiler)

    // Utils Libraries
    implementation(UtilsLibraries.leakCanary)

    // Testing Libraries
    testImplementation(Testing.junit)
    androidTestImplementation(Testing.testJunit)
    androidTestImplementation(Testing.testEspresso)

    testImplementation(Testing.mockitoCore)
    testImplementation(Testing.mockitoInline)
    testImplementation(Testing.expekt) { exclude(group = "org.jetbrains.kotlin") }
    testImplementation(Testing.coreTesting)
    testImplementation(Testing.coroutinesTesting)
    androidTestImplementation(Testing.coreTesting)
    androidTestImplementation(Testing.coroutinesTesting)

    implementation(project(mapOf("path" to ":core")))
}
