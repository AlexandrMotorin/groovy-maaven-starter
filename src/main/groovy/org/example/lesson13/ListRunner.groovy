package org.example.lesson13

class ListRunner {

    static void main(String[] args) {

        def list = [1,5,3,1,4,7]

        //read

        assert list[2] == 3
        assert list.get(2) == 3
        assert list[-1] == 7      //list.get(list.size() - 1)
        assert list[2..-1] == [3,1,4,7]
        assert list[15] == null    //в java выскочил бы exception

        //write

        list += 9
        list << 11 << 13 << 7 << 7  //добавит в конец сначала 11 а затем 13
        assert list == [1,5,3,1,4,7,9,11,13,7,7]

        list -= 7    //удаляет все 7
        assert list == [1,5,3,1,4,9,11,13]

        list -= [1,3]   //удалит все элементы равные 1 и 3
        assert list == [5,4,9,11,13]

        list *= 3       //умножит лист в 3 раза
        assert list == [5,4,9,11,13,5,4,9,11,13,5,4,9,11,13]


        //method from queue

        list.push(999)
        assert list.pop() == 999
        assert list.head() == 5
        assert list.tail() == [4,9,11,13,5,4,9,11,13,5,4,9,11,13]
        assert list.last() == 13

        // flatten, reverse, intersect, disjoint

        assert [1,2,[2,1],5,7].flatten() == [1,2,2,1,5,7]   //развернёт внутренние все массивы (списки)
        assert [1,2,3].reverse() == [3,2,1]
        assert [1,2,3].intersect([2,6,1]) == [2,1]      //пересечение списков
        assert [1,2,3].disjoint([4,5,7])     //true - если нет пересечений

        // new operators

        def(a,b,c) = [5,9,11,2,5]
        assert a == 5
        assert b == 9
        assert c == 11

        func(*[4,9])
    }

    static def func(def a, def b){
        println a
        println b
    }
}
