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

    val temperature = 100
    val state: String = when {
        temperature < 0 -> "Твёрдое"
        temperature in 0..100 -> "Жидкое" // в диапазоне от нуля включительно до 100 включительно
        else -> "Газообразное"
    }
    println(state)
}