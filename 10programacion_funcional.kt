// Ejemplo simple de Programación Funcional
val listaNumeros = listOf(1, 2, 3, 4, 5)
val suma = listaNumeros.reduce { acc, num -> acc + num } // suma = 15

val listaPares = listaNumeros.filter { it % 2 == 0 } // [2, 4]

// Ejemplo complejo de Programación Funcional
data class Persona(val nombre: String, val edad: Int, val email: String)

val listaPersonas = listOf(
    Persona("Juan", 30, "juan@gmail.com"),
    Persona("María", 25, "maria@hotmail.com"),
    Persona("Pedro", 40, "pedro@gmail.com"),
    Persona("Lucía", 20, "lucia@hotmail.com")
)

val listaNombres = listaPersonas
    .filter { it.edad >= 30 } // Filtra personas mayores de 30 años
    .sortedBy { it.nombre } // Ordena por nombre
    .map { it.nombre } // Extrae los nombres de las personas filtradas y ordenadas

// listaNombres = ["Juan", "Pedro"]