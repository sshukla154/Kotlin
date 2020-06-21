package com.learn.kotlin.basic

fun main(args: Array<String>) {

    var pi : Double = 3.14;
    var radius = 5;
    var circumference: Double = pi * radius * 2;
    println(circumference)
    var circumference1 = pi.toInt() * radius * 2;
    println(circumference1);

    println("--------------------");
    //Make a variable that holds weight
    var weight = 80;
    // Subtract 5 pounds from weight
    weight -= 5;
    // print out weight
    println(weight);



}