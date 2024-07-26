
package org.example

fun main() {

    /**-----Example 01-----*/
    // Создание и итерация по Map
    // Вот пример создания неизменяемого словаря (Map) и итерации по его элементам

    // Создание Map:
    // mapOf("USA" to "Washington DC", "England" to "London", "France" to "Paris")
    // Здесь используется функция mapOf, чтобы создать неизменяемый словарь, где ключами являются страны, а значениями — их столицы.
    // Оператор to используется для связывания ключа и значения.
    // Итерация по Map:
    // Цикл for ((country, capital) in capitals) позволяет итерировать по каждой паре ключ-значение.
    // Благодаря деструктуризации, мы можем напрямую получать ключ (country) и значение (capital) из каждой пары.
    // Вывод информации:
    // В теле цикла используется функция println для вывода информации о каждой паре: "The capital of USA is Washington DC" и так далее.
    val capitals = mapOf(
        "USA" to "Washington DC",
        "England" to "London",
        "France" to "Paris"
    )

    for ((country, capital) in capitals) {
        println("The capital of $country is $capital")
        //: The capital of USA is Washington DC
        //: The capital of England is London
        //: The capital of France is Paris
    }
}