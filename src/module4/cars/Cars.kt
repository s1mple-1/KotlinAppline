package module4.cars



data class Car(
    val brand: String,
    val color: String,
    val number: Int
)

fun main() {
    val mercedes = Car("Mercedes", "White", 777)
    println(mercedes)
}