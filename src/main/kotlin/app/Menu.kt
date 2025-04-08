package app

import service.ServCalculadora
import ui.IEntradaSalida

class Menu(private val calculadora: ServCalculadora, private val consola: IEntradaSalida) {

    fun iniciar() {
        consola.mostrarMensaje("***CALCULADORA 3000***")
        var opcion = consola.pedirOpcion()

        while (opcion) {
            try {
                val num1 = consola.pedirNumero()
                val num2 = consola.pedirNumero()
                val operador = consola.pedirOperador()
                val resultado = when (operador) {
                    "+" -> calculadora.sumar(num1, num2)
                    "-" -> calculadora.restar(num1, num2)
                    "*" -> calculadora.multiplicar(num1, num2)
                    "/" -> calculadora.dividir(num1, num2)
                    else -> throw IllegalArgumentException("Operador no válido")
                }
                consola.mostrarMensaje(resultado.toString())
            } catch (e: IllegalArgumentException) {
                consola.mostrarError(e.message.toString())
            }
            opcion = consola.pedirOpcion()
        }
    }
}