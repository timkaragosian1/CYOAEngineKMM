import org.jetbrains.compose.ExperimentalComposeLibrary

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsCompose)
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.sqldelight)
}



sqldelight {
    databases {
        create("Database") {
            packageName.set("db")
            srcDirs.setFrom("src/commonMain/kotlin/sql")
        }
    }
}


kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
    
    sourceSets {
        
        androidMain.dependencies {
            implementation(libs.compose.ui.tooling.preview)
            implementation(libs.androidx.activity.compose)

            //Decompose
            implementation(libs.decompose)

            //Datadog
            implementation(libs.datadog.android.rum)
            implementation(libs.datadog.android.gradle)
            implementation(libs.datadog.android.logs)

            //SQLDelight
            implementation(libs.sqldelight.android)

            //KTOR
            implementation(libs.ktor.client.okhttp)
        }
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            @OptIn(ExperimentalComposeLibrary::class)

            //Decompose
            implementation(libs.decompose)
            implementation(libs.decompose.jetbrains)

            //SQLDelight
            implementation(libs.sqldelight.common)

            //Serialization
            implementation(libs.kotlin.serialization)
            //implementation(libs.kotlinx.serialization.json)

        }

        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)

            //SQLDelight
            api(libs.sqldelight.native)
            implementation(libs.stately.common)
            implementation(libs.sqliter)
        }
    }
}

android {
    namespace = "com.timkaragosian.cyoaenginecomposekmm"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")

    defaultConfig {
        applicationId = "com.timkaragosian.cyoaenginecomposekmm"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    dependencies {
        debugImplementation(libs.compose.ui.tooling)
    }
}
dependencies {
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.firebase.perf.ktx)
}

