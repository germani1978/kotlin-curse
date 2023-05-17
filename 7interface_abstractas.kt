// Ejemplo simple de Interfaces
interface Comestible {
    fun comer()
}

class Fruta(val nombre: String) : Comestible {
    override fun comer() {
        println("Estoy comiendo una fruta llamada $nombre")
    }
}

val miFruta = Fruta("Manzana")
miFruta.comer() // "Estoy comiendo una fruta llamada Manzana"

// Ejemplo avanzado de Interfaces
interface Animal {
    fun hacerSonido()
}

class Perro : Animal {
    override fun hacerSonido() {
        println("El perro ladra")
    }
}

class Gato : Animal {
    override fun hacerSonido() {
        println("El gato maulla")
    }
}

fun hacerSonarAnimal(animal: Animal) {
    animal.hacerSonido()
}

val miPerro = Perro()
hacerSonarAnimal(miPerro) // "El perro ladra"

val miGato = Gato()
hacerSonarAnimal(miGato) // "El gato maulla"

// Ejemplo simple de Clases Abstractas
abstract class Figura(val color: String) {
    abstract fun calcularArea(): Double
}

class Cuadrado(color: String, val lado: Double) : Figura(color) {
    override fun calcularArea(): Double {
        return lado * lado
    }
}

val miCuadrado = Cuadrado("Azul", 5.0)
println("El área del cuadrado es: ${miCuadrado.calcularArea()}") // "El área del cuadrado es: 25.0"

// Ejemplo avanzado de Clases Abstractas
abstract class Persona(val nombre: String) {
    abstract fun saludar()
}

class Estudiante(nombre: String) : Persona(nombre) {
    override fun saludar() {
        println("Hola, soy $nombre y soy estudiante")
    }
}

class Profesor(nombre: String) : Persona(nombre) {
    override fun saludar() {
        println("Hola, soy $nombre y soy profesor")
    }
}

fun presentarPersona(persona: Persona) {
    persona.saludar()
}

val miEstudiante = Estudiante("Juan")
presentarPersona(miEstudiante) // "Hola, soy Juan y soy estudiante"

val miProfesor = Profesor("María")
presentarPersona(miProfesor) // "Hola, soy María y soy profesor"