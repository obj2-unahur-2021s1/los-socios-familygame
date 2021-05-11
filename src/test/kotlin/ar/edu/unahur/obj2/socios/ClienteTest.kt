package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("Feliz"){
      val agustin = Cliente(1500.0, Feliz, LasRosas)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo, agustin.barrio)
        .shouldBe(300)
    }
    it("Enojado"){
      val agustin = Cliente(1500.0, Enojado, LasLauchas)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo, agustin.barrio)
        .shouldBe(0)
    }
    it("Indiferente") {
      val agustin = Cliente(1500.0, Indiferente, LasTorres)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo, agustin.barrio)
        .shouldBe(1500)
    }
    it("Resfriado"){
      val agustin = Cliente(1500.0, Resfriado, BarrioVerde)
      agustin.realizarPedido(100.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo, agustin.barrio)
        .shouldBe(200)
    }
  }
})
