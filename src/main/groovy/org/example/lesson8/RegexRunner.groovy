package org.example.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {

        def line = "one 1 two 22 three 333"
//        String regex = "(\\w+) (\\d+)"
        String regex = /(\w+) (\d+)/

//        Pattern pattern = Pattern.compile(regex)
        def pattern = ~regex
//        Matcher matcher = pattern.matcher(line)
        def matcher = line =~ regex

//        boolean result = matcher.matches()
        boolean result = line ==~ regex
        println result

//        while (matcher.find()){
//            println "-----------"
//            println matcher.group()
//            println matcher.group(1)
//            println matcher.group(2)
//            println "-----------"
//        }

//        println matcher[0]
//        println matcher[1]
//        println matcher[2]

        matcher.each {(group, group1, group2) -> {
            println group
            println group1
            println group2
        }}
    }
}
