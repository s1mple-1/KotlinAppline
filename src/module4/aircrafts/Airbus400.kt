package module4.aircrafts

class Airbus400(
    number: Int,
    maxRange: Int,
    fuelCapacity: Int,
    override val loadCapacity: Int
) : Aircraft(number, maxRange, fuelCapacity), Cargo {

    override fun printSpecifications() {
        println("Airbus400(number=$number, maxRange=$maxRange, fuelCapacity=$fuelCapacity, fuelConsumption=$fuelConsumption, loadCapacity=$loadCapacity)")
    }
}