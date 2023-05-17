fun suma(a: Int,b: Int):Int {           //normal
    return a + b
}

fun multiplicar(a: Int, b: Int) = a * b //retorno implicito

fun sumar(vararg numeros: Int): Int {   //parametros variables
    var suma = 0
    for (num in numeros) {
        suma += num
    }
    return suma
}

fun <T> concatenar(vararg elementos: T): String {  //tipo de retorno genérico
    var resultado = ""
    for (elem in elementos) {
        resultado += "$elem " //Cada elemento se convierte en una cadena 
    }
    return resultado
}

fun procesar(numeros: List<Int>, operacion: (Int) -> Int): List<Int> { //funcion anonima como parametro
    val resultado = mutableListOf<Int>() //lista cambiable
    for (num in numeros) {
        resultado.add(operacion(num))  //
    }
    return resultado
}

fun String.reverso(): String { //funcion de extension de clase
    return this.reversed()
}

fun main() {
    var res = suma(4, 6)
    var res = multiplicar(2,5)
    var res = sumar(1,2,3)
    var res = concatenar("Hola", "mundo", 2023, true)
    val numeros = listOf(1, 2, 3, 4, 5)
    val res = procesar(numeros) { num -> num * 2 }
    var res = "Hola mundo".reverso()
    println(res)
}