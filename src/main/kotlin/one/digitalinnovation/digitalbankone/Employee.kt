package one.digitalinnovation.digitalbankone

import java.math.BigDecimal

abstract class Employee (
    name: String,
    cpf: String,
    val salary: Double
    ) : Person(name, cpf) {
           protected abstract fun calculateBonus() : Double

    override fun toString(): String = """
        Name: $name
        CPF: $cpf
        Salary: $salary
        Bonus: ${calculateBonus()}
    """.trimIndent()
}