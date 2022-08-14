package org.example

class HelloWorld {

    int value
    String name

    static void main(String[] args) {

        String value = "string"
        def clazz = value.getClass();


        def loader = clazz.getClassLoader()
        println loader

        def clazz1 = HelloWorld.class
        def loader1 = clazz1.classLoader

        print loader1
    }
}
