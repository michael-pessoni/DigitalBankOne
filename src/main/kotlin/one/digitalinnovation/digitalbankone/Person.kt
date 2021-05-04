package one.digitalinnovation.digitalbankone

class Person {
    var name: String = "Michael"
    var cpf: String = "123.321.123-00"
    private set

    constructor()

    fun personInfo() = "$name e $cpf"
}

fun main(){
    val michael = Person()

    println(michael.personInfo())
}