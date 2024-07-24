
package org.example

    fun main() {

        /**-----Example 01-----*/
        // Простой if оператор
        var x = 5
        if (x > 0) {
            println("x больше чем 0") // Если x больше 0, выводится это сообщение
        } else if (x == 0) {
            println("x равен 0") // Если x равен 0, выводится это сообщение
        } else {
            println("x меньше чем 0") // Если x меньше 0, выводится это сообщение
        }

        /**-----Example 02-----*/
        // Проверка типа с помощью is
        var number = 9
        if (number is Int) {
            println("$number является Integer") // Проверяем, является ли переменная number типом Int
        }
        // В Kotlin ключевое слово is используется для проверки типа переменной.
        // Оно позволяет определить, является ли объект экземпляром определенного класса или интерфейса.
        // Эта проверка полезна, когда нужно убедиться, что переменная имеет определенный тип перед выполнением каких-либо операций с ней.
        // Кроме того, is автоматически привязывает переменную к указанному типу в пределах проверки, что позволяет избегать явного приведения типов.

        /**-----Example 03-----*/
        // if как выражение
        var y = 5
        val age = if (y >= 15) "Старый" else "Молодой"
        println(age) // Выводит "Молодой", так как x меньше 15

        // С числами
        var z: Int = if (10 > 20) 5 else 10
        println(z) // Выводит 10, так как 10 не больше 20

        /**-----Example 04-----*/
        // Длинный вариант с фигурными скобками
        var numberX = 9
        val result = if (numberX % 3 == 0) {
            "$numberX делится на 3" // Если остаток от деления на 3 равен 0
        } else {
            "$numberX не делится на 3" // Если остаток от деления на 3 не равен 0
        }
        println(result) // Выводит результат в зависимости от условия

        /**-----Example 05-----*/
        // Вариант с if-else if-else
        var q: Int
        // Проверяем первое условие: 10 больше 20. Оно ложное, поэтому этот блок не выполнится.
        q = if (10 > 20) {
            doSomething() // Этот метод не будет вызван
            25 // Это значение не будет присвоено переменной x
        }
        // Проверяем второе условие: 12 меньше 13. Это условие истинно, поэтому выполнится этот блок.
        else if (12 < 13) {
            26 // Переменной x присваивается значение 26
        }
        // Если ни одно из предыдущих условий не выполнено, выполняется этот блок.
        else {
            27 // Это значение не будет присвоено, так как второе условие было истинным
        }
        println("$q") // Выводит значение x, которое равно 26

        /**-----Example 06-----*/
        // Вложенные варианты if
        var a: Int
        a = if (10 < 20) {
            if (4 == 3) {
                56 // Не выполнится, так как 4 не равно 3
            } else {
                96 // Выполнится, так как 4 не равно 3
            }
        } else if (12 > 13) {
            26 // Не выполнится, так как 12 не больше 13
        } else {
            27 // Не выполнится, так как первое условие истинно
        }
        println("$a") // Выводит 96, так как выполнено вложенное else
    }

    /**-----Example 05-----*/
    fun doSomething() {
        var a = 6
        println("$a") // Выводит 6
    }