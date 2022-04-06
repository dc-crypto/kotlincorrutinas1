package com.diegocastro.App3suspension2runblocking

import com.diegocastro.app2Suspension.delayCorrutina
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    println("Tarea 1 " + Thread.currentThread().name)


    runBlocking {
        delayCorrutina("Tarea2 ") //Tarea 1 , Tarea 2 ...5 seg Tarea3 }

        println("Tarea3 " + Thread.currentThread().name)

    }

    suspend fun delayCorrutina(s: String) {
        println(s + Thread.currentThread().isAlive)
        delay(5000)
    }
}