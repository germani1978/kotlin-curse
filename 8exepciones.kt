// Ejemplo simple de Manejo de Excepciones
fun dividirNumeros(a: Int, b: Int): Int {
    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Error: No se puede dividir por cero")
        return 0
    }
}

val resultado = dividirNumeros(10, 0) // "Error: No se puede dividir por cero"
println("El resultado de la división es: $resultado") // "El resultado de la división es: 0"

// Ejemplo avanzado de Manejo de Excepciones
class MyException(message: String) : Exception(message)

fun validarEdad(edad: Int) {
    if (edad < 0) {
        throw MyException("La edad no puede ser negativa")
    } else if (edad > 120) {
        throw MyException("La edad no puede ser mayor a 120 años")
    } else {
        println("La edad es válida")
    }
}

try {
    validarEdad(-10) // Lanza una excepción
} catch (e: MyException) {
    println("Error: ${e.message}")
}

try {
    validarEdad(150) // Lanza una excepción
} catch (e: MyException) {
    println("Error: ${e.message}")
}

try {
    validarEdad(25) // No lanza excepción
} catch (e: MyException) {
    println("Error: ${e.message}")
}