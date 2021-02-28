package module4.aircrafts

class Boeing747(
    number: Int,
    maxRange: Int,
    fuelCapacity: Int,
    override val passengerCapacity: Int
) : Aircraft(number, maxRange, fuelCapacity), Passenger {

    override fun printSpecifications() {
        println("Boeing747(number=$number, maxRange=$maxRange, fuelCapacity=$fuelCapacity, fuelConsumption=$fuelConsumption, passengerCapacity=$passengerCapacity)")
    }
}