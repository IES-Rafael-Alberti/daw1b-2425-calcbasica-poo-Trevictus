package model

interface otor {
    fun pedirNumero(): Double

    fun pedirOperador(): Double

    fun mostrarError(error: String, msg: String = "ERROR. Dato inválido -> ")

    fun mostrarOperacion(num1: Double, num2: Double): Double
}