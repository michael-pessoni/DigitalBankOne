package one.digitalinnovation.digitalbankone.tests


import one.digitalinnovation.digitalbankone.Employee
import one.digitalinnovation.digitalbankone.Manager

fun main(){
    val maria = Manager(name = "Maria", cpf = "000.000.000-00", salary = 5000.00, password = "senha123")
    employeeInfoPrint.info(maria)

    AuthenticationTest().authenticate(maria)
}

