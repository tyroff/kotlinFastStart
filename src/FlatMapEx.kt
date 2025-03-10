fun main() {
    val revenueByWeek : List<List<Int>> = listOf(
        listOf(1,2,3,4,5,6,7,8,9,10),
        listOf(3,2,3,4,5,6,3,8,9,10),
        listOf(4,2,53,4,5,6,7,8,59,10),
        listOf(155,2,35,4,5,65,5,8,9,105)
    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }
//    вместо всего этого можно сделать по другому, см. ниже :)
    val total = revenueByWeek.flatMap { it } //тоже самое что выше закоммичено
//    val total = revenueByWeek.flatten() //т.к. flatMap ничего не делает с it то можно так написать
    val average = total.average()
    println(average)
//-------------------------------------
    val data = mutableMapOf<String, List<Int>>()
    data["file1"] = listOf(12,12,35,667)
    data.put("file2", listOf(32,14,375,647))
    data.put("file3", listOf(152,1,35,666))

    val dataNotMutable = mapOf (
        "file1" to listOf(12,12,35,667),
        "file2" to listOf(32,14,375,647),
        "file3" to listOf(152,1,35,666)
//        Pair("file4", listOf(332,1,354,66666))
    )

    val averageNotMutable = dataNotMutable.flatMap { it.value }.average()
    println(averageNotMutable)
}