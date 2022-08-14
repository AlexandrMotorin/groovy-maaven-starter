package org.example.lesson23

import org.example.lesson17.Student

class MissingMethodRunner {

    static void main(String[] args) {

        def student = new Student()
        student.test()
        student.childName

    }

}
