
package org.example

fun main() {
    /**-----Example 01-----*/
    // Списки (List)
    // Списки в Kotlin являются неизменяемыми по умолчанию, что значит, что их содержимое нельзя изменить после создания.
    // Для итерации по элементам списка используется цикл for
    // Мы создаем неизменяемый список list с элементами "D", "O", "G".
    // С помощью цикла for и оператора in итерируем по каждому элементу списка и выводим его.
    val list = listOf("list = " , "D", "O", "G", " ")
    for (letter in list) {
        print(letter) //: list = DOG
    }
    val number = listOf("number = " , "1", "2", "3")
    for (letter in number) {
        print(letter) //: number = 123
    }

    /**-----Example 02-----*/
    // Множества (Set)
    // Множества в Kotlin также являются неизменяемыми по умолчанию и не допускают дублирующихся элементов.
    // Для итерации по элементам множества можно использовать тот же синтаксис, что и для списка
    // Множество set создается с элементами "D", "O", "G", "G". Порядок вывода элементов множества не гарантирован, так как множества не упорядочены.
    val set = setOf(" set = ", "D", "O", "G", "G")
    for (letter in set) {
        print(letter)  //: set = DOG (порядок вывода может быть разным, т.к. Set не гарантирует порядок элементов)
    }

    // Мы можем явно указать тип переменной в цикле for. В данном случае мы указываем, что элементы множества являются строками (String), хотя Kotlin обычно сам выводит тип.
    for (str: String in setOf(" str = ", "D", "O", "G", "G")) {
        print(str)  //: str = DOG (порядок вывода может быть разным)
    }
}
