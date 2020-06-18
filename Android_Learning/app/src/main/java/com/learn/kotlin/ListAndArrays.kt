package com.learn.kotlin

import java.time.Clock

fun main(args : Array<String>) {

    println("List ------------------------------IMMUTABLE (Cannot be modified oce created)")
    val listOfChocolate = listOf<String>("Fun Dip", "Snickers", "100 Grand Bar")

    // NOTE: We cannot modify the list or its elements because this list is IMMUTABLE
    // listOfChocolate[1]="Milk Bar";
    println(listOfChocolate[0]);
    println(listOfChocolate[1]);
    println(listOfChocolate[2]);
//  println(listOfChocolate[3]);


    println("Arrays ------------------------------")
    val arrayOfChocolate = arrayOf<String>("Fun Dip", "Snickers", "100 Grand Bar")

    arrayOfChocolate[1] = "Milk Bar";
    println(arrayOfChocolate[0]);
    println(arrayOfChocolate[1]);
    println(arrayOfChocolate[2]);

    println("MutableList ------------------------------ List which can be changed")

    val mutableListOfChocolate = mutableListOf<String>("Fun Dip - 1", "Snickers - 1", "100 Grand Bar - 1")
    mutableListOfChocolate.add(2, "Choco - 1");
    val collectionOfString = listOfChocolate
    mutableListOfChocolate.addAll(3, listOfChocolate);

    mutableListOfChocolate.add("candy");
    println(mutableListOfChocolate[0]);
    println(mutableListOfChocolate[1]);
    println(mutableListOfChocolate[2]);
    println(mutableListOfChocolate[3]);
    println(mutableListOfChocolate[4]);
    println(mutableListOfChocolate[5]);
    println(mutableListOfChocolate[6]);
    println(mutableListOfChocolate[7]);
    mutableListOfChocolate.remove("Snickers");

}