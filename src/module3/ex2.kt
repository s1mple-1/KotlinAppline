package module3

fun main() {
    println(count("Петя", "Вася", "Коля", "Саша"))
}

fun count(vararg names: String) : Int {
    return names.size
}