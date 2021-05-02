package ar.edu.unahur.obj2.socios

//TODO: Agregar interface Barrio de la misma forma que con los estados
//TODO: Agregar el barrio al constructor del cliente
//TODO: Agregar la variacion por barrio al metodo de darPropina
//TODO: Agregar tests y/o modificar los que estan

class Cliente(var dineroEnBolsillo : Double, var estadoDeAnimo: EstadosDeAnimo) {

    var importePedido : Double = 0.0

    fun realizarPedido(importe : Double) {
        this.importePedido = importe
    }

    fun darPropina(importePedido : Double, dineroEnBolsillo: Double, estadoDeAnimo: EstadosDeAnimo) =
        estadoDeAnimo.aplicarEstadoAnimo(importePedido, dineroEnBolsillo)

}
