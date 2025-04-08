package ui

import model.Operadores
import java.util.*

class Consola : IEntradaSalida {
    val scanner = Scanner(System.`in`)

    override fun mostrarMensaje(msj: String, pausa: Boolean, limpiar: Boolean) {
        if (pausa) {
            pausar()
        }
        if (limpiar) {
            limpiarTerminal()
        }
        println(msj)
    }

    override fun mostrarError(msj: String, msjError: String) {
        mostrarMensaje(msjError + msj)
    }

    override fun pedirOperador(): String {
        mostrarMensaje("Introduce un operador > ")
        val operador = scanner.nextLine()
        val resultado = Operadores.getOperador(operador)
        return resultado?.simbolo ?: throw IllegalArgumentException("Introduce un operador válido.")
    }

    override fun pedirNumero(): Double {
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


    private fun pausar() {
        readln()
    }

    private fun limpiarTerminal() {
        repeat(20) {
            println("\n")
        }
    }

    override fun pedirOpcion(): Boolean {
        mostrarMensaje("¿Desea realizar cálculos?")
        return when (scanner.nextLine().lowercase().trim()) {
            "s" -> true
            "n" -> false
            else -> false
        }
    }
}