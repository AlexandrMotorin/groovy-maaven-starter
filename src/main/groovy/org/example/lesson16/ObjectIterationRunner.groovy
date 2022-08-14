package org.example.lesson16

import org.example.lesson11.Person

class ObjectIterationRunner {
    static void main(String[] args) {

        assert [4,2,5,1,6,7].any{it % 2 == 0}
        assert [4,2,5,1,6,7].find{it % 2 == 0} == 4
        assert [4,2,5,1,6,7].findAll{it % 2 != 0} == [5,1,7]
        assert (2..4).collect() == [2,3,4]
        def person = new Person()
        person.each {println it}

        assert ["qwe","124","weq112"].grep(~/\d+/) == ["124"]  //использует под капотом isCase  (switch, in, grep)
        assert ["qwe","124","weq112"].grep {it.length() > 4} == ["weq112"]
    }
}
