package ar.edu.unahur.obj2.socios

interface Barrio{

    fun aplicarPropinaPorBarrio(propina: Double)  : Double
}

object LasRosas : Barrio {

    override fun aplicarPropinaPorBarrio(propina: Double): Double {
        propina = propina +50
        return propina
    }


object LasLauchas : Barrio{

    override fun aplicarPropinaPorBarrio(propina: Double): Double {
        propina = propina /2
        return propina
    }
}

object LasTorres : Barrio{

    override fun aplicarPropinaPorBarrio(propina: Double): Double {
        return propina
    }
}

object BarrioVerde: Barrio{

    override fun aplicarPropinaPorBarrio(propina: Double): Double {
        If propina <= 200 {
            propina =200
        }
        return propina
    }
}

}