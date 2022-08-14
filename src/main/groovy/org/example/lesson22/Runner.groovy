package org.example.lesson22

import org.codehaus.groovy.runtime.DefaultGroovyMethods
import org.example.lesson17.Student

class Runner {
    static void main(String[] args) {
        def customMetaClass = new CustomMetaClass();

//        println "hello"
        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMetaClass.methods.put("println", method)

        def student = new Student()
        def printlnMethod = customMetaClass.methods.get("println")

//        printlnMethod.invoke(student, student, "Test 2")

        println student.metaClass
    }
}
