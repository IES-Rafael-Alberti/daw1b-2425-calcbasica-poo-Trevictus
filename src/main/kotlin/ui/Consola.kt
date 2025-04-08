package ui

import java.util.*

class Consola:IEntradaSalida {
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
        TODO("Not yet implemented")
    }

    override fun pedirOperador(): String {
        TODO("Not yet implemented")
    }

    override fun pedirNumero(): Double {
        TODO("Not yet implemented")
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
        return when(scanner.nextLine().lowercase().trim()) {
            "s" -> true
            "n" -> false
            else -> false
        }
    }
}