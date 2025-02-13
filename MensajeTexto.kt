class MensajeTexto(private val autor: String, private val texto: String): Notificable {
    override fun enviarNotificacion() {
        super.enviarNotificacion()
        println("Autor: $autor\nMensaje: $texto")
        println("-".repeat(40))

    }
}