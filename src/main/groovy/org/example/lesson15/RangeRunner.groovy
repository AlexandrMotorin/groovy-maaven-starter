package org.example.lesson15

class RangeRunner {

    static void main(String[] args) {

        //def range = 2..<8   не включая
        def range = 2..8
        assert range.getClass() == IntRange

        assert range[3] == 5
        assert range.contains(8)
        assert range.each {println it}

        ('a'..'d').each {println it}
        (WeekDay.MO..WeekDay.FR).each { println it}
    }

}
