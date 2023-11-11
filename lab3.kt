//Виконав Долгов Денис ІКМ-221а, Варіант № 8
// Оголошення data class, який представляє користувача з ім'ям та списком друзів.
data class User(val name: String, val friends: List<String>)

// Функція для знаходження користувача з найбільшою кількістю друзів у заданому списку користувачів.
fun findUserWithMostFriends(users: List<User>): User? {
    var userWithMostFriends: User? = null
    var maxFriendsCount = 0

    // Переглядаємо кожного користувача у списку.
    for (user in users) {
        val friendsCount = user.friends.size

        // Порівнюємо кількість друзів поточного користувача з максимальною кількістю друзів,
        // яку ми знали до цього моменту.
        if (friendsCount > maxFriendsCount) {
            maxFriendsCount = friendsCount
            userWithMostFriends = user
        }
    }

    // Повертаємо користувача з найбільшою кількістю друзів або null, якщо список користувачів порожній.
    return userWithMostFriends
}

fun main() {
    // Приклад використання

    // Створення об'єктів користувачів
    val user1 = User("User1", listOf("Friend1", "Friend2", "Friend3"))
    val user2 = User("User2", listOf("Friend1", "Friend2"))
    val user3 = User("User3", listOf("Friend1", "Friend2", "Friend3", "Friend4"))

    // Створення списку користувачів
    val userList = listOf(user1, user2, user3)

    // Виклик функції для знаходження користувача з найбільшою кількістю друзів
    val userWithMostFriends = findUserWithMostFriends(userList)

    // Вивід результату
    if (userWithMostFriends != null) {
        println("Користувач з найбільшою кількістю друзів: ${userWithMostFriends.name}")
    } else {
        println("Список користувачів порожній")
    }
}
