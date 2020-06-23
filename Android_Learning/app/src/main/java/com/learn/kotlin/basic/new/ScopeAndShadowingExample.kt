package com.learn.kotlin.basic.new

fun main(){
 myFunction(10)
    myOtherFunction(10)
}

fun myFunction(a:Int){
    println("a is from parameters: $a")
}

fun myOtherFunction(a:Int){
    var a = 15
    println("a is from within the function: $a and this is called scope shadowing. Creating a variable with same name as parameter")
}