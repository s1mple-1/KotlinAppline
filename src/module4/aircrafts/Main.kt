package module4.aircrafts

fun main() {
    val aircrafts = arrayListOf<Aircraft>()
    aircrafts.add(Boeing747(555, 3000, 300, 250))
    aircrafts.add(Boeing777(875, 3500, 500, 350))
    aircrafts.add(Airbus400(898, 2000, 700, 40000))
    userInterface(aircrafts)
}

fun userInterface(aircrafts: ArrayList<Aircraft>) {
    outer@ while (true) {
        println(
            """
        1) Вывести все самолеты
        2) Вывести грузовые самолеты
        3) Вывести пассажирские самолеты
        4) Вывести самолет с самым низким расходом топлива
        5) Выход из программы
    """.trimIndent()
        )
        when (readLine()?.toInt() ?: 0) {
            1 -> aircrafts.forEach { it.printSpecifications() }
            2 -> aircrafts.filter { it is Cargo }.forEach { it.printSpecifications() }
            3 -> aircrafts.filter { it is Passenger }.forEach { it.printSpecifications() }
            4 -> aircrafts.minBy { it.fuelConsumption }?.printSpecifications()
            5 -> break@outer
            else -> println("Введено неверное значение")
        }
    }
}