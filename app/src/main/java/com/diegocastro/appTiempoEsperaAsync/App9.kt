package com.diegocastro.appTiempoEsperaAsync

import com.diegocastro.appAsyncAwait.asyncAwait
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    println("Demora asyncAwait "+ measureTimeMillis { asyncAwait() })
    println("Demora asyncAwaitDeferred "+ measureTimeMillis { asyncAwaitDeferred() })
}
// el deferred permite que se ejecute lo que está inmeidato y espera sin bloquear para aquellos deferred en segundo plano
fun asyncAwaitDeferred() {
    runBlocking {
        println("Paso 1 "+System.currentTimeMillis().toString())
        val num1: Deferred<Int> = async { tareaLargaDuracion() }
        //Cuando ocupo async await le estoy diciendo que espere a que termine este hilo antes de pasar a la siguiente linea

        println("Paso 2 "+System.currentTimeMillis().toString())
        val num2: Deferred<Int> =async { tareaLargaDuracion() }

        println("Paso 3 "+System.currentTimeMillis().toString())
        val num3: Deferred<Int> =async { tareaLargaDuracion() }

        //como retorna un valor entero yo lo puedo usar
        val resultado=num1.await()+num2.await()+num3.await()
        print("resultado="+resultado)
    }
}


fun tareaLargaDuracion(): Int {
    println(""+Thread.currentThread().name)
    Thread.sleep(5000)
    return 10
}