plugins {
    id("com.android.library")
    id("dagger.hilt.android.plugin")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(AndroidSdk.compileSdkVersion)
}

dependencies {
    implementation(AndroidPlugins.kotlinStdLibPlugin)

    implementation(ArchComponentsLibraries.hiltRuntime)
    kapt(ArchComponentsLibraries.hiltCompiler)

    api(NetworkLibraries.retrofit)
    api(NetworkLibraries.okhttp)
    api(NetworkLibraries.loggingInterceptor)
    api(NetworkLibraries.gsonConverter)

    api(ArchComponentsLibraries.roomRuntime)
    kapt(ArchComponentsLibraries.roomCompiler)

    testImplementation(Testing.junit)
    androidTestImplementation(Testing.testJunit)

    implementation(project(mapOf("path" to ":common")))
}
