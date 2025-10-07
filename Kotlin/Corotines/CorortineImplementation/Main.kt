package org.example
import kotlinx.coroutines.*
import kotlin.concurrent.thread

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {//executed on the main thread

//    println("Main program strats: ${Thread.currentThread().name}")
//
//    thread { //the app will wait for this to finish
//        println("Fake work strats: ${Thread.currentThread().name}")
//        Thread.sleep(2000) //pretending to do some work
//        println("Fake work finished: ${Thread.currentThread().name}")
//    }
//
//    println("Mian program ends: ${Thread.currentThread().name}")

    println("\n")
    // with Coroutine:
    println("Main program strats: ${Thread.currentThread().name}")

    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        println("Fake work strats: ${Thread.currentThread().name}")
        delay(2000L) //pretending to do some work
        println("Fake work finished: ${Thread.currentThread().name}")
    }
    runBlocking {
        parentJob.join()
    }

    println("Mian program ends: ${Thread.currentThread().name}")
}