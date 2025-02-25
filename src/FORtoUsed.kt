fun main() {
    val array = arrayOf(1,2,3,4,5)
    for (i in array) {
        println(i)
    }
    println("------------")
    val array2 = arrayOfNulls<Int?>(11)
    //for (i in array2.size - 1) {
    //for (i in 0 until array2.size) {
    for (i in 0..10) {
        array2[i] = i
    }
    for (i in array2) {
        println(i)
    }
    println("В обратном порядке по массиву")
    for (i in 10 downTo 0) {
        println(i)
    }
    println("В обратном порядке каждый второй элемент")
    for (i in 10 downTo 0 step 2) {
        println(i)
    }
    println("Использование Индексов")
    val arrayWithIndex = arrayOfNulls<Int?>(11)
    for(i in 0..10) {
        arrayWithIndex[i] = i
    }
    for((index, i) in arrayWithIndex.withIndex()) { // индексы значений
        arrayWithIndex[index] = i?.times(2) // i?.times(2) - если i не null то умножит на 2 иначе ничего не сделает
    }
    for(i in arrayWithIndex) {
        println(i)
    }
    println("Использование Индексов для значений")
    val arrayWI = arrayOfNulls<Int?>(31)
    for((index, i) in (300..330).withIndex()) {
        arrayWI[index] = i
    }
    for(i in arrayWI) {
        println(i)
    }

}