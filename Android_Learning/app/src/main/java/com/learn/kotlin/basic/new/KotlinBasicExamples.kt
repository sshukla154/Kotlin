package com.learn.kotlin.basic.new


/*
Topics Covered:
(1) var vs val
(2) Comments (Single line and multi line)
(3) Integer Datatype
(4) Float Datatype
(5) Boolean Datatype
(6) Character Datatype
(7) String Datatype
(8) Arithmetic Operators (+, -, /, *, %)
(9) Comparision Operators (==, !=, <, >, <=, >=)
(10) Assignment Operators (=)
(11) Increment Operators (++) and Decrement Operators (==)
(12) if, if-else and if-elseIf-else Statements
(13) when Statements
(15) when with !in
(16) when with is keyword (Used to find the type of object/data)
(17) when with is keyword and !(Used to find the type of object/data)
(18) when with is keyword and !(Used to find the type of object/data)
(19) while loop
(20) do-while loop
(21) for loop using in keyword (use to iterate ranges, array, collection... anything that provides iterator)
(22) for loop using in and until keyword (use to iterate ranges, array, collection... anything that provides iterator)
(23) for loop using in and downTo keyword (use to iterate ranges, array, collection... anything that provides iterator)
(24) for loop using in, downTo and step keyword (use to iterate ranges, array, collection... anything that provides iterator)
(25) Function (fun)
(26) Function with Parameters
(27) Nullable in Kotlin
(28) Safe call operator with let
(29) Nullable - Elvis Operator(?:)
(30) Nullable - Not Null Assertion(!!) : Used only in-case when 101% sure then variable wont be null
*/

