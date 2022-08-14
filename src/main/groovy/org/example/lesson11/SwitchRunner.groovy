package org.example.lesson11

class SwitchRunner {
    static void main(String[] args) {

        int x = 12

        switch (x){
            case String :   //isInstance
                println 0
                break
            case 5:         //equals
                println 1
                break
            case new Person():
                println 5
                break
            case ~/\d+/ :   //pattern.matcher(12.toString()).matches()
                println 2
                break
            case { it % 5 == 0} :
                println 3
                break
            case [1,2,4,5] :
                println 4
                break
            default:
                println "None"
                break
        }

    }
}
