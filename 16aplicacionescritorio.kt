//app de escritorio que pone "Hello World"

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.text.Text
import javafx.stage.Stage

class HelloWorld : Application() {
    override fun start(primaryStage: Stage) {
        val root = StackPane()
        val scene = Scene(root, 300.0, 250.0)
        val text = Text("Hola Mundo")
        root.children.add(text)
        primaryStage.title = "Hola Mundo"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(HelloWorld::class.java)
}


//app calculadora

class Calculator : Application() {

    private var currentOperator: String = ""
    private var currentNumber: Double = 0.0
    private var result: Double = 0.0

    override fun start(primaryStage: Stage) {
        primaryStage.title = "Calculator"

        val grid = GridPane()
        grid.alignment = Pos.CENTER
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.padding = Insets(25.0, 25.0, 25.0, 25.0)

        val scene = Scene(grid, 300.0, 275.0)
        primaryStage.scene = scene

        val display = TextField()
        display.isEditable = false
        grid.add(display, 0, 0, 4, 1)

        val buttons = arrayOf(
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        )

        var row = 1
        var col = 0
        for (button in buttons) {
            val btn = Button(button)
            btn.prefWidth = 60.0
            btn.prefHeight = 30.0
            btn.setOnAction {
                when (button) {
                    in "0123456789." -> {
                        display.text += button
                    }
                    "+" -> {
                        currentOperator = "+"
                        currentNumber = display.text.toDouble()
                        display.clear()
                    }
                    "-" -> {
                        currentOperator = "-"
                        currentNumber = display.text.toDouble()
                        display.clear()
                    }
                    "*" -> {
                        currentOperator = "*"
                        currentNumber = display.text.toDouble()
                        display.clear()
                    }
                    "/" -> {
                        currentOperator = "/"
                        currentNumber = display.text.toDouble()
                        display.clear()
                    }
                    "=" -> {
                        val secondNumber = display.text.toDouble()
                        result = when (currentOperator) {
                            "+" -> currentNumber + secondNumber
                            "-" -> currentNumber - secondNumber
                            "*" -> currentNumber * secondNumber
                            "/" -> currentNumber / secondNumber
                            else -> 0.0
                        }
                        display.text = result.toString()
                    }
                    else -> {}
                }
            }
            grid.add(btn, col, row)
            col++
            if (col == 4) {
                col = 0
                row++
            }
        }

        primaryStage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Calculator::class.java)
        }
    }
}

