package com.learn.kotlin.basic.new

import java.lang.IllegalArgumentException

fun main() {

    var myCar = Car()
    myCar.owner
    println("Brand is : ${myCar.myBrand}")

    myCar.maxSpeed = 300
    println("Brand is : ${myCar.maxSpeed}")

    //myCar.maxSpeed = -5

    // Here we are able to access Model as getter is not private
    println("My model is : ${myCar.myModel}")


}

open class Car() {

    lateinit var owner : String

    val myBrand : String = "BMW"
    // Custom Getter
    get() {
        return field.toLowerCase()
    }

    var maxSpeed : Int = 250
     /* The below setter and getter is created by default when we create a variable with some default value.
     In our case is maxSpeed is 250
     get() = field
     set(value){
            field = value
        }*/
    //Custom Setter
    set(value) {
         field = if(value> 0) value else throw IllegalArgumentException("Max speed cannot be less than zero")
     }

    //As the below setter we have made as private it will only be accessible in this class ie: Car
    var myModel : String = "M3"
    private set


    init {
        myModel = "M5"
        owner = "SShukla154"
    }

}