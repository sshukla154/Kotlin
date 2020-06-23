package com.learn.kotlin.basic.new

import java.util.*

data class User(var id : Long, var name: String)

fun main() {

    var user1 = User(1, "SShukla154")
    println("${user1.id} is ID of ${user1.name}" )

    var user2 = User(1, "SShukla154")
    println(user1==user2)
    println(user1.equals(user2))

    user1.name = "SShukla490"
    var user3 = User(1, "SShukla490")
    println(user1==user3)
    println(user3.equals(user3))


    //Copying object
    var updatedUser = user3.copy(name = "SShukla123")
    println(user3)
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())


    var(_id, _name) = updatedUser
    println("Id is $_id and name is $_name")

}