package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.Bank

fun main() {
    val digiOneBank = Bank(name = "DigiOne", number = 12)

    println(digiOneBank.name)
    println(digiOneBank.number)

    val bank2 = digiOneBank.copy("Bank2")

    println(bank2.name)
    println(bank2.number)
}