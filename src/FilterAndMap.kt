fun main() {
    // FILTER
    val listOfNumbers = mutableListOf<Int>()
    for (i in 1..100) {
        listOfNumbers.add(i)
    }
    //получить массив которых будет содержать чётные числа массива listOfNumbers
    //val listOfEvenNumbers = listOfNumbers.filter({number: Int -> number % 2 == 0})
    val listOfEvenNumbers = listOfNumbers.filter{it % 2 == 0}
    for (i in listOfEvenNumbers) {
        print("$i ")
    }

    println()

    // MAP
    val numbers = (1..100).toList()
     val doubleNumbers = numbers.map {it * 2}
    for (i in doubleNumbers) {
        print("$i ")
    }

    println()
    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    val result = initArray.filter { it % 5 == 0 || it % 3 ==0 }
                            .map { it * it }
                            .sortedDescending()
                            .map { "$it " }
    for(i in result){
        print("$i ")
    }
}