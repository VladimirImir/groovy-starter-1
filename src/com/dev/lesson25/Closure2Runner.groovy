package com.dev.lesson25

import com.dev.lesson24.Student

class Closure2Runner {

    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        println closure.thisObject
        println closure.owner
        println closure.delegate

        def student = new Student("Ivan", "Ivanov", 29)
        println student

        /*losure.delegate = student
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()*/
        student.with closure

        println student

        student.getInfo()()
    }
}
