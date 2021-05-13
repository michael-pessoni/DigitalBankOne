package one.digitalinnovation.digitalbankone

import java.math.BigDecimal

class Analist(name: String, cpf: String, salary: Double) : Employee(name, cpf, salary) {
    override fun calculateBonus() = salary * 0.1
}