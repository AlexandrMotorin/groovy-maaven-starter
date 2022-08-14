package org.example.lesson14

class MapRunner {
    static void main(String[] args) {

//        def map = [:]         //инициализация пустой Map
        def map = ["one": 1, "two": 2]

        assert map.getClass() == LinkedHashMap

        //read

        assert map.get("one") == 1
        assert map["one"] == 1
        assert map."one" == 1
        assert map.one == 1       //если ключ string
        assert map.get("qwe",10) == 10   // getOrDefault

        //write

        map.one = 111
        map.tree = 542  //можем также добавлять новые пары в map

        //new method

        assert map.subMap("one", "two") == ["one": 111, "two": 2]   //достать часть map

        //new operator
        def newMap = ["q":22, "b":21, *:map]  //addAll
        println newMap
    }
}
