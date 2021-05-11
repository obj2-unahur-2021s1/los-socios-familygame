package ar.edu.unahur.obj2.socios

interface Barrio{

    fun aplicarPropinaPorBarrio(propina: Double)  : Double
}

object LasRosas : Barrio {

    override fun aplicarPropinaPorBarrio(propina: Double) = propina.plus(50.0)
}

object LasLauchas : Barrio{

    override fun aplicarPropinaPorBarrio(propina: Double) = propina.div(2)
}

object LasTorres : Barrio {

    override fun aplicarPropinaPorBarrio(propina: Double) = propina

}

object BarrioVerde: Barrio{

    override fun aplicarPropinaPorBarrio(propina: Double): Double {
        if (propina <= 200.0) {
            return 200.0
        }
        return propina
    }
}

