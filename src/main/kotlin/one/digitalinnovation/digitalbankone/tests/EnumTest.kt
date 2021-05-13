package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.ClientType

fun main() {
    ClientType.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val clientPF = ClientType.PF
    println("${clientPF.name} -> ${clientPF.description}")

    val clientPJ = ClientType.PJ
    println("${clientPJ.name} -> ${clientPJ.description}")
}