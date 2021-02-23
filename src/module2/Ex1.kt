package module2

fun main(args: Array<String>) {
    ex1()
}


fun ex1() {
    var count = 0
    val answers = arrayListOf(2, 1, 4, 3, 2)
    println(
        """Первый вопрос - Кто был первым человеком в космосе? Введите номер ответа:
        1) Нилл Армстронг
        2) Юрий Гагарин
        3) Сергей Королев
        4) Илон Маск"""
    )
    val firstAnswer: Int? = readLine()?.toInt()
    if (firstAnswer == answers[0]) count++

    println(
        """Второй вопрос - Кто был первым животным в космосе? Введите номер ответа:
        1) Собака 
        2) Белка 
        3) Кошка
        4) Гепард""".trimIndent()
    )
    val secondAnswer: Int? = readLine()?.toInt()
    if (secondAnswer == answers[1]) count++

    println(
        """Третий вопрос - Первый космический корабль назывался? Введите номер ответа:
        1) Апполон 
        2) Союз 
        3) Тесла
        4) Восток""".trimIndent()
    )
    val thirdAnswer: Int? = readLine()?.toInt()
    if (thirdAnswer == answers[2]) count++


    println(
        """Четвертый вопрос - Первая женщина космонавт? Введите номер ответа:
        1) Барбара Стрейзанд
        2) Роберта Линн
        3) Валентина Терешкова
        4) Светлана Савицкая""".trimIndent()
    )
    val fourthAnswer: Int? = readLine()?.toInt()
    if (fourthAnswer == answers[3]) count++

    println(
        """Пятый вопрос - Название первого марсохода? Введите номер ответа:
        1) ПрОП-М 
        2) Соджорнер 
        3) Оппортьюнити
        4) Тяньвэнь-1""".trimIndent()
    )
    val fifthAnswer: Int? = readLine()?.toInt()
    if (fifthAnswer == answers[4]) count++

    when (count) {
        5 -> println("Вы знаете историю космоса на отлично")
        4 -> println("Вы знаете историю космоса хорошо")
        3 -> println("Вы знаете историю космоса средне")
        2 -> println("Вы знаете историю космоса плохо")
        else -> println("Вы не знаете историю космоса")
    }
}