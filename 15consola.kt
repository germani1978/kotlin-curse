fun main() {
    println("¿Cuál es tu nombre?")
    val nombre = readLine()
    println("Hola, $nombre!")
}


fun main(args: Array<String>) {
    when (args.firstOrNull()) {
        "saludar" -> saludar(args.drop(1))
        "repetir" -> repetir(args.drop(1))
        else -> ayuda()
    }
}

fun saludar(nombres: List<String>) {
    nombres.forEach { nombre ->
        println("Hola, $nombre!")
    }
}

fun repetir(argumentos: List<String>) {
    val (cadena, veces) = argumentos.take(2)
    repeat(veces.toInt()) {
        println(cadena)
    }
}

fun ayuda() {
    println("Uso: mi-aplicacion <accion> [<argumentos>...]")
    println("Acciones disponibles:")
    println("  saludar <nombre> [<nombre>...]   Saluda a uno o más nombres.")
    println("  repetir <cadena> <veces>         Repite la cadena especificada el número de veces especificado.")
}



$ kotlin -classpath . MiAppKt saludar Juan Pedro Maria
Hola, Juan!
Hola, Pedro!
Hola, Maria!

$ kotlin -classpath . MiAppKt repetir "Hola mundo" 3
Hola mundo
Hola mundo
Hola mundo

$ kotlin -classpath . MiAppKt
Uso: mi-aplicacion <accion> [<argumentos>...]
Acciones disponibles:
  saludar <nombre> [<nombre>...]   Saluda a uno o más nombres.
  repetir <cadena> <veces>         Repite la cadena especificada el número de veces especificado.
