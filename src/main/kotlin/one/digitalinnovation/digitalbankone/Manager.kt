package one.digitalinnovation.digitalbankone

class Manager(
    name: String,
    cpf: String,
    salary: Double
) : Employee(name, cpf, salary) {
    override fun calculateBonus(): Double = salary * 0.4
}