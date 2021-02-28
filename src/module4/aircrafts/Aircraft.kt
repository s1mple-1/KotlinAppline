package module4.aircrafts

abstract class Aircraft(
    protected val number: Int,
    protected val maxRange: Int,
    protected val fuelCapacity: Int
) {
    val fuelConsumption get() : Double = fuelCapacity.toDouble() / maxRange.toDouble() * 100

    open fun printSpecifications() {
        println("Aircraft(number=$number, maxRange=$maxRange, fuelCapacity=$fuelCapacity, fuelConsumption=$fuelConsumption)")
    }
}