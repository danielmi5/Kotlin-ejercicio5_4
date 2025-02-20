class CorreoElectronico(private val email: String, private val asunto: String, private val mensaje: String):  Notificable {
    init {
        require(email.matches(Regex("^[A-za-z0-9._-]+@[A-za-z0-9._-]+\\.[A-Za-z]{2,}$")))
    }

    override fun enviarNotificacion() {
        super.enviarNotificacion()
        println("De: $email\nAsunto: $asunto\nMensaje: $mensaje")
        println("-".repeat(40))
    }
}