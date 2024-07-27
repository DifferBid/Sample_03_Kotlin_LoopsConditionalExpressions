
package org.example

fun main() {

    /**-----Example 01-----*/
    // Итерация с шагом
    // Использование оператора step позволяет задавать шаг, с которым будут проходить элементы интервала.

    val progression: IntProgression = 0..100 step 10
    // В данном примере интервал начинается с 0 и заканчивается 100, при этом каждый следующий элемент увеличивается на 10.
    for (i in progression) {
        println(i)
    }
    /* InConsole:
    0
    10
    20
    30
    40
    50
    60
    70
    80
    90
    100
    */

    /**-----Example 02-----*/
    // Получение шага
    // Каждая прогрессия имеет свойство step, которое возвращает значение шага
    val intProgression = 1..450 step 10
    val intStep = intProgression.step
    println(intStep) // InConsole:  10

    val longProgression = 10L downTo 1L
    val longStep = longProgression.step
    println(longStep) // InConsole: -1

    val charProgression = 'a'..'z'
    val charStep = charProgression.step
    println(charStep) // InConsole: 1

    // Итог: Здесь мы видим, что шаг прогрессии intProgression составляет 10,
    // longProgression — -1 (поскольку прогрессия идет от большего значения к меньшему),
    // а charProgression — 1 (по умолчанию).

    /**-----Example 03-----*/
    // Обратный порядок
    // Метод reversed() позволяет перечислить элементы интервала в обратном порядке
    val fate: IntRange = 1..9
    for (life in fate.reversed()) {
        println("Remaining lives: $life")
        /* InConsole:
                Remaining lives: 9
                Remaining lives: 8
                Remaining lives: 7
                Remaining lives: 6
                Remaining lives: 5
                Remaining lives: 4
                Remaining lives: 3
                Remaining lives: 2
                Remaining lives: 1
        */
    }
}
