package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.ClientType

fun main() {
    ClientType.values().forEach { element ->
        println("${element.name} - ${element.description}")
    }

    val clientPF = ClientType.PF
    println("${clientPF.name} -> ${clientPF.description}")

    val clientPJ = ClientType.PJ
    println("${clientPJ.name} -> ${clientPJ.description}")
}