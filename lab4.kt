data class User(val name: String, val age: Int?)

fun averageAge(users: List<User?>): Double? {
    // Фільтруємо користувачів, у яких вік відомий
    val usersWithAge = users.filter { it?.age != null }.mapNotNull { it?.age }

    // Перевіряємо, чи є користувачі з віком
    if (usersWithAge.isEmpty()) {
        return null
    }

    // Обчислюємо середній вік
    val average = usersWithAge.average()
    return average
}

/**
 * Приклад використання функції [averageAge].
 */
fun main() {
    // Приклад використання
    val usersList = listOf(
        User("Ann", 25),
        null,
        User("Den", null),
        User("Nika", 30),
        User("Sergey", 28),
        null
    )

    val result = averageAge(usersList)

    if (result != null) {
        println("Середній вік: $result")
    } else {
        println("Вік не відомий для жодного з користувачів.")
    }
}
