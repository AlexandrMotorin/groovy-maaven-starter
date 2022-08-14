package org.example.lesson19

import groovy.io.FileType

class IORunner {

    static void main(String[] args) {

        def file = new File("somefile.txt")

        println file.text

        file.each { println it}
        file.withInputStream {
            println new String(it.readAllBytes())
        }

        def writer = new StringWriter()
        try(def reader = file.newReader()){
            writer << reader   //записать всё в writer
        }

        def file2 = new File("text.txt")
        file2.text = "Some text"
        file2 << "new line" << System.lineSeparator()    //чтобы не перетерать, добавит вконце

        file2.withOutputStream {}
        file2.newOutputStream()       //при таком варианте придётся закрыть поток

        def srcDir = new File("src")
        srcDir.eachDir { println it}
        srcDir.eachDirRecurse { println it}
        srcDir.eachFile(FileType.FILES){ println it.name}
    }

}
