package com.diegocastro.appAsyncAwait

import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(){
    asyncAwait()
}

fun asyncAwait() {
    runBlocking {
        println("Paso 1 "+System.currentTimeMillis().toString())
        val num1:Int=async { tareaLargaDuracion() }.await()
        //Cuando ocupo async await le estoy diciendo que espere a que termine este hilo antes de pasar a la siguiente linea

        println("Paso 2 "+System.currentTimeMillis().toString())
        val num2:Int=async { tareaLargaDuracion() }.await()

         println("Paso 3 "+System.currentTimeMillis().toString())
        val num3:Int=async { tareaLargaDuracion() }.await()

        //como retorna un valor entero yo lo puedo usar
        val resultado=num1+num2+num3
        print("resultado="+resultado)
    }
}


fun tareaLargaDuracion(): Int {
    println(""+Thread.currentThread().name)
    Thread.sleep(5000)
    return 10
}