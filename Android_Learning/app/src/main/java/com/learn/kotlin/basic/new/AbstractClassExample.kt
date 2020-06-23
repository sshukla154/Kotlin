package com.learn.kotlin.basic.new
/*
NOTE: Abstract class cannot be initiated (Its object cannot be created). However we can inherit subclasses
from an abstract class. The member (properties and methods) of an abstract are non-abstract unless you explicitly
use the keyword abstract with that member
*/



abstract class Mammal(private var name : String, private var origin: String, private var weight: Double){
//The params used in constructor are concrete non-abstract properties

    //Abstract Properties (Must be over-ridden by subclass)
    abstract var maxSpeed: Double

    //Abstract Method (Must be implemented by subclass)
    abstract fun run()
    abstract fun breath()

    //Concrete (non-abstract) method
    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, Max Speed: $maxSpeed")
    }
}

class Human(name : String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("Running on two legs !")
    }

    override fun breath() {
        println("Breath through mouth or nose")
    }

}

class Elephant(name : String, origin: String, weight: Double, override var maxSpeed: Double): Mammal(name, origin, weight){

    override fun run() {
        println("Running on four legs !")
    }

    override fun breath() {
        println("Breath through the trunk")
    }

}

fun main(){


    //var mammal = Mammal("Human1", "Russia", 78.99, 38.9)--> CTE: NOt Possible to create object of Mammal
    //abstract class as it is abstract class

    var human = Human("Human1", "Russia", 78.99, 38.9)
    var elephant = Elephant("Rosy", "India", 5400.99, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()
}
