package com.tu.paquete.imagesaver

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Verificamos si la app se abrió a través del menú "Compartir"
        if (intent?.action == Intent.ACTION_SEND && intent.type == "text/plain") {
            val sharedText = intent.getStringExtra(Intent.EXTRA_TEXT)
            if (sharedText != null) {
                // Aquí procesaremos la URL para buscar la imagen en el futuro
                Toast.makeText(this, "Enlace recibido: $sharedText", Toast.LENGTH_LONG).show()
            }
        }
        
        // Cerramos la app inmediatamente para que la experiencia sea fluida y sin pantallas de carga
        finish()
    }
}
