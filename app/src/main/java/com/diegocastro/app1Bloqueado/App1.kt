package com.diegocastro.app1Bloqueado

fun main(){

    println("Tarea 1 " + Thread.currentThread().name)
    tareaLargaDuracion("Tarea2 ") //Bloquea el hilo principal
    println("Tarea3 "+Thread.currentThread().name)

}

fun tareaLargaDuracion(s: String) {
    println(s+Thread.currentThread().name)
    Thread.sleep(5000)

}
