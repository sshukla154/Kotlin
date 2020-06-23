package com.learn.kotlin.basic.new

/*
The class that inherits the features of another class is called sub class or child class derived class
and the class whose feature are inherited is called as super class or parent class or base class
*/

// Super Class, Parent Class or Base Class Of ElectricCar
open class Carr(val name: String, val brand : String) {

    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if(amount>0){
            range+= amount
        }
    }

    open fun drive(distance: Double) {
        println("$brand $name drove for $distance KM")
    }

}

// Sub Class of Vehicle Class or Derived Class Of Carr
class ElectricCar(name: String, brand: String, batteryLife: Double) : Carr(name, brand) {

    //Override the range and drive
    override var range : Double = batteryLife * 5

    var chargerType: String = "Round"

    override  fun drive(distance: Double) {
        println("$brand $name drove for $distance KM")
    }

    //Shadowing
    fun drive() {
        println("$brand $name drove for $range KM on electricity")
    }

}


fun main() {

    var myAudiCarr = Carr("A3", "Audi")
    var myTestlaECar = ElectricCar("S-Model", "Tesla", 85.0)

    myTestlaECar.extendRange(300.0)
    //Only available in child class
    println("Tesla charger Type is : ${myTestlaECar.chargerType}")


    // By Shadowing
    myTestlaECar.drive()

    // example of polymorphism : Polymorphism is the ability to treat objects with a similar trades in a common way
    myAudiCarr.drive(200.0)
    myTestlaECar.drive(250.0)
}