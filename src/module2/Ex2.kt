package module2

fun main(args: Array<String>) {
    ex2()
}

//Напишите программу для расчета дохода по вкладу.
// Пользователь вводит сумму вклада, длительность вклада (количество месяцев) и ежемесячный процент по вкладу.
// Программа выводит в консоль информацию по каждому месяцу отдельно.
// Информация отображает: на сколько будет увеличиваться вклад в этом месяце и итоговую сумму вклада в данном месяце.
fun ex2() {
    println("Введите сумму вклада:")
    var sum: Int = readLine()?.toInt() ?: 1
    println("Введите срок вклада(мес):")
    val count: Int = readLine()?.toInt()?: 1
    println("Введите ежемесячный процент по вкладу:")
    val percent: Int = readLine()?.toInt()?: 1
    for (i in 1..count) {
        val delta = sum*percent/100
        sum += delta
        println("Ваш вклад увеличится на ${delta}р. за ${i}й месяц. Итоговая сумма в данном месяце ${sum}р.")
    }
}