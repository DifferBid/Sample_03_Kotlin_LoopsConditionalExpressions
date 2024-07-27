
package org.example

fun main() {

    /**-----Example 01-----*/
    /* Для класса Range
    Класс Range используется для определения диапазона значений. Свойства first и last позволяют получить начальное и конечное значения
    диапазона соответственно: */

    val intRange = 1..9
    val first = intRange.first
    val last = intRange.last

    println("First element: $first") // InConsole: First element: 1
    println("Last element: $last")   // InConsole: Last element: 9

    /**-----Example 02-----*/
    /* Классы IntProgression, LongProgression и CharProgression позволяют создавать прогрессии с заданным шагом.
    Свойства first и last также работают для этих классов */
    val progression: IntProgression = 0..100 step 10
    println("First element: ${progression.first}") // InConsole: First element: 0
    println("Last element: ${progression.last}")   // InConsole: Last element: 100
}

