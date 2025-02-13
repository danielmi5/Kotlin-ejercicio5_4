class NotificacionPush(private val titulo: String, private val mensaje: String) : Notificable {
    override fun enviarNotificacion() {
        super.enviarNotificacion()
        println("Título: $titulo\nMensaje: $mensaje")
        println("-".repeat(40))

    }
}