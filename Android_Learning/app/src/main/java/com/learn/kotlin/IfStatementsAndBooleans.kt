package com.learn.kotlin

fun main(args: Array<String>) {

    var age : Int = 33;

    var wight : Double = 78.3;

    var candy : String = "Snickers";

    var isLightON : Boolean = false;

    var canRide : Boolean = age > 18;

    if(isLightON) {
        println("Walk across the room");
    } else {
        println("Don't move !!!")
    }

    if(canRide) {
        println("Boom !!! you can ride");
    } else {
        println("Maybe another time....");
    }

    if(age >= 18) {
        println("Boom !!! you can ride");
    } else {
        println("Maybe another time....");
    }

}