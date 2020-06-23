package com.learn.kotlin.basic.new

import java.lang.Math.floor

fun main() {
    var stringList : List<String> = listOf("SShukla154", "SShukla490", "SShukla123", "SShukla098")

    var mixedTypeList : List<Any> = listOf("SShukla154", 1, 55.00, 75F, "MyBirthday")

    for(value in mixedTypeList) {

        if(value is String){
            println("String: $value with length ${value.length}")
        } else if (value is Int) {
            println("Int: $value")
        } else if (value is Float) {
            println("Float: $value")
        } else if (value is Double) {
            println("Double: $value with floor value ${floor(value)}")
        } else {
            println("Type is un-known TYPE !!!")
        }
    }

    println("--- Smart Cast using \"is\" keyword")
    val object1 : Any = "Hello World. Happy Coding !!!"
    if(object1 !is String){
        println("Not a String.")
    } else {
        println("Found a String of lenght: ${object1.length}")
    }

    println("--- Explicit (unsafe) casting using the \"as\" keyword - can go wrong")
    val string1 = object1 as String
    println(string1.length)

    // Note : Uncomment below 2 lines and execute this program
    val object2 : Any = 1332
    //val string2: String = object2 as String
    //println(string2)

    println("--- Explicit (safe) casting using the \"as?\" keyword")
    val object3 : Any = 1339
    val string3 : String? = object3 as? String // This will work
    println(string3) // This is output as null



}