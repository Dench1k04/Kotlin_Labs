//Виконав Долгов Денис ІКМ-221а, Варіант № 8
class Customer(val name: String, val address: String, val purchaseCount: Int) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        // Порівнюємо покупців за кількістю покупок.
        return purchaseCount.compareTo(other.purchaseCount)
    }
}

fun main() {
    val customer1 = Customer("Ivan", "Kyiv", 5)
    val customer2 = Customer("Maria", "Lviv", 10)
    val customer3 = Customer("Peter", "Odessa", 8)

    val customers = listOf(customer1, customer2, customer3)

    // Сортуємо покупців за кількістю покупок.
    val sortedCustomers = customers.sorted()

    for (customer in sortedCustomers) {
        // Виводимо відсортованих покупців на консоль.
        println("Ім'я: ${customer.name}, Адреса: ${customer.address}, Кількість покупок: ${customer.purchaseCount}")
    }
}
