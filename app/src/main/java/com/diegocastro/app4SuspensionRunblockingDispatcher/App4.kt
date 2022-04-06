package com.diegocastro.app4SuspensionRunblockingDispatcher

import com.diegocastro.app2Suspension.delayCorrutina
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main() {

    println("Tarea 1 " + Thread.currentThread().name)

//Hay diferentes constructores para el runblocking
    runBlocking {
        delayCorrutina("Tarea2 ") //Tarea 1 , Tarea 2 ...5 seg Tarea3 }

        //Dispatcher.Unconfined ejecuta en hilo elegido por la maquina virtual-este es el por defecto
        runBlocking(Dispatchers.Unconfined) {
            delayCorrutina("Tarea3 ")}

        //Dispatchers.Default para operaciones intensivas en CPU
        runBlocking(Dispatchers.Default)  {
            delayCorrutina("Tarea4 ")}

        //Para que el hilo se ejecute con en trada y salida de datos in-out
        runBlocking(Dispatchers.IO) {
            delayCorrutina("Tarea5 ")}

        //Hilo con nombre propio
        runBlocking(newSingleThreadContext("MiHilo")) {
            delayCorrutina("Tarea6 ")}

        //Hilo para el main en este caso no aplica porque no estamnos con un activity
        /*runBlocking (Dispatchers.Main){
            delayCorrutina("Tarea7 ")}*/



    }

    suspend fun delayCorrutina(s: String) {
        println(s + Thread.currentThread().name)
        delay(5000)
    }
}