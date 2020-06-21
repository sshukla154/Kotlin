package com.learn.kotlin.basic

fun main(args: Array<String>){

    class Dog() {
        var name = "";
        var age = 0;
        var furColor = "";

        fun dogInfo() : String {
            return name + " is " + age + " years old and has "+ furColor + " fur.";
        }
    }

    var myDog = Dog();
    myDog.name = "Lucy"
    myDog.age = 2
    myDog.furColor = "Black"

    var otherDog = Dog();
    otherDog.name = "Casper"
    otherDog.age = 1
    otherDog.furColor = "Brown"


    println(myDog.name);
    println(otherDog.name);

    println("--------------------------");

    println(myDog.dogInfo());
    println(otherDog.dogInfo());


}