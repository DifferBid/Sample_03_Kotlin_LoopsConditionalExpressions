
package org.example

fun main() {

    /**-----Example 01-----*/
    // Инициализация переменной:
    // var i = 1 — инициализация переменной i значением 1 перед началом цикла.
    // Условие цикла:
    // while (i < 9) — цикл выполняется, пока условие i < 9 истинно. Как только i достигает значения 9, цикл прекращает выполнение.
    // Тело цикла:
    // В теле цикла происходит вывод текущего значения переменной i и её увеличение на 1.
    // После цикла:
    // После выхода из цикла выводится последнее значение переменной i, которое равно 9.
    // Это значение больше 8, потому что условие цикла становится ложным именно при i = 9.

    // Пример использования while
    var i = 1
    while (i < 9) {
        println(i)
        i += 1
    }
    // Вышли из цикла и проверяем последнее значение переменной
    println(i) //:1 2 3 4 5 6 7 8 9

    /**-----Example 02-----*/
    // Прерывание цикла с использованием break
    // Иногда требуется прервать выполнение цикла досрочно, если достигается определенное условие.
    // Это можно сделать с помощью оператора break.

    // Оператор break:
    // Когда переменная i достигает значения 5, условие if (i == 5) становится истинным, и оператор break прерывает выполнение цикла.
    // В результате, цикл завершает выполнение до достижения конца условного диапазона (до 9).
    // Вывод результатов:
    // Значения 1, 2, 3, и 4 выводятся до того, как цикл прерывается, когда i равно 5.
    var a = 1
    while (a < 9) {
        if (a == 5) {
            break
        }
        println(a) //: 1 2 3 4
        a += 1
    }

}