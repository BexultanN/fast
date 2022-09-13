fun main(args: Array<String>) {
    println("Hello, World!")
    println("Hello, ${args[0]}")

    val test1 = 5
    val test2 = 9
    println("Sum of the test1 and test is ${test1 + test2}")

    val items = listOf("banana", "apple", "orange")
    var items2 = mutableListOf("banana", "apple", "orange")

    for (item in items)
        println(item)

    println("$items")
    println("$items2")

    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    println(5 in 1..100)
    println(50 in 1..10)

    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    val ratio1 = 500
    val ratio2 = 100
     if(ratio1 < ratio2) {
         println("Good")
         } else {
             println("Not good")
     }


    val food = 80
    if(food in 1..100) {
        println(food)
    }

     val numberOfcar = 30
    if (numberOfcar == 0) {
        println("Empty tank")
    } else if (numberOfcar < 40) {
        println("Got car!")
    } else {
        println("That's a lot of car!")
    }

    val numberOfFlash = 50
    when (numberOfFlash) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got flash!")
        else -> println("That's a lot of flash!")
    }
}
