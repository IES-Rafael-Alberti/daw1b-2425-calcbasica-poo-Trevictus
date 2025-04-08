package model

import java.util.InputMismatchException
import java.util.Scanner

class otoro(): otor{
    override fun pedirNumero(): Double {
        val scanner = Scanner(System.`in`)
        while(true){
            try{
                println("Introduce un numero: ")
                val entrada = scanner.nextLine()
                if(entrada.isBlank()){
                    throw InputMismatchException()
                }
                val num = entrada.toDouble()
                return num
            }catch (e: NumberFormatException){
                mostrarError("$e")
                scanner.nextLine()
            }catch(e: InputMismatchException){
                mostrarError("$e")
                scanner.nextLine()
            }
        }
    }

    override fun pedirOperador(): Double {
//        val scanner = Scanner(System.`in`)
//        val operador: String = scanner.toString()
//        when(operador){
//            "+" -> pedirNumero() + pedirNumero()
//            "-" -> pedirNumero() - pedirNumero()
//            "*" -> pedirNumero() * pedirNumero()
//            "/" -> pedirNumero() / pedirNumero()
//        }
TODO()
    }

    override fun mostrarError(error: String, msg: String){
        println(msg + error)
    }

    override fun mostrarOperacion(num1: Double, num2: Double): Double {
        TODO("Not yet implemented")
    }

}
