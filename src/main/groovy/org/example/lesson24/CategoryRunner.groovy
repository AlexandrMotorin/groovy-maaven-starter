package org.example.lesson24

import org.example.lesson17.Student

class CategoryRunner {
    static void main(String[] args) {

        def student = new Student("age": 18, "firstname": "Ivan")

        use(DefaultStudentMethods){
            student.testStr()
        }

    }
}
