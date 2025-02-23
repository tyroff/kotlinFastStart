fun main(args: Array<String>) {
    var count: Int = 400
/*    val food = if (count > 299) {
        "Пицца"
    } else if (count < 10) {
        "Вода"
    } else {
        "Хлеб"
    }
    println("Можешь купить: $food")*/
//    println("Можешь купить: ${food.length}")
    val food = if (count > 300) {
        //тут можно делать всё
        //последнее должно быть значение для переменной food
        count -= 100
        "Пицца"
    } else if (count < 10) {
        300
    } else {
        null
    }
    println("Можешь купить: $food, осталось $count $")

}