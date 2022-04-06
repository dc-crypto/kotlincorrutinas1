package com.diegocastro.appGlobalScopeJob

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){

             println("Tarea 1 " + Thread.currentThread().id)

            //
            val job=GlobalScope.launch {
                                        delayCorrutina("Tarea2 ")
                                        }

            job.cancel() //Cancela el delaycorrutina antres de que termine
            //sirve para cuando pasamos de una actividad a otra

            println("Tarea3 "+Thread.currentThread().id)
            }

suspend fun delayCorrutina(s: String){
                                        println(s+Thread.currentThread().name)
                                        delay(5000)
                                    }

