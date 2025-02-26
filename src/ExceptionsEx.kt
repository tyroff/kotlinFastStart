fun main(args:Array<String>){
    println(sum("10", "20"))
    println(sum("10", "qwerty"))
}

fun sum(a: String, b: String): Int {
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + b.toInt()
    } catch (e: NumberFormatException) {
        0
    }

    println(result)
    return result + 1
}