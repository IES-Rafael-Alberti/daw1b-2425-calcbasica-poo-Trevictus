import app.Menu
import model.Calculadora
import service.ServCalculadora
import ui.Consola

fun main() {
    Menu(ServCalculadora(Calculadora()), Consola()).iniciar()
}