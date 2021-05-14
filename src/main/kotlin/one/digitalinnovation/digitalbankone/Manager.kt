package one.digitalinnovation.digitalbankone

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee(name, cpf, salary), Logable {
    override fun calculateBonus(): Double = salary * 0.4
    override fun login(): Boolean = "senha123" == password
}