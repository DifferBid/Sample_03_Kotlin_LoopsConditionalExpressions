
package org.example

    enum class Color(private val number: Int) {
        RED(1),
        ORANGE(2),
        YELLOW(3),
        GREEN(4),
        BLUE(5),
        INDIGO(6) ,
        ONEPlusONE(7);
        // Функция для получения числа, связанного с цветом
        fun getNumber(): Int {
            return number
        }
    }

    fun main() {

        /**-----Example 01-----*/
        println(getMnemonic(Color.INDIGO)) //: индиго
        println(getMnemonic(Color.ONEPlusONE)) //: 2

        /**-----Example 02-----*/
        val color = Color.RED.ordinal
        println(getWarmth(color)) //: warm
        println(getWarmthOne(Color.YELLOW)) //: warm
        println(getWarmthOne(Color.BLUE)) //: cold and has number: 5

        /**-----Example 03-----*/
        getView("INVISIBLE") //: Image Invisible

        /**-----Example 04-----*/
        setVariableX() //: range 10..15

        /**-----Example 05-----*/
        // Вывод результатов вызова функции describe с различными аргументами
        println(describe(45))         // obj = 45, не строка, выводит: "Не строка"
        println(describe("Васька"))   // obj = "Васька", строка не распознана, выводит: "Unknown (Неведома зверушка)"
        println(describe(475L))       // obj = 475L, является Long, выводит: "Long"
        println(describe(1))          // obj = 1, выводит: "Единица"
        println(describe(variableDog))     // obj = объект класса Dog, выводит: "Собака!"

        /**-----Example 06-----*/
        println(cost) //: прокормлю
    }

    /**-----Example 01-----*/
    // Простое использование when с перечислением цветов
    // Color.INDIGO: Это значение, которое мы проверяем. В данном случае,
    // Color — это перечисление (enum class), содержащее несколько констант (RED, ORANGE, YELLOW и т.д.).
    // Константа Color.INDIGO представляет собой один из возможных вариантов цвета,
    // "индиго": Это выражение, которое возвращается, если значение, переданное в when,
    // соответствует Color.INDIGO. В данном случае, строка "индиго" — это результат, который будет возвращён
    // из when, если условие выполняется.
    // Когда выражение when обрабатывается, оно последовательно проверяет условия,
    // заданные в каждой ветке. Если текущее значение переменной, переданной в when,
    // совпадает с Color.INDIGO, то выполняется соответствующее действие — возвращается строка "индиго".
    fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "красный" // Лямбда-выражение
            Color.ORANGE -> "оранжевый"
            Color.YELLOW -> "желтый"
            Color.GREEN -> "зеленый"
            Color.BLUE -> "голубой"
            Color.INDIGO -> "индиго"
            Color.ONEPlusONE -> 1+1
        }

    /**-----Example 02-----*/
    // Использование when с несколькими условиями в одном выражении

    // Функция getWarmth принимает цвет как целое число и возвращает строку, описывающую "теплоту" цвета
    // Перечисление Color представляет собой набор предопределённых цветов, каждый из которых имеет свой номер
    // (ordinal), указанный в конструкторе перечисления. Эти номера могут быть использованы для представления цветов в числовом формате.
    // Здесь мы используем when для определения "теплоты" цвета,
    // объединяя несколько значений в одной ветке (например, RED и YELLOW возвращают "warm").
    // Также используется ветка else, которая аналогична default в Java и выполняется, если ни одно из предыдущих условий не подошло.
    fun getWarmth(color: Int) = when (color) {
        Color.RED.ordinal, Color.YELLOW.ordinal -> "warm"
        Color.GREEN.ordinal -> "neutral"
        Color.BLUE.ordinal -> "cold " + Color.BLUE.getNumber() // Используем встроенную функцию "getNumber" в "enum class Color"
        else -> "unknown"
    }


    fun getWarmthOne(color: Color) = when (color) {
        Color.RED, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE -> "cold and has number: ${color.getNumber()}"
        else -> "unknown"
    }

    /**-----Example 03-----*/
    fun getView(image:String){
        // Определяем текущую видимость с помощью when.
        when(image){
            "VISIBLE" -> println("Image Visible")
            "INVISIBLE" -> println("Image Invisible")
            else -> println("gone")
        }
    }

    /**-----Example 04-----*/
    // Использование when для присваивания переменной.
    // Обернем в отдельную функцию, здесь when используется для определения строки на основе значения переменной x.
    fun setVariableX() {
        var x = 10
        val result = when(x){
            0, 1 -> "binary"
            2,4,6,8 -> "even number"
            in 10..15 -> "range 10..15"   // Проверка, находится ли x в диапазоне 10..15 интервалов in
            else -> "error"
        }
        println(result)
    }

    /**-----Example 05-----*/
    // Использование ключевого слова is и интервалов in
    // Определение класса Dog с одним свойством name
    class Dog(val name: String)
    val variableDog = Dog("Шарик")

    // Функция describe принимает параметр obj типа Any и возвращает строку
    // Этот пример показывает использование when с ключевым словом is для проверки типа объекта,
    // а также с интервалами in для проверки попадания значения в определённый диапазон.
    fun describe(obj: Any): String =
        when (obj) {
            1 -> "Единица" // Если obj равно 1, возвращает строку "Единица"
            is Dog -> "Собака!" // Если obj является экземпляром класса Dog, возвращает строку "Собака!"
            "Hello Kitty" -> "Приветствуем Kitty" // Если obj равно строке "Hello Kitty", возвращает строку "Приветствуем Kitty"
            is Long -> "Long" // Если obj является экземпляром Long, возвращает строку "Long"
            !is String -> "Не строка"  // Если obj не является экземпляром String, возвращает строку "Не строка"
            else -> "Unknown (Неведома зверушка)"  // Для всех других случаев возвращает строку "Unknown (Неведома зверушка)"
        }

    /**-----Example 06-----*/
    // Пример с интервалами in
    // Здесь when используется для определения текста на основе значения переменной howMuchMoney, которая сравнивается с интервалами.
    const val howMuchMoney = 999
    val cost = when (howMuchMoney) {
        in 1..10 -> "издеваетесь?"
        in 10..100 -> "маловато будет"
        in 100..1000 -> "прокормлю"
        in 1000..1000000 -> "на хлеб с икрой!"
        else -> "not rated"
    }






