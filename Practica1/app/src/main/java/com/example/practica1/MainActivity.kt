package com.example.practica1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //constantes
        val pi = 3.141516
        val luz = 299792458
        //variables
        var nombre: String = "alex"
        var edad = 19
        imprimir()
        sumar()
        pais()
        }
    private fun imprimir() {
        val nombre = "alex"
        val apellido = "asensio"
        println("Mi nombre completo es: $nombre $apellido")
        println("Mi nombre completo es: alex asensio")
    }
    private fun sumar (){
    var x = 5
    var y = 7
    println(x+y)
    }
    private fun pais (){
        val pais = "España"

        when(pais){
            "España","Peru","Argentina"->{
                println("Idioma ESPAÑOL")
            }"Usa","Londres"->{
            println("Idioma Ingles")
        }else ->{
            println("Menudo Mierdon De Idioma")
        }
        }
    }

}
