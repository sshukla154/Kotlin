package com.learn.kotlin

fun main(args:Array<String>) {
    println("Using var (MUTABLE) ------------------------- Value can be changed later on with same data type");
    //Assigning Number to variable age
    var age = 33;

    //Assigning String to variable candy
    var candy = "Fun Dip";

    println(age);
    println(candy);
    println("---------");

    candy = "Snickers";
    println(candy);
    println(" Trying to assign variable var of String type which was initiated with Integer will throw CTE");
   //candy = 56;

    println("Using val (NON-MUTABLE) ------------- var that cannot be changes even for the same data type");

    val immutableString = "I cannot be changed";
    //immutableString = "not possible";

}