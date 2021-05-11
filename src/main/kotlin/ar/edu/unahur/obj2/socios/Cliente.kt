package ar.edu.unahur.obj2.socios

class Cliente(private var dineroEnBolsillo : Double, private var estadoDeAnimo: EstadosDeAnimo, private var barrio: Barrio) {

    private var importePedido : Double = 0.0

    fun realizarPedido(importe : Double) {
        this.importePedido = importe
    }

    fun darPropina(): Double {
        val propina = estadoDeAnimo.aplicarEstadoAnimo(importePedido, dineroEnBolsillo)
        return barrio.aplicarPropinaPorBarrio(propina)
    }

}
