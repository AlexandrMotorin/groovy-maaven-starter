package org.example.lesson17

class OOPRunner {
    static void main(String[] args) {

        def student = new Student();

        student.firstname = "Ivan"
//        println student.firstname

        //к полям можно обращаться как к map
        student['firstname']
        student.'firstname'

        //обратиться напрямую к полю (not recommended)
//        println student.@firstname

        def student1 = new Student(firstname: "Petr", lastname: "Petrov", age: 15)
//        println student1

        Student student2 = ['Sveta', 'Sveticova', 12]   //должен быть конструктор с тремя параметрами (принуждением)

        def (name, lastname) = student2
//        println name
//        println lastname

        assert [student1, student2].collect { it.firstname } == ['Petr', 'Sveta']
        assert [student1, student2]*.firstname == ['Petr', 'Sveta']

//        student2.properties.each { println it}
//
//
//        student2.id = 222
//        println student1
//        println student2


        String.mixin(OOPRunner.class)   //все статические методы будут добавлены в класс String

        "Sergey".printStr()
    }

    def static printStr(String self){
        printf "It's mixin $self"
    }
}
