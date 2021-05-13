package one.digitalinnovation.digitalbankone.tests

import one.digitalinnovation.digitalbankone.Employee

class employeeInfoPrint {
    companion object {
        fun info(employee: Employee) {
            println(
                employee.toString()
            )
        }
    }
}