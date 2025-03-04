fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100) {
        names.add("Name$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    // Объединение массивов в один
    val users = names.zip(phones)
    for (user in users) {
        println("User: ${user.first}, phone: ${user.second}")
    }

}