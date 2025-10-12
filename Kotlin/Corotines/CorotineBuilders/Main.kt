package org.example
import kotlinx.coroutines.*
import kotlin.concurrent.thread

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Main program strats: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val job1 = launch {
            val result1 = getData1(Thread.currentThread().name)
            println(result1)
        }

        job1.join()
        val job2 = launch {
            val result2 = getData2(Thread.currentThread().name)
            println(result2)
        }

    }

    //Without runBlocking, the program would likely end before the coroutine completes, because the main thread would exit early.
    runBlocking {// This blocks the main thread until everything inside its block finishes.
        parentJob.join() //.join() Wait for the coroutine to finish its work.
    }
    println("Total time: ${System.currentTimeMillis() - start}")


    println("Mian program ends: ${Thread.currentThread().name}")
}

private suspend fun getData1(threadName: String): String{
    println("Fake work1 starts: $threadName")
    delay(2000)
    println("Fake work1 finished: $threadName")
    return "Result 1"
}

private suspend fun getData2(threadName: String): String{
    println("Fake work2 starts: $threadName")
    delay(2000)
    println("Fake work2 finished: $threadName")
    return "Result 2"
}