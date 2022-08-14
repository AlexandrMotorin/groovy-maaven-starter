package org.example.lesson26.task3

/**
 *  3. Реализовать механизм тестирования через BDD:
 given {
 a = 2
 b = 4
 } when {
 result = a + b
 } then {
 result == 6
 }
 */

class Task3 {

    static void main(String[] args) {

        given {
            a = 2
            b = 4
        } when {
            result = a + b
        } then {
            result == 6
        }


    }

    static def given(Closure closure){
        def valueHolder = [:]
        valueHolder.with {closure}
        ["when" : { Closure whenClosure -> {
            valueHolder.with {whenClosure}
            ["then" : { Closure thenClosure -> {
                valueHolder.with {thenClosure}
            }
            }]
        }
        }]
    }
}
