package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    it("Feliz"){
      val agustin = Cliente(1500.0, Feliz)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo)
        .shouldBe(250)
    }
    it("Enojado"){
      val agustin = Cliente(1500.0, Enojado)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo)
        .shouldBe(0)
    }
    it("Indiferente") {
      val agustin = Cliente(1500.0, Indiferente)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo)
        .shouldBe(1500)
    }
    it("Resfriado"){
      val agustin = Cliente(1500.0, Resfriado)
      agustin.realizarPedido(1000.0)
      agustin.darPropina(agustin.importePedido, agustin.dineroEnBolsillo, agustin.estadoDeAnimo)
        .shouldBe(1000)
    }
  }
})
