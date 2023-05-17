//Ejecutar una tarea en segundo plano y actualizar la UI cuando termine
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launch {
        // Corutina en segundo plano
        val result = getResultFromApi()
        
        // Actualizar la UI en el hilo principal
        withContext(Dispatchers.Main) {
            updateUi(result)
        }
    }
}

suspend fun getResultFromApi(): String {
    delay(1000) // Simula una espera de 1 segundo
    return "Resultado de la API"
}

fun updateUi(result: String) {
    println(result) // Imprime el resultado
}

//Ejecutar varias tareas en segundo plano al mismo tiempo:

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val deferred1 = async { getResultFromApi1() }
    val deferred2 = async { getResultFromApi2() }
    
    // Esperar a que ambas corutinas terminen
    val result1 = deferred1.await()
    val result2 = deferred2.await()
    
    // Hacer algo con los resultados
    println("Resultado 1: $result1")
    println("Resultado 2: $result2")
}

suspend fun getResultFromApi1(): String {
    delay(1000) // Simula una espera de 1 segundo
    return "Resultado 1 de la API"
}

suspend fun getResultFromApi2(): String {
    delay(2000) // Simula una espera de 2 segundos
    return "Resultado 2 de la API"
}

//Cancelar una tarea en segundo plano si toma demasiado tiempo:
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    withTimeoutOrNull(1500) {
        repeat(1000) { i ->
            println("Segundos transcurridos: $i")
            delay(500)
        }
    }
}

