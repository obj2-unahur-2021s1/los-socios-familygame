package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class BarrioTest : DescribeSpec({
    describe("Un/a barrio"){
        val carlos = (1500.0 , Feliz, LasRosas)
        carlos.realizarPedido(1000.0)
        carlos.darPropina(carlos.importePedido, carlos.dineroEnBolsillo, carlos.estadoDeAnimo, carlos.barrio)
            .shouldBe(300)
    }
}

)

