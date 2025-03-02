fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b} //анонимная функция или лямбда выражение
    println(sum(2, "10".toInt()))
    println(sum(3, 10))

    val square: (Int) -> Int = {it * it} // т.к. один параметр и указан его тип то можно не создавать переменную вместо неё указать it
    println(square(3))

    val sayHello: (String) -> Unit = { println("Hello , $it !")} //() -> Unit - нет входных параметров и Unit нет возвращаемого типа аналог void d Java
    sayHello("Harry Potter")

    //Сортировка массива в обратном порядке
    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size-2 downTo 0) { // начинаем с предпоследнего элемента и до начала массива
            for (j in 0..i) {
                if (it[j] < it[j+1]) {
                    val temp = it[j]
                    it[j] = it[j+1]
                    it[j+1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(3,-1,34,-22,55,111,13))
    for (i in sortedArray) {
        println(i)
    }
}