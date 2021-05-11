package ar.edu.unahur.obj2.socios


interface EstadosDeAnimo{

    fun aplicarEstadoAnimo(importePedido: Double, dineroEnBolsillo: Double) : Double
}

object Feliz : EstadosDeAnimo {

    override fun aplicarEstadoAnimo(importePedido: Double, dineroEnBolsillo: Double) =
        importePedido * 0.25
}

object Enojado : EstadosDeAnimo {

    override fun aplicarEstadoAnimo(importePedido: Double, dineroEnBolsillo: Double) =
        0.0
}

object Indiferente : EstadosDeAnimo {

    override fun aplicarEstadoAnimo(importePedido: Double, dineroEnBolsillo: Double) =
        dineroEnBolsillo
}

object Resfriado : EstadosDeAnimo {

    override fun aplicarEstadoAnimo(importePedido: Double, dineroEnBolsillo: Double) =
        importePedido
}
