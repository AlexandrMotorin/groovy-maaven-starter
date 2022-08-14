package org.example.lesson12

class LoopsRunner {
    static void main(String[] args) {

        def list = [1,2,3,4,5]
//        for (int i = 0; i < list.size(); i++){
//            println i
//        }

//        for (i in 0..<list.size()){
//            println i
//        }

//        for (Integer value : list){
//
//        }

//        for (value in list){
//            println value
//        }
//
//        0.upto(list.size()){
//            println it
//        }
//
//        list.size().downto(0){
//            print it
//        }
//
//        list.size().times {
//            println it
//        }

        0.step(5,2){
            println it
        }
    }
}
