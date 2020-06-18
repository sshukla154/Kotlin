package com.learn.kotlin

fun main(args: Array<String>){

    fun printHello() {
        println("Hello World !!");
    }

    fun addTwoNumbers(number1 : Int , number2 : Int) {
        println(number1 + number2);
    }

    fun addTwoNumbersWithReturn(number1 : Int , number2 : Int) : Int {
        return number1 + number2;
    }

    printHello();
    addTwoNumbers(3, 5);

    val addTwoNumbersWithReturn = addTwoNumbersWithReturn(6, 8);
    println(addTwoNumbersWithReturn);


    val addTwoNumbersWithReturn_1 = addTwoNumbersWithReturn(addTwoNumbersWithReturn(16, 81), addTwoNumbersWithReturn(62, 12));
    println(addTwoNumbersWithReturn_1);
}