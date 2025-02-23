//дз: есть три нулабельные строки st1, st2, st3,
//      в переменную resul сохранить длину всех строк.
//      и вывести на экран. Если resul = null, то вывести 0.
//    private var st1: String? = "str1"
//    private var st2: String? = "str12"
//    private var st3: String? = "str123"
    private val st1: String? = null
    private val st2: String? = null
    private val st3: String? = null
    private var result: Int = 0

fun main(args: Array<String>) {
    println("Hello Kotlin!")
    result = (st1?.length ?:0) + (st2?.length ?:0) + (st3?.length ?:0)
    println(result)
}