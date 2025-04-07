package src

import java.util.Scanner

class Calculadora(): Icalculadora{
    override fun pedirNumero(): Double {
        val scanner = Scanner(System.`in`)
        while(true){
            try{
                println("Introduce un numero: ")
                val num: Double = scanner.nextDouble()
                return num
            }catch (e: NumberFormatException){
                mostrarError()
            }
        }
    }

    override fun pedirOperador(): Double {
        val scanner = Scanner(System.`in`)
        val operador: String = scanner.toString()
        when(operador){
            "+" -> pedirNumero() + pedirNumero()
            "-" -> pedirNumero() - pedirNumero()
            "*" -> pedirNumero() * pedirNumero()
            "/" -> pedirNumero() / pedirNumero()
        }

    }

    override fun mostrarError(msg: String): String {
        return msg
    }

    override fun mostrarOperacion(num1: Double, num2: Double): Double {
        TODO("Not yet implemented")
    }

}
