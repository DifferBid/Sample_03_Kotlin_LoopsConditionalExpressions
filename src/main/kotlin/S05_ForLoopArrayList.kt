
package org.example

fun main() {

    /**-----Example 01 / 02 / 03 / 06-----*/
    // Итерация по массиву
    // Создание и инициализация массива
    val dogs = arrayListOf<String>()
    dogs.add("Клык")
    dogs.add("Васька")
    dogs.add("Шарик")

    /**-----Example 01-----*/
    // Итерация по элементам массива
    // Здесь цикл for используется для прохождения по каждому элементу массива dogs и вывода его на экран.
    for (dog in dogs) {
        println("Пес $dog")
            //: Пес Клык
            //: Пес Васька
            //: Пес Шарик
    }

    /**-----Example 02-----*/
    // Итерация по массиву с использованием индексов
    // Если нужно получить доступ к индексам элементов, можно использовать свойство indices или метод withIndex()
    for (index in dogs.indices) {
        println("Пес indices: ${dogs[index]}")
            //: Пес indices: Клык
            //: Пес indices: Васька
            //: Пес indices: Шарик
    }

    /**-----Example 03-----*/
    // метод withIndex()
    for ((index, element) in dogs.withIndex()) {
        println("$index- $element")
        //: 0- Клык
        //: 1- Васька
        //: 2- Шарик
    }

    /**-----Example 04-----*/
    // Итерация с изменением шага
    // Для изменения шага итерации можно использовать ключевые слова downTo и step
    // Здесь цикл проходит по числам от 10 до 1 с шагом 2, уменьшая значение на каждом шаге.
    for (i in 10 downTo 1 step 2) {
        print("$i ") //: 10 8 6 4 2
    }

    /**-----Example 05-----*/
    // Проверка вхождения символа в диапазон
    // Kotlin позволяет легко проверить, входит ли символ в определенный диапазон, используя оператор in:
    fun isNotDigit(c: Char) = c !in '0'..'9'
    println("\n" + isNotDigit('3')) // false, это всё-таки цифра

    /**-----Example 06-----*/
    // Использование until для предотвращения выхода за пределы массива,
    // Чтобы избежать ошибок, связанных с выходом за пределы массива, часто используется выражение size-1.
    // В Kotlin есть более удобный способ — использовать until

    // for (i in 0 until dogs.size) — эта строка создает цикл, который итерирует переменную i от 0 до dogs.size - 1.
    // dogs.size — это свойство, которое возвращает количество элементов в массиве dogs. В нашем случае dogs.size равно 3, так как массив содержит три элемента.
    // until — это ключевое слово, которое используется для создания диапазона чисел, не включая последнее число.
    // Таким образом, 0 until dogs.size создает диапазон от 0 до 2 (0, 1, 2).

    // Внутри цикла мы используем println(dogs[i]) для вывода каждого элемента массива dogs.
    // dogs[i] — это доступ к элементу массива по индексу i. Индексация массивов в Kotlin начинается с нуля, то есть dogs[0] — первый элемент, dogs[1] — второй элемент, и так далее.
    for (i in 0 until dogs.size) {
        println(dogs[i])
        //: Клык
        //: Васька
        //: Шарик
    }

    /**-----Example 07-----*/
    // Управление потоком цикла
    // Для управления потоком выполнения цикла можно использовать ключевые слова break и continue

    // Здесь цикл прерывается, когда i равно 3.
    for (i in 1..5) {
        println(i) //: 1 2 3
        if (i == 3)
            break
    }

    // В этом примере, при достижении числа 5 цикл не выполняет оставшуюся часть тела цикла,
    // но продолжает выполнение со следующей итерации.
    println("For loop 1 to 10 continue if number is 5")
    for (i in 1..10) {
        if (i == 5) {
            println("Meow")
            continue
        }
        println(i)
        //: For loop 1 to 10 continue if number is 5
        //: 1 2 3 4 Meow 6 7 8 9 10
    }


}
