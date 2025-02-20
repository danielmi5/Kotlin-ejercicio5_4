fun main(){
    val mensajeTexto = "¡Hola! 😊 Solo quería saludarte y desearte un excelente día. Espero que todo esté yendo bien. ¡Hablamos pronto!"
    val mensajeCorreo: String = """Estimado Diego,

    Espero que este correo le encuentre bien. Me comunico con usted para...

    Quedo atento a su respuesta y a cualquier información adicional que pueda necesitar. Aprecio su tiempo y colaboración.

    Saludos cordiales,
    ..."""

    val noti = "DESPIERTA, tienes que hacer el ejercicio 4."

    val correo = CorreoElectronico("yo@correo.noes", "Ejercicios", mensajeCorreo)

    val notificaciones = listOf<Notificable>(correo, MensajeTexto("Daniel", mensajeTexto), NotificacionPush("EJERCICIOS",noti))

    for (i in 1..notificaciones.size){
        notificaciones[i-1].enviarNotificacion()
        print("Presiona ENTER para continuar..."); readln()
        println()
    }
    println("Ya no hay más notificaciones.")
}

