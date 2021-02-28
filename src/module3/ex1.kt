package module3

fun main() {
    println(isLeapYear(2020))
    println(isLeapYear(2021))
}

fun isLeapYear(year: Int): Boolean {
    if (year % 100 == 0 && year % 400 == 0) {
        return true
    } else if (year % 4 == 0 && year % 100 > 0) {
        return true
    }
    return false
}