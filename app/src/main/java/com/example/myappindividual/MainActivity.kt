package com.example.myappindividual

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
         AlertDialog.Builder(this).apply {
             setTitle("Mensaje")
             setMessage("Su nombre se ha guardado con exito")
             setPositiveButton("aceptar"){ _: DialogInterface, _: Int ->

             }

         }.show()

        }
    }

}