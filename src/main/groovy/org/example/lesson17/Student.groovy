package org.example.lesson17

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Student implements WithId{

    String firstname
    String lastname
    Integer age

    def getAt(int index){
        index == 0 ? firstname : lastname
    }

    def methodMissing(String name, Object args){
        println "missing method $name is invoked: $args"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value"
    }

}
