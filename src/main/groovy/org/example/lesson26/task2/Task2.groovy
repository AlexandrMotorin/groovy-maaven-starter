package org.example.lesson26.task2

/**
 *  Добавить возможность складывать различные единицы измерения
 *  Например: 3.cm + 1.m - 25.mm = 1005 (mm)
 */

class Task2 {
    static void main(String[] args) {

    }

    private static void secondOptional() {   //решение через добавлениее методов в MetaClass
        Integer.metaClass {
            getCm = { delegate * 10 }
            getM = { delegate.cm * 100 }
            getMm = { delegate }
        }

        def result = 3.cm + 1.m - 25.mm
        assert result == 1005
    }

    private static Object firstOption() {   //решение через категории
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            assert result == 1005
        }
    }
}
