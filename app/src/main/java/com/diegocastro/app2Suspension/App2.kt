package com.diegocastro.app2Suspension

import kotlinx.coroutines.delay

suspend fun main(){ //E:Indica que una función suspend solo puede llamarse desde una función suspend

    println("Tarea 1 " + Thread.currentThread().name)
    delayCorrutina("Tarea2 ") //No bloqueas por que está en una fun suspend...lease suspendida
    println("Tarea3 "+Thread.currentThread().name)

}

fun tareaLargaDuracion(s: String) {
    println(s + Thread.currentThread().name)
    Thread.sleep(5000)
}

suspend fun delayCorrutina(s: String){
    println(s+Thread.currentThread().name)
    delay(5000)
}