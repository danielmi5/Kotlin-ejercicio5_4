class CorreoElectronico(private val email: String, private val asunto: String, private val mensaje: String):  Notificable {
    override fun enviarNotificacion() {
        super.enviarNotificacion()
        println("De: $email\nAsunto: $asunto\nMensaje: $mensaje")
        println("-".repeat(40))
    }
}