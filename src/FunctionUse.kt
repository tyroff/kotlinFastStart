fun main(args:Array<String>){
    println(max(3,5))
    println(min(3,5))
}

fun max(a: Int, b: Int): Int { // ): Int - возвращаемый тип
//    if (a > b){
//        return a
//    } else {
//        return b
//    }
    return if (a > b){
        a
    } else {
        b
    }
}

fun min(a: Int, b: Int) = if (a < b) a else b // краткая форма конструкции функции max