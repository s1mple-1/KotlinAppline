package module2

fun main() {
    ex4()
}
//Напишите программу для хранения названия городов. Пользователь может сделать 4 действия:
//
//- Добавить название города в программу.
//
//- Посмотреть в консоли список всех добавленных городов
//
//- Посмотреть список добавленных городов без повторений
//
//- Выход из программы
//
//Для хранения используйте коллекцию типа List.

fun ex4() {
    val cities = arrayListOf<String>()
    outer@ while (true) {
        println(
            """
        Программу для хранения названия городов
        Выберете необходимое действие:
        1)Добавить
        2)Посмотреть все
        3)Посмотреть без повторов
        4)Выход
    """.trimIndent()
        )
        when (readLine()?.toInt() ?: 0) {
            1 -> cities.add(readLine().toString())
            2 -> showAll(cities)
            3 -> showUnique(cities)
            4 -> break@outer
        }
    }
}

fun showAll(cities: ArrayList<String>) {
    cities.forEach { println(it) }
}

fun showUnique(cities: ArrayList<String>) {
    cities.toHashSet().forEach { println(it) }
}
