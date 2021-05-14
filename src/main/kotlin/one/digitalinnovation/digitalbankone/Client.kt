package one.digitalinnovation.digitalbankone

class Client(
    name: String,
    cpf: String,
    val clientType: ClientType,
    val pasword: String
) : Person(name, cpf), Logable {
    override fun login(): Boolean = "123456" == pasword

    override fun toString(): String = """
        Name: $name
        CPF: $cpf
        Tipo: ${clientType.description}
    """.trimIndent()
}