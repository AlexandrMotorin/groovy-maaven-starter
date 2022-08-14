package org.example.lesson24

import org.example.lesson17.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr(){
        println "$age, $firstname"
    }

}
