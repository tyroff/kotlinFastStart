fun main(args: Array<String>) {
    printInfo(patronymic = "Ivanovich", name = "Ivan", lastName = "Ivanov") // именные параметры указаны. Можно указать в другой последовательности
    printInfo("Ivanov","Ivan","Ivanovich")
    println(volume(10))
    println(volume(10, 20))
    println(volume(10, 20, 30))
}

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") { // после равно указаны значения по умолчанию
    if (lastName.isNotEmpty()) {
        println(lastName)
    }
    if (name.isNotEmpty()) {
        println(name)
    }
    if (patronymic.isNotEmpty()) {
        println(patronymic)
    }
}

fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c