package com.diegocastro.app7Asinc

import com.diegocastro.app1Bloqueado.tareaLargaDuracion
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main(){
    asyncAwait()
}
//cuando se aplica async la función ejecuta lo que puede en forma inmediata
//y lo que está marcado con async lo hace cuando puyede
fun asyncAwait() {
                    runBlocking {
                                println(""+System.currentTimeMillis().toString())
                                async { tareaLargaDuracion() }

                                println(""+System.currentTimeMillis().toString())
                                async { tareaLargaDuracion() }

                                println(""+System.currentTimeMillis().toString())
                                async { tareaLargaDuracion() }
                                }
                }


fun tareaLargaDuracion() {
                        println(""+Thread.currentThread().name)
                        Thread.sleep(5000)
                        }