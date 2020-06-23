package com.learn.kotlin.basic.new

fun main() {

    var sshukla154Person : Person = Person("S", "Shukla154")
    var defaultPerson : Person = Person()
    var firstNamePerson : Person = Person(firstName = "OnlyFirstName")
    var LastNamePerson : Person = Person(lastName = "OnlyLastName")

    //Using default value for hobby
    firstNamePerson.stateHobby()

    //Using user defined value for hobby
    sshukla154Person.hobby = "Coding !!!"
    sshukla154Person.stateHobby()

    //Using user defined value for hobby
    defaultPerson.hobby = "playing video game."
    defaultPerson.stateHobby()

    //Using secondary constructor
    sshukla154Person = Person("S", "Shukla154", 31)
    sshukla154Person.age = 33
    println("SShukla154 is ${sshukla154Person.age} years old")

}

class Person constructor(firstName: String = "Default FirstName", lastName: String= "Default Last Name"){
    //Member Variables - Properties
    var age : Int? = null
    var hobby : String = "Watching Netflix"
    var _firstName : String? = null

    init {
        this._firstName = firstName
        println("Initializing the new person object with first name = $firstName "+" and last name = $lastName")
    }

    // Member Secondary Constructor
    constructor(firstName: String, lastName: String, _age: Int) : this(firstName, lastName){
        this.age = _age
        println("Initializing the new person object with first name = $firstName "+" and last name = $lastName and age = $_age")
    }

    //Member Function - Methods (A function within a class)
    fun stateHobby(){
        println ("$_firstName\'s Hobby is $hobby")
    }

}