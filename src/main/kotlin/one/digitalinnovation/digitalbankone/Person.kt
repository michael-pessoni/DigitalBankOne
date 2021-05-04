package one.digitalinnovation.digitalbankone

class Person {
    var name: String = "Michael"
    var cpf: String = "123.321.123-00"
    private set

}

fun main(){
    val michael = Person()

    println(michael.name)
    println(michael.cpf)
}