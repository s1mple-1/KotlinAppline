package module4.aircrafts

class Boeing777(
    number: Int,
    maxRange: Int,
    fuelCapacity: Int,
    override val passengerCapacity: Int
) : Aircraft(number, maxRange, fuelCapacity), Passenger {

    override fun printSpecifications() {
        println("Boeing777(number=$number, maxRange=$maxRange, fuelCapacity=$fuelCapacity, fuelConsumption=$fuelConsumption, passengerCapacity=$passengerCapacity)")
    }
}