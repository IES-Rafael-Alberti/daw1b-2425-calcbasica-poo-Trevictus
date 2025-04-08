package service

import model.Calculadora

class ServCalculadora(val calculadora: Calculadora) {
    fun sumar(num1: Double, num2: Double): Double {
        return calculadora.sumar(num1, num2)
    }

    fun restar(num1: Double, num2: Double): Double {
        return calculadora.restar(num1, num2)
    }

    fun multiplicar(num1: Double, num2: Double): Double {
        return calculadora.multiplicar(num1, num2)
    }

    fun dividir(num1: Double, num2: Double): Double {
        return calculadora.dividir(num1, num2)
    }

}