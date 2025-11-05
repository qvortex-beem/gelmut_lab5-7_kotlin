package items

class Item(
    val name: String,
    val price: Int
) {

    fun displayInfo() {
        println("Товар: $name, цена: $price")
    }
}