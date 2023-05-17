// Ejemplo simple de Extensión de función
fun String.invertir(): String {
    return this.reversed()
}

val cadena = "Hola mundo"
val cadenaInvertida = cadena.invertir() // "odnum aloH"

// Ejemplo complejo de Extensión de función
data class Persona(val nombre: String, val edad: Int)

fun List<Persona>.obtenerNombres(): List<String> {
    return this.map { it.nombre }
}

val listaPersonas = listOf(
    Persona("Juan", 30),
    Persona("María", 25),
    Persona("Pedro", 40),
    Persona("Lucía", 20)
)

val listaNombres = listaPersonas.obtenerNombres() // ["Juan", "María", "Pedro", "Lucía"]

// Ejemplo simple de Extensión de propiedad
val String.longitud: Int
    get() = this.length

val cadena = "Hola mundo"
val longitudCadena = cadena.longitud // 10

// Ejemplo complejo de Extensión de propiedad
data class Persona(val nombre: String, val edad: Int)

val List<Persona>.promedioEdad: Double
    get() = this.map { it.edad }.average()

val listaPersonas = listOf(
    Persona("Juan", 30),
    Persona("María", 25),
    Persona("Pedro", 40),
    Persona("Lucía", 20)
)

val promedioEdadPersonas = listaPersonas.promedioEdad // 28.75