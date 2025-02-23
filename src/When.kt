fun main() {
    val nameOfMonth = "Марк"
    val season: String = when(nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> {
            "Зима"
        }
        "Март", "Апрель", "Май" -> {
            "Весна"
        }
        "Июнь", "Июль", "Август" -> {
            "Лето"
        }
        "Сентябрь", "Октябрь", "Ноябрь" -> {
            "Осень"
        }
        else -> {
            "Нет такого месяца :("
        }
    }
    println(season)

    val temperature = 80
    val state: String = when {
        temperature < 0 -> "Твёрдое"
        temperature < 100 -> "Жидкое"
        else -> "Газообразное"
    }
    println(state)
}