// Ejemplo de clase básica
class Persona {
    var nombre: String = ""
    var edad: Int = 0
    
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}

// Ejemplo de clase con constructor primario
class Animal(nombre: String, especie: String) {
    var nombre: String = nombre
    var especie: String = especie
    
    fun hacerSonido() {
        println("$nombre hace un sonido")
    }
}

// Ejemplo de clase con herencia
open class Vehiculo {
    var marca: String = ""
    var modelo: String = ""
    
    fun encender() {
        println("El vehículo $marca $modelo está encendido")
    }
}

class Auto : Vehiculo() {
    var color: String = ""
    
    fun acelerar() {
        println("El auto $marca $modelo de color $color está acelerando")
    }
}

// Ejemplo de clase abstracta. 
//     solo se puede heredar de una sol clase abstracta. permiten definir comportamiento común y propiedades concretas, además de métodos 
//     abstractos que deben ser implementados por las subclases

abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

class Rectangulo(val base: Double, val altura: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }
    
    override fun calcularPerimetro(): Double {
        return (2 * base) + (2 * altura)
    }
}

// Ejemplo de interfaz
//       solo definen los métodos que deben ser implementados.
interface VehiculoElectrico {
    fun cargarBateria()
    fun conducir()
}

class BicicletaElectrica : VehiculoElectrico {
    override fun cargarBateria() {
        println("La bici eléctrica está cargando su batería")
    }
    
    override fun conducir() {
        println("La bici eléctrica está en movimiento")
    }
}

// Ejemplo de clase sellada
sealed class Resultado {
    class Exitoso(val mensaje: String) : Resultado()
    class Fallido(val error: Throwable) : Resultado()
}

fun procesarResultado(resultado: Resultado) {
    when (resultado) {
        is Resultado.Exitoso -> {
            println("El resultado fue exitoso: ${resultado.mensaje}")
        }
        is Resultado.Fallido -> {
            println("El resultado falló: ${resultado.error.message}")
        }
    }
}

fun main() {
    val resultadoExitoso = Resultado.Exitoso("Operación exitosa")
    val resultadoFallido = Resultado.Fallido(Exception("Error en la operación"))

    procesarResultado(resultadoExitoso)
    procesarResultado(resultadoFallido)
}



// Ejemplo de clase de datos
data class Usuario(val nombre: String, val email: String, val edad: Int)

val usuario = Usuario("Juan", "juan@gmail.com", 25)
val copiaUsuario = usuario.copy()

// Ejemplo de clase interna y anidada
class Universidad(val nombre: String) {
    inner class Estudiante(val nombre: String) {
        fun inscribirse() {
            println("$nombre se ha inscrito en la universidad $nombre")
        }
    }
    
    class Profesor(val nombre: String) {
        fun ensenar() {
            println("$nombre está enseñando en la universidad $nombre")
        }
    }
}

val universidad = Universidad("UABC")
val estudiante = universidad.Estudiante("Ana")
val profesor = Universidad.Profesor("Pedro")

// Ejemplo de clases genéricas
class Contenedor<T>(var contenido: T) {
    fun mostrar() {
        println("El contenido es: $contenido")
    }
}

val contenedor1 = Contenedor("Hola mundo")
val contenedor2 = Contenedor(42)

// Ejemplo de extensión de clases
fun String.reemplazarVocales(): String {
    return this.replace("a", "@")
            .replace("e", "3")
            .replace("i", "1")
            .replace("o", "0")
            .replace("u", "ü")
}

val texto = "Hola mundo"
val x = texto.reemplazarVocales()
println(texto.reemplazarVocales()) // "Hül@ münd0"