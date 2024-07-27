
package org.example

fun main() {

    // Рассмотрим пример с использованием until в цикле for
    val array = arrayOf(10, 20, 30, 40, 50)

    // Пример без использования until
    for (i in 0..array.size - 1) {
        println("Element at index $i: ${array[i]}")
    }

    println()

    // Пример с использованием until
    for (i in 0 until array.size) {
        println("Element at index $i: ${array[i]}")
    }

    // Итог: В первом примере используется диапазон 0..array.size - 1, что требует явно указывать последний индекс массива,
    // чтобы не выйти за его пределы.
    // Во втором примере используется 0 until array.size, что автоматически исключает последний индекс из диапазона и делает код более понятным и лаконичным.
}
