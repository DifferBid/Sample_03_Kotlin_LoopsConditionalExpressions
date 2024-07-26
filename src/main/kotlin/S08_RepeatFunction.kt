
package org.example

fun main() {

    /**-----Example 01-----*/
    // Пример использования функции repeat

    // Вызов repeat(3) означает, что блок кода внутри фигурных скобок {} будет выполнен 3 раза.
    // Количество повторений указывается первым параметром функции repeat.
    // Лямбда-выражение:
    // Блок кода, который будет повторяться, передается как лямбда-выражение.
    // В данном случае, это вывод строки "Шарик! Фас!" на экран.
    // Лямбда-выражение может принимать один неявный параметр it, который представляет текущий индекс повторения (начиная с 0).
    // В данном примере it не используется, но его можно использовать, если нужен доступ к номеру текущей итерации.
    repeat(3) {
        println("Шарик! Фас!")
    }

    /**-----Example 02-----*/
    // Пример с использованием индекса итерации
    // Здесь it представляет индекс текущей итерации (начиная с 0), и строка "Итерация номер X" будет выведена три раза,
    // с номерами итераций 1, 2 и 3.
    // Функция repeat упрощает код, когда требуется повторение действий фиксированное количество раз,
    // и делает его более понятным и компактным.
    repeat(3) {
        println("Итерация номер ${it + 1}")
    }

    // В данном случае параметр index указывается явно. Он представляет текущий индекс итерации, начиная с 0.
    // В теле лямбда-выражения println("Итерация номер ${index + 1}") используется этот параметр index для вывода номера итерации.
    // Поскольку индексация начинается с 0, мы добавляем 1, чтобы номер итерации выглядел привычным для пользователя (начиная с 1).
    repeat(3) { index ->
        println("Итерация номер ${index + 1}")
    }
    // Таким образом, явное указание параметра в лямбда-выражении делает код более читаемым и понятным,
    // особенно если it не ясно обозначает, что именно оно представляет.
    // Это может быть полезно, когда нужно передать дополнительную информацию о данных, с которыми работает лямбда.
}
