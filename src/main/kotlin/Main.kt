import model.Calculadora
import service.ServCalculadora
import ui.Consola

fun main() {
    app.Menu(ServCalculadora(Calculadora()), Consola()).iniciar()
}