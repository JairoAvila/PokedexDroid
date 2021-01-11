plugins {
    id(AnalysisCode.ktlinGradle) version AnalysisCode.AnalysisCodeVersions.ktlint_gradle_version
    id(UtilsLibraries.dependenciesUpdateAnalyze) version UtilsLibraries.Version.dependencies_update_analyze_version
}

buildscript {
    val kotlin_version by extra("1.4.21")
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(AndroidPlugins.gradlePlugin)
        classpath(AndroidPlugins.kotlinPlugin)
        classpath(AndroidPlugins.hiltPlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

subprojects {
    apply(plugin = AnalysisCode.ktlint)

    ktlint {
        version.set(AnalysisCode.AnalysisCodeVersions.ktlint_version)
        debug.set(true)
        verbose.set(true)
        android.set(false)
        outputToConsole.set(true)
        ignoreFailures.set(true)
        kotlinScriptAdditionalPaths {
            include(fileTree("scripts/"))
        }
        filter {
            exclude("**/generated/**")
            include("**/kotlin/**")
        }
    }
}

tasks.register("clean").configure {
    delete("build")
}
