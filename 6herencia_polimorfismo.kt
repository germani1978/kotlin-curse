// Ejemplo simple de Herencia
open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("El animal hace un sonido")
    }
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("El perro ladra")
    }
}

val miPerro = Perro("Fido")
miPerro.hacerSonido() // "El perro ladra"






// Ejemplo avanzado de Herencia
open class Forma(val color: String) {
    open fun dibujar() {
        println("Se dibuja una forma de color $color")
    }
}

class Rectangulo(color: String, val ancho: Double, val alto: Double) : Forma(color) {
    override fun dibujar() {
        println("Se dibuja un rectángulo de color $color, ancho $ancho y alto $alto")
    }
    
    fun calcularArea(): Double {
        return ancho * alto
    }
}

val miRectangulo = Rectangulo("Rojo", 5.0, 3.0)
miRectangulo.dibujar() // "Se dibuja un rectángulo de color Rojo, ancho 5.0 y alto 3.0"
println("El área del rectángulo es: ${miRectangulo.calcularArea()}") // "El área del rectángulo es: 15.0"




// Ejemplo simple de Polimorfismo
fun hacerSonarAnimal(animal: Animal) {
    animal.hacerSonido()
}

val miGato = Animal("Mittens")
hacerSonarAnimal(miGato) // "El animal hace un sonido"

val miPerro = Perro("Fido")
hacerSonarAnimal(miPerro) // "El perro ladra"

// Ejemplo avanzado de Polimorfismo
fun dibujarForma(forma: Forma) {
    forma.dibujar()
}

val miForma: Forma = Rectangulo("Azul", 4.0, 2.0)
dibujarForma(miForma) // "Se dibuja un rectángulo de color Azul, ancho 4.0 y alto 2.0"