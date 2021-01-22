object AndroidSdk {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.0"
    const val minSdkVersion = 21
}

object AndroidPlugins {

    object Version {
        const val kotlinVersion = "1.4.21"
        const val gradleVersion = "4.1.1"
        const val hiltVersion = "2.28-alpha"
    }

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Version.gradleVersion}"
    const val kotlinStdLibPlugin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Version.hiltVersion}"
}

object AndroidSupport {

    object Version {
        const val appcompatVersion = "1.2.0"
        const val coreKtxVersion = "1.3.2"
    }

    const val appcompatPlugin = "androidx.appcompat:appcompat:${Version.appcompatVersion}"
    const val coreKtxPlugin = "androidx.core:core-ktx:${Version.coreKtxVersion}"

}

object ArchComponentsLibraries {

    object Version {
        const val nav_version = "2.3.1"
        const val room_version = "2.2.6"
        const val hilt_version = "2.28-alpha"
    }

    const val navigationFragment =  "androidx.navigation:navigation-fragment-ktx:${Version.nav_version}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Version.nav_version}"
    const val navigationFeatureModule = "androidx.navigation:navigation-dynamic-features-fragment:${Version.nav_version}"
    const val roomRuntime =  "androidx.room:room-ktx:${Version.room_version}"
    const val roomCompiler =  "androidx.room:room-compiler:${Version.room_version}"
    const val hiltRuntime = "com.google.dagger:hilt-android:${Version.hilt_version}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hilt_version}"

}

object UIPlugin {

    object Version {
        const val materialVersion = "1.2.1"
        const val constraintLayoutVersion = "2.0.4"
    }

    const val constraintLayoutPlugin = "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
    const val materialPlugin = "com.google.android.material:material:${Version.materialVersion}"

}

object NetworkLibraries {

    private object Version {
        const val retrofit_version = "2.9.0"
        const val okhttp_version = "4.7.2"
    }

    const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit_version}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Version.okhttp_version}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okhttp_version}"
    const val gsonConverter ="com.squareup.retrofit2:converter-gson:${Version.retrofit_version}"
}

object UtilsLibraries {

    object Version {
        const val leak_canary = "2.5"
        const val dependencies_update_analyze_version = "0.36.0"
    }

    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Version.leak_canary}"
    const val dependenciesUpdateAnalyze = "com.github.ben-manes.versions"
}

object AnalysisCode {
    object AnalysisCodeVersions {
        const val ktlint_gradle_version = "9.4.1"
        const val ktlint_version = "0.40.0"
    }

    const val ktlinGradle = "org.jlleitschuh.gradle.ktlint"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
}

object Testing {

    object Version {
        const val junitVersion = "4.13.1"
        const val testJunitVersion = "1.1.2"
        const val testEspressoVersion = "3.3.0"
        const val core_testing_version = "2.1.0"
        const val coroutines_test_version = "1.4.2"
        const val mockito_version = "3.6.28"
        const val mockito_inline_version = "3.7.0"
        const val expekt_version = "0.5.0"
    }

    const val junit = "junit:junit:${Version.junitVersion}"
    const val testJunit = "androidx.test.ext:junit:${Version.testJunitVersion}"
    const val testEspresso = "androidx.test.espresso:espresso-core:${Version.testEspressoVersion}"
    const val coreTesting = "androidx.arch.core:core-testing:${Version.core_testing_version}"
    const val coroutinesTesting = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines_test_version}"
    const val mockitoCore = "org.mockito:mockito-core:${Version.mockito_version}"
    const val mockitoInline = "org.mockito:mockito-inline:${Version.mockito_inline_version}"
    const val expekt = "com.winterbe:expekt:${Version.expekt_version}"
}