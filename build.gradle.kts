plugins {
    id("com.android.application") version "8.2.0"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
    namespace = "com.tu.paquete.imagesaver"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.tu.paquete.imagesaver"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    // Esta es la herramienta clave para extraer las imágenes sin usar APIs oficiales
    implementation("org.jsoup:jsoup:1.17.2") 
}
