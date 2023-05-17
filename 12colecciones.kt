// Ejemplo simple de Listas
val listaNumeros = listOf(1, 2, 3, 4, 5)

val primerNumero = listaNumeros.first() // 1
val ultimoNumero = listaNumeros.last() // 5
val tercerNumero = listaNumeros.get(2) // 3
val indiceDelNumeroTres = listaNumeros.indexOf(3) // 2

// Ejemplo complejo de Listas
val listaPersonas = listOf(
    Persona("Juan", 30),
    Persona("María", 25),
    Persona("Pedro", 40),
    Persona("Lucía", 20)
)

val personasMenoresDe30 = listaPersonas.filter { it.edad < 30 }
val nombresPersonasMenoresDe30 = personasMenoresDe30.map { it.nombre }
val nombresPersonasMenoresDe30Ordenados = nombresPersonasMenoresDe30.sorted()

// Ejemplo simple de Mapas
val mapaColores = mapOf("rojo" to "#FF0000", "verde" to "#00FF00", "azul" to "#0000FF")

val codigoColorRojo = mapaColores.get("rojo") // "#FF0000"
val codigoColorAmarillo = mapaColores.getOrDefault("amarillo", "#FFFF00") // "#FFFF00"

// Ejemplo complejo de Mapas
data class Producto(val nombre: String, val precio: Double)

val productos = listOf(
    Producto("Laptop", 800.0),
    Producto("Smartphone", 500.0),
    Producto("Tablet", 350.0),
    Producto("Auriculares", 100.0)
)

val productosPorPrecio = productos.sortedBy { it.precio }
val productosConDescuento = productos.map { it.copy(precio = it.precio * 0.9) }
val promedioPrecioProductosConDescuento = productosConDescuento.map { it.precio }.average()

// Ejemplo simple de Set
val conjuntoNumeros = setOf(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)

val cantidadNumeros = conjuntoNumeros.size // 5
val contieneNumeroSeis = conjuntoNumeros.contains(6) // false

// Ejemplo complejo de Set
val conjuntoPersonas1 = setOf(
    Persona("Juan", 30),
    Persona("María", 25),
    Persona("Pedro", 40),
    Persona("Lucía", 20)
)

val conjuntoPersonas2 = setOf(
    Persona("María", 25),
    Persona("Lucas", 35),
    Persona("Ana", 27),
    Persona("Pedro", 40)
)

val personasUnicas = conjuntoPersonas1.union(conjuntoPersonas2)
val personasComunes = conjuntoPersonas1.intersect(conjuntoPersonas2)