package com.example.taller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edadPersona()
        tablaMultiplicar()
        listadoParalelo()
        propiedadesVehiculo()
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
            println("$num x $x = ${num * x}")
        }
        println("Forma descendente")
        var des = 10
        for (x in 0..10){
            des = des - 1
            println("$num x $des = ${num * des}")
        }
    }

    // Mostrar el listado de paralelo de la materia de Plataformas móviles y
    // los subgrupos por proyectos (Mostrar los resultados ordenados).
    fun listadoParalelo(){

        val myArray = arrayListOf<String>()
        myArray.addAll(listOf("Mateo Martinez","Pablo Montaño","Rommel Ojeda",
            "Joselito Ordoñez","Diego Pardo","Bryan Rodriguez","Pablo Saraguro","Jose Silva",
            "Carlos Tandazo"))

        val orden = myArray.sorted()
        println("Listado Paralelo")
        for(myArray in orden){
            println(myArray)
        }

        val subG = mutableMapOf("Mateo Martinez" to "Grupo01", "Pablo Montaño" to "Grupo02",
            "Rommel Ojeda" to "Grupo01", "Joselito Ordoñez" to "Grupo01", "Diego Pardo" to "Grupo03",
            "Bryan Rodriguez" to "Grupo02", "Pablo Saraguro" to "Grupo02", "Jose Silva" to "Grupo03",
            "Carlos Tandazo" to "Grupo03")

        val ordenSubG = subG.toSortedMap()
        println ("Grupo paralelo")
        for(x in ordenSubG){
            println("${x.key} - ${x.value}")
        }
    }

    // Presentar las propiedades de un vehículo utilizando clases,
    // como tracción, motor, tipo de vehículo, capacidad
    fun propiedadesVehiculo(){
        val vehiculo = PropiedadesVehiculo(arrayOf(PropiedadesVehiculo.trac.trasera), motor = "Hibrido",
            tipo = "Motorizado", capacidad = "5 pasajeros")

        vehiculo.propiedades()
        println(vehiculo.motor)
        println(vehiculo.tipo)
        println(vehiculo.capacidad)
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
        val cedula = arrayListOf<Int>(1,1,5,0,6,2,0,0,7,6)
        var total = 0
        var cont = 0
        val final = cedula.last()
        for (x in cedula.indices){
            cont = cedula[x]
            if (x % 2 == 0){
                cont = (cedula[x] * 2)
                if (cont > 9){
                    cont = cont - 9
                }
                total = total + cont
            } else {
                total = total + cont
            }
        }
        total = total - final
        val primero = total.toString().substring(0,1)
        val decimo = (primero.toInt() + 1) * 10
            if (decimo - total == final || decimo - total == 10){
                println("La cedula es valida")
            }else{
                println("La cedula no es valida")
            }
        }
}

class PropiedadesVehiculo(val traccion:Array<trac>, val motor:String, val tipo: String, val capacidad:String){
    enum class trac{
        delantera, trasera
    }
    fun propiedades(){
        for (trac in traccion){
            println("La traccion es: " +trac)
        }
    }
}