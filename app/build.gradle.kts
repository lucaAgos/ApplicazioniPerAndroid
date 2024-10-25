plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.primaapplicazioneandroid"
    compileSdk = 34 /**/

    defaultConfig {
        applicationId = "com.example.primaapplicazioneandroid"
        minSdk = 24
        targetSdk = 34 /**/
        versionCode = 1 /*Identifica univocamente la versione dell'applicazione
        solo lato sviluppatore*/
        versionName = "1.0" /*Visibile anche lato utente*/

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            /**/
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
}
/**/
dependencies {
   /* implementation(libs.retrofit)*/
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}