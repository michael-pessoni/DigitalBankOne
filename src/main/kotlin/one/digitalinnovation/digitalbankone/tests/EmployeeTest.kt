package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.Employee
import java.math.BigDecimal

fun main(){
    val michael = Employee(name = "Michael", cpf = "000.000.000-00", salary = BigDecimal.valueOf(8888.88))

    println(michael.name)
    println(michael.cpf)
    println(michael.salary)
}