fun main() {

    println("--- var (mutable) vs val (immutable)")
    //var is Mutable (Can be changed) and val is immutable (Cannot be changed)
    var myName = "SShukla154"
    myName = "SShukla490"
    println("Hello $myName !!")

    val myOtherName = "SShukla"
    //myOtherName = "SShukla123"
    println("Hello $myOtherName !!")

    println("--- Type of comment")
    //Single Line Comment

    /*
    * Milti line comment
    *
    */

    println("--- INT datatypes")

    val myInt: Int = 123232323
    val myLong: Long = 30_00_00_00_00
    val myShort: Short = 125
    val myByte: Byte = 13
    println("Int : $myInt - Bits(" +Int.SIZE_BITS + "), Bytes(" +Int.SIZE_BYTES+"), Min Value("+Int.MIN_VALUE+"), Max Value("+Int.MAX_VALUE+")")
    println("Long : $myLong - Bits(" +Long.SIZE_BITS + "), Bytes(" +Long.SIZE_BYTES+"), Min Value("+Long.MIN_VALUE+"), Max Value("+Long.MAX_VALUE+")")
    println("Short : $myShort - Bits(" +Short.SIZE_BITS + "), Bytes(" +Short.SIZE_BYTES+"), Min Value("+Short.MIN_VALUE+"), Max Value("+Short.MAX_VALUE+")")
    println("Byte : $myByte - Bits(" +Byte.SIZE_BITS + "), Bytes(" +Byte.SIZE_BYTES+"), Min Value("+Byte.MIN_VALUE+"), Max Value("+Byte.MAX_VALUE+")")

    println("--- FLOAT datatypes")
    val myFloat: Float = 2.7182818284F
    val myDouble: Double = 2.7182818284
    println("Float : $myFloat - Min Value("+Float.MIN_VALUE+"), Max Value("+Float.MAX_VALUE+")")
    println("Double : $myDouble - Min Value("+Double.MIN_VALUE+"), Max Value("+Double.MAX_VALUE+")")

    println("--- Boolean datatypes")
    val myBoolean: Boolean = true
    println("Boolean : $myBoolean")

    println("--- Character datatypes")
    val myLetterChar: Char = 'A'
    val myDigitalChar: Char = '1'
    println("Letter Character : $myLetterChar")
    println("Digital Character : $myDigitalChar")

    println("--- String datatypes")
    val myString: String = "I am String"
    println("String : $myString")

    println("--- Arithmetic Operators (+, -, /, *, %)")
    val input1 = 5
    val input2 = 10

    println("Addition : " + (input1 + input2))
    println("Subtraction : " + (input1 - input2))
    println("Multiplication : " + (input1 * input2))
    println("Divide : " + (input2 / input1))
    println("Module : " + (input2 % input1))
    println("Module : " + ((input2+1) % input1))

    println("--- Comparision Operators (==, !=, <, >, <=, >=)")
    println("Is Equal : " + (input1 == input2))
    println("Is Not Equal : " + (input1 != input2))
    println("Is Less Than : " + (input1 < input2))
    println("Is Greater Than : " + (input1 > input2))
    println("Is Less Than Equal : " + (input1 <= input2))
    println("Is Greater Than Equal : " + (input1 >= input2))

    println("--- Assignment Operators (=)")
    var result = input1 + input2
    println("Before reassignment : $result")
    result += 5
    println("After reassignment : $result")

    println("--- Increment Operators (++) and Decrement Operators (==)")
    result++
    println("IO : $result")
    println("IO - 1 : ${result++}") // increments after use
    println("IO - 2 : ${++result}") // increments before use.

    result *= 15
    println("After reassignment - 1: $result")
    result--
    println("DO : $result")
    println("DO - 1 : ${result--}") // decrement after use
    println("DO - 2 : ${--result}") // decrement after use

    println("--- if, if-else and if-elseIf-else Statements")
    var heightPerson1 = 143
    var heightPerson2 = 156

    //If
    if(input1<input2){
        println("$input1 is not greater than $input2")
    }

    if(input1 != input2){
        println("We are not equal")
    } else {
        println("We are equal")
    }

    if(heightPerson2 > heightPerson1){
        println("Use raw force")
    } else if(heightPerson2 < heightPerson1){
        println("Use you power technique")
    } else {
        println("Use technique---")
    }

    println("--- when Statements")
    var season = 2

    when(season){
        1 -> println("Spring")
        2 -> {
            println("Summer")
        }
        3 -> println("Fall/ Autumn")
        4 -> {
            println("Winter")
        }
        else -> {
            println("Invalid Season")
        }
    }

    var month = 5

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall/ Autumn")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }


    var age = 35
    if(age >= 21) {
        println("You can drink alcohol in India")
    } else if (age >= 18) {
        println("You can vote in India")
    } else if (age >=16) {
        println("You can drive in India")
    } else {
        println("You are too young")
    }

//    NOTE: In above if-elseif-else case we have problem as age 18 and above is covered in age 16 and above... similary
//    age 21 is covered in age 18 and above... So we will refactor the above code with when

    when(age) {
        in 21..150 -> println("You can drink alcohol in India")
        in 18..20 -> println("You can vote in India")
        16, 17 -> println("You can drive in India")
        else -> println("You are too young")
    }

    println("--- When with !in")
    when(age) {
        !in 0..20 -> println("You can drink alcohol in India")
        in 18..20 -> println("You can vote in India")
        16, 17 -> println("You can drive in India")
        else -> println("You are too young")
    }

    println("--- When with is keyword (Used to find the type of object/data)")
    var x : Any = 13.24F
    when(x) {
        is Int -> println("$x is an Integer")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("None of the above")
    }

    println("--- When with is keyword and !(Used to find the type of object/data)")
    x = "13.24F"
    when(x) {
        is Int -> println("$x is an Integer")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("None of the above")
    }

    println("--- while loop")
    var num = 1
    while(num<=10){
        print("$num ")
        num++
    }

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp>=25) {
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    println("\n--- do-while loop: Executes atleast once")
    num = 15 // Even this 15 is bigger then 10, it will print 15
    do{
        print ("$num ")
        num++
    } while(num<=10)


    println("\n--- for loop using in keyword (use to iterate ranges, array, collection... anything that provides iterator)")
    for(i in 1..10){
        print("$i ")
    }

    println("\n--- for loop using in and until keyword (use to iterate ranges, array, collection... anything that provides iterator)")
    for(i in 1 until 10){
        print("$i ")
    }

    println("\n--- for loop using in and downTo keyword (use to iterate ranges, array, collection... anything that provides iterator)")
    for(i in 10 downTo 1){
        print("$i ")
    }

    println("\n--- for loop using in, downTo and step keyword (use to iterate ranges, array, collection... anything that provides iterator)")
    for(i in 10 downTo 1 step 2){
        print("$i ")
    }

    println()
    for(i in 10 downTo(1) step(3)){
        print("$i ")
    }

    println("\n--- Function")
    myFunction();
    myFunction();

    println("--- Function with Parameters")
    println(addUp(10,9));
    println(addUp(addUp(5, 16),9));

    println("--- Nullable (? = NULL can be assigned) in Kotlin")
    var name : String = "sshukla154"
    name = "sshukla490"
    //nullName = null ---> Compilation ERROR

    var nullableName : String? = "SShukla154"
    nullableName = null

    var nameLength = name.length

    println("Using old approach :")
    if(nullableName!=null){
        var nullableNameLength1 = nullableName.length
        println(nullableNameLength1)
    } else {
        null
    }

    println("Using safe (?.) approach :")
    var nullableNameLength = nullableName?.length
    println(nullableNameLength)

    println("--- safe call operator with let (When have to print when value is not null)")
//    nullableName?.let { println(it.length) }

    println("--- Nullable - Elvis Operator")
    val elvisName = nullableName?: "Guest"
    println("$elvisName")

    println("--- Nullable - Not Null Assertion : Used only in-case when 101% sure then variable wont be null")
    val nnName = elvisName!!.toLowerCase()
    println("$nnName")

    println("--- safe call operator can be called in a chain. Eg: var wifeAge : String? = user?.wife?.age ?: 0")

}

fun myFunction(){
    println("Called from myFunction")
}
fun addUp(a: Int, b: Int) : Int {
    return a+b
}