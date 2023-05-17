fun main() {
    print("Ingrese su nombre: ")
    val name = readLine() // Lee la entrada del usuario como una cadena de texto
    println("Hola, $name!") // Imprime el mensaje con el nombre ingresado por el usuario
}

fun main() {
    val age = 25
    print("Mi edad es ")
    println(age) // Imprime la edad en una nueva línea
}



import java.io.File

fun main() {
    // Escritura de archivo
    val content = "Este es el contenido del archivo."
    File("archivo.txt").writeText(content)

    // Lectura de archivo
    val fileContent = File("archivo.txt").readText()
    println(fileContent) // Imprime el contenido del archivo

    // Escritura de varias líneas en un archivo
    val lines = listOf("Línea 1", "Línea 2", "Línea 3")
    File("archivo2.txt").writeLines(lines)

    // Lectura de varias líneas de un archivo
    val fileLines = File("archivo2.txt").readLines()
    fileLines.forEach { println(it) } // Imprime cada línea en una nueva línea
}