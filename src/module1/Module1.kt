package module1

fun main(args: Array<String>) {

    /** Ex1 */
    var any: Any? = null
    any = 5
    var result = any/2.5
    // double

    /** Ex2 */
    val h = "hello"
    val a = "aplana"
    println("$h $a")

    /** Ex3 */
    val five: Char = '5'
    five.toString()
    five.toByte()
    five.toShort()
    five.toInt()
    five.toDouble()
    five.toFloat()
    five.toLong()

    /** Ex4 */
    println("Введите ваще имя:")
    val name: String? = readLine().toString()
    println("Привет $name!")

    /** Ex5 */
    val range = 'z' downTo 'a'

    /** Ex5 */
    println("Введите первое число:")
    val first: Int = readLine()?.toInt() ?: 0
    println("Введите первое число:")
    val second: Int = readLine()?.toInt() ?: 0
    val bol = first > second
}