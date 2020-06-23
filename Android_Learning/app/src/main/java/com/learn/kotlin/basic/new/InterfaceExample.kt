package com.learn.kotlin.basic.new

/*
Interface: Is essentially a contract that a class may choose to sign. If it does that class is obliged to provide
implementation of the properties and function of the interface.
*/

interface Driveable {
    //Variable without initialization
    var maxSpeed: Double

    // Function just declaration (Without implementation)
    fun drive(): String

    // Function with implementation
    fun brake() {
        println("Brakes...........................")
    }
}

open class Carrr(override var maxSpeed: Double, val name: String, val brand : String) : Driveable {


    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount>0){
            range+= amount
        }
    }

    open fun drive(distance: Double) {
        println("$brand $name drove for $distance KM")
    }

    override fun drive(): String {
        return "Over-riding drive() from interface"
    }

}
// Sub Class of Vehicle Class or Derived Class Of Carr
class ElectricCarr(maxSpeed: Double, name: String, brand: String, batteryLife: Double) : Carrr(maxSpeed, name, brand) {

    //Override the range and drive
    override var range : Double = batteryLife * 5

    var chargerType: String = "Round"

    override  fun drive(distance: Double) {
        println("$brand $name drove for $distance KM")
    }

    override fun drive(): String {
        return "$brand $name drove for $range KM on electricity"
    }

    /*
    Just calling the interface break() function to this child class. In-case if this break function was
    implemented in Carrr class (super class of ECarr), then this would have be called to Carr class instead
    of from interface
    */
    override fun brake() {
        super.brake()
        println("Break in Tesla......................")
    }

}


fun main() {

    var myAudiCarr = Carrr(550.0,"A3", "Audi")
    var myTestlaECar = ElectricCarr(420.0, "S-Model", "Tesla", 85.0)

    myTestlaECar.extendRange(300.0)
    //Only available in child class
    println("Tesla charger Type is : ${myTestlaECar.chargerType}")


    // By Shadowing
    myTestlaECar.drive()

    // example of polymorphism : Polymorphism is the ability to treat objects with a similar trades in a common way
    myAudiCarr.drive(200.0)
    myTestlaECar.drive(250.0)

    myAudiCarr.brake()
    myTestlaECar.brake()
}