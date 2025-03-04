fun main() {
    val array = (1..100).toList()
    val employees = array.map{"Employee №$it"}
    val first30 = employees.take(30)    //берёт первые 30 элементов
    val last30 = employees.takeLast(30) //берёт последниеы 30 элементов
    val firstDrop30 = employees.drop(30)    //выбросит первые 30 элементов
    val lastDrop30 = employees.takeLast(30) //выбросит последниеы 30 элементов

    for (employee in employees) {
        print("${employee}, ")
    }
    println()
    for (employee in first30) {
        print("${employee}, ")
    }
    println()
    for (employee in last30) {
        print("${employee}, ")
    }
    println()
    for (employee in firstDrop30) {
        print("${employee}, ")
    }
    println()
    for (employee in lastDrop30) {
        print("${employee}, ")
    }

    val arraySequence = generateSequence (1) {it + 1} //бесконечная генерация в массив

    val arraySequenceEmploees = generateSequence ("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index + 1}"
    }
    println()
    val listOfFirst10 = arraySequenceEmploees.take(5)
    for (employee in listOfFirst10) {
        print("${employee}, ")
    }
}