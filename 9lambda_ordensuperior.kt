// Ejemplo simple de Expresiones Lambda
val suma = { a: Int, b: Int -> a + b }
val resultado = suma(5, 7) // resultado = 12

val listaNumeros = listOf(1, 2, 3, 4, 5)
val listaCuadrados = listaNumeros.map { it * it } // [1, 4, 9, 16, 25]

// Ejemplo avanzado de Funciones de Orden Superior
fun calcular(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

val suma = { a: Int, b: Int -> a + b }
val resta = { a: Int, b: Int -> a - b }

val resultadoSuma = calcular(10, 5, suma) // resultadoSuma = 15
val resultadoResta = calcular(10, 5, resta) // resultadoResta = 5

val listaNumeros = listOf(1, 2, 3, 4, 5)
val resultadoOperacion = listaNumeros.fold(0) { acc, num -> acc + num } // resultadoOperacion = 15