package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Comentar o descomentar aquellas funciones que se deseen ejecutar
        //variablesYConstantes()
        tiposDeDatos()
    }

    private fun variablesYConstantes(){
        /*
        Aqui hay variables y constantes
        */
        //Variables
        var myFirstVariable = "Hello Hackerman!"
        var myFirstNumber = 1
        var mySecondVariable = "Suscribete"

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a esta cosa"

        println(myFirstVariable)
        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        //myFirstVariable = 1 no se puede

        //Constantes
        //Las constantes no pueden modificar su valor
        val myFirstConstant = "Buen tutorial"
        val mySecondConstant = myFirstConstant
        println(mySecondConstant)
    }

    private fun tiposDeDatos(){
        //String
        val myString: String = "Hola Hackerman!"
        val myString2 = "Bienvenidos a esta cosa"
        val myString3: String = myString + " " + myString2
        println(myString3)

        //Enteros(Byte, short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3: Int = myInt + myInt2
        println(myInt3)

        //Flotantes (float, Double)
        val myFloat : Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 //En realidad es un int
        val myDouble4 : Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
        
    }
}
