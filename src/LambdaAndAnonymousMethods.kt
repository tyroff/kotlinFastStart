fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b} //анонимная функция или лямбда выражение
    println(sum(2, "10".toInt()))

    val square: (Int) -> Int = {it * it} // т.к. один параметр и указан его тип то можно не создавать переменную вместо неё указать it
                //() -> Unit - нет входных параметров и Unit нет возвращаемого типа аналог void d Java

}