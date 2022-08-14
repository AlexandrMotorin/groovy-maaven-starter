package org.example.lesson25

import org.example.lesson17.Student

class Closure2Runner {

    static void main(String[] args) {

        Closure closure = {
            firstname = "Sveta"
        }

        println closure.thisObject   // объект к которому обращаемся в closure используя this
        println closure.owner        // объект где определили closure
        println closure.delegate     // по умолчанию - owner, поля для изменения owner

        def student = new Student("Ivan", "Ivanov", 25)
        student.id = 1

        println student

        closure.delegate = student
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure()

        println student
        student.with closure
    }

}
