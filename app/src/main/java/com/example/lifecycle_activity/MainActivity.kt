package com.example.lifecycle_activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val tag = "CycloDeVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag, "onCreate chamado")
        Toast.makeText(applicationContext, "onCreate chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart chamado")
        Toast.makeText(applicationContext, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume chamado")
        Toast.makeText(applicationContext, "onResume chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause chamado")
        Toast.makeText(applicationContext, "onPause chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop chamado")
        Toast.makeText(applicationContext, "onStop chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy chamado")
        Toast.makeText(applicationContext, "onDestroy chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "onRestart chamado")
        Toast.makeText(applicationContext, "onRestart chamado", Toast.LENGTH_SHORT).show()
    }
}
