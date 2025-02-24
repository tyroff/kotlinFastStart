fun main() {
    //---Массив
    val array = arrayOf(1,2,3,4,5)
    // array[4] = null - нельзя т.к. тип не нулабельный (после типа не указан символ ?)
    println(array[4])

    val arrayWithNulls = arrayOfNulls<Int?>(10)
    // другой вариант записи
    // val arrayWithNulls: Array<Int?> = arrayOfNulls(10)
    arrayWithNulls[0] = 5
    arrayWithNulls[2] = null
    println(arrayWithNulls[1])

    //---ArrayList
    val listOfNumbers = ArrayList<Int>()
    // val listOfNumbers: List<Int> = ArrayList<Int>()
    // Set, List, Map являются НЕ изменяемые (onlyRead)
    // val listOfNumbers: MutableList<Int> = ArrayList<Int>()
    // MutableSet, MutableList, MutableMap являются изменяемые
    listOfNumbers.add(1)
    listOfNumbers.add(2)
    //println(listOfNumbers.get(0))
    println(listOfNumbers[0])
}