package org.example.lesson11

class Person {
    String name
    int age

    boolean isCase(Object switchValue){
        println "invoke is case, switchValue: $switchValue"
        return false
    }
}
