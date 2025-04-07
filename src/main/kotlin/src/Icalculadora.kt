package src

interface Icalculadora {
    fun pedirNumero(): Double

    fun pedirOperador(): Double

    fun mostrarError(msg: String = "ERROR. Dato inválido -> "): String

    fun mostrarOperacion(num1: Double, num2: Double): Double
}