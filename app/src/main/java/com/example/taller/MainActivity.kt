package com.example.taller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edadPersona()
        tablaMultiplicar()
        listadoParalelo()

        calculoIVA()
        validarCedula()
    }

    // Validar si una persona es mayor o menor de edad
    fun edadPersona(){
        val edad = 18
        if (edad >= 18){
            println("Usted es mayor de edad")
        } else {
            println("Usted es menor de edad")
        }
    }

    // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    fun tablaMultiplicar(){
        val num = 2
        println("Forma ascendente")
        for(x in 0..10){
            val res1 = num * x
            println(res1)
        }
        println("Forma descendente")
        for (x in 10 downTo 0){
            val res2 = num * x
            println(res2)
        }
    }

    // Mostrar el listado de paralelo de la materia de Plataformas móviles y
    // los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listadoParalelo(){

        val myArray = arrayListOf<String>()
        myArray.addAll(listOf("Eric Alvarado","Miguel Caraguay","Carlos Castillo","Erick Cuenca",
            "Anthonny Espinosa","Jhoselin Guachizaca","Steven Jara","Adriana Jaramillo",
            "Andres Jimenez","Diego Leiva","Mateo Martinez","Pablo Montaño","Rommel Ojeda",
            "Joselito Ordoñez","Diego Pardo","Bryan Rodriguez","Pablo Saraguro","Jose Silva",
            "Carlos Tandazo"))
        println(myArray)


    }

    // Presentar las propiedades de un vehículo utilizando clases,
    // como tracción, motor, tipo de vehículo, capacidad
    fun propiedadesVehiculo(){

    }

    // Algoritomo de cálculo de IVA 12%
    fun calculoIVA(){
        val precio = 10
        val iva = precio * 0.12
        val total = precio + iva
        println("El precio es de: " + precio + "\nEl iva es de: " + iva +
                "\n El valor total a pagar es de: " + total)
    }

    // Validación de la cedula
    fun validarCedula(){

    }

}