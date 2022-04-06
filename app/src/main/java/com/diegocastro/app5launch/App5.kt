package com.diegocastro.app5launch

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){ //E:Indica que una función suspend solo puede llamarse desde una función suspend

    println("Tarea 1 " + Thread.currentThread().id)

    //Global Scope launch funciona solo mientras la actividad esté viva si termina la coorrutina se muere con la actividad
    GlobalScope.launch { delayCorrutina("Tarea2 ")  }
    //delay(10000)
    //Thread.sleep(11000)
    println("Tarea3 "+Thread.currentThread().id)

}


suspend fun delayCorrutina(s: String){
    println(s+Thread.currentThread().name)
    delay(5000)
}