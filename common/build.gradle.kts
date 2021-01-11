plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
}

dependencies {
    implementation(AndroidPlugins.kotlinStdLibPlugin)
}