package model

enum class Operadores(val simbolo: String) {
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/");

    companion object{
        fun getOperador(valor: String): Operadores?{
            return when(valor.trim().lowercase()){
                "+" -> SUMA
                "-" -> RESTA
                "*" -> MULTIPLICACION
                "/" -> DIVISION
                else -> null
            }
        }
    }
}