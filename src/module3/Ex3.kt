package module3

fun main() {

}

fun printName(fio: String, position: String) {
    println("ФИО:$fio Должность:$position")
}

fun printName(fio: String, age: Int, position: String) {
    println("ФИО:$fio Возраст:$age Должность:$position")
}

fun printName(fio: String, status: String, position: String) {
    println("ФИО:$fio Семейное положение:$status Должность:$position")
}

fun printName(fio: String, age: Int, status: String, position: String) {
    println("ФИО:$fio Возраст:$age Семейное положение:$status Должность:$position")
}

