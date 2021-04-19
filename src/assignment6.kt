fun main() {
var car= Car("benz","toyota","red",8)
    car.carry(6)
    car.identity()
   println( car.calculateParkingFees(2))
    var bus=Bus("perfect","legacy","black",60)
    bus.carry(62)
    bus.identity()
    println(bus.maxTripFare(3000.000000))
    println(bus.calculateParkingFees(3))

} open class Vehicle(var make: String,var model: String,var color: String,var capacity: Int) {
    fun carry(people: Int) {
        var x = people - capacity
        if (people <= capacity) {
            println("Carrying $people passengers")
        } else {
            println("Over capacity by $x people")
        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }

    open fun calculateParkingFees(hours: Int): Int {
        return hours * 20
    }
}

       class Car(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {

       }
class Bus(make: String, model: String, color: String, capacity: Int) : Vehicle(make, model, color, capacity) {
           fun maxTripFare(fare: Double): Double {
               return fare
           }
           override fun calculateParkingFees(hours: Int): Int {
               return hours * capacity
           }
       }







