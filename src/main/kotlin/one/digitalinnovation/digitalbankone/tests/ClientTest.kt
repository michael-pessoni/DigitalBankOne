package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.Client
import one.digitalinnovation.digitalbankone.ClientType

fun main() {
    val jose = Client(
        name = "Jose da Silva",
        cpf = "123.456.789-00",
        clientType = ClientType.PF,
        pasword = "123456"
    )

    println(jose)

    AuthenticationTest().authenticate(jose)
}