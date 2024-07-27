package org.example

fun main() {

    /**-----Example 01-----*/
    // Функция coerceIn() позволяет ограничить значение определенным диапазоном.
    // Если значение выходит за пределы диапазона, оно приводится к ближайшему граничному значению.
    fun showProgress(progress: Int) {
        val percent = progress.coerceIn(0, 100)
        println("We're $percent% done")
    }
    showProgress(45)  // InConsole: We're 45% done
    showProgress(105) // InConsole: We're 100% done
    // Итог: В этом примере, если значение progress больше 100, то оно будет приведено к 100, а если меньше 0 — к 0.

    /**-----Example 02-----*/
    // Нахождение минимума, максимума и суммы значений в интервале
    // Для нахождения минимального и максимального значения, а также суммы всех значений в интервале,
    // можно использовать функции minOrNull(), maxOrNull() и sum() соответственно.
    val intRange: IntRange = 3..7
    val min = intRange.minOrNull()
    val max = intRange.maxOrNull()
    val sum = intRange.sum()
    // Здесь minOrNull() возвращает минимальное значение в диапазоне (в данном случае 3),
    // maxOrNull() — максимальное значение (7), а sum() — сумму всех чисел в диапазоне (3 + 4 + 5 + 6 + 7 = 25).
    println("Min: $min; Max: $max; Sum: $sum") // InConsole: Min: 3; Max: 7; Sum: 25

    /**-----Example 03-----*/
    // Функция random() позволяет выбрать случайный элемент из заданного интервала.
    val charRange: CharRange = 'a'..'c'
    val randomChar = charRange.random()
    // В данном случае функция random() выбирает случайный символ из диапазона от 'a' до 'c', включая оба конца.
    println(randomChar) // InConsole: 'a' or 'b' or 'c'
}