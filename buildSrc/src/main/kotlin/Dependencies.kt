object AndroidSdk {
    const val compileSdkVersion = 30
    const val buildToolsVersion = "30.0.0"
    const val minSdkVersion = 21
}

object AndroidPlugins {

    object Version {
        const val kotlinVersion = "1.4.20"
        const val gradleVersion = "4.1.1"
    }

    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinVersion}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Version.gradleVersion}"
    const val kotlinStdLibPlugin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlinVersion}"
}

object AndroidSupport {

    object Version {
        const val appcompatVersion = "1.2.0"
        const val coreKtxVersion = "1.3.2"
    }

    const val appcompatPlugin = "androidx.appcompat:appcompat:${Version.appcompatVersion}"
    const val coreKtxPlugin = "androidx.core:core-ktx:${Version.coreKtxVersion}"

}

object UIPlugin {

    object Version {
        const val materialVersion = "1.2.1"
        const val constraintLayoutVersion = "2.0.4"
    }

    const val constraintLayoutPlugin = "androidx.constraintlayout:constraintlayout:${Version.constraintLayoutVersion}"
    const val materialPlugin = "com.google.android.material:material:${Version.materialVersion}"

}

object Testing {

    object Version {
        const val junitVersion = "4.13.1"
        const val testJunitVersion = "1.1.2"
        const val testEspressoVersion = "3.3.0"
    }

    const val junit = "junit:junit:${Version.junitVersion}"
    const val testJunit = "androidx.test.ext:junit:${Version.testJunitVersion}"
    const val testEspresso = "androidx.test.espresso:espresso-core:${Version.testEspressoVersion}"
}