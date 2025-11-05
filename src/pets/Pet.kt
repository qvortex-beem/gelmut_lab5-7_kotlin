package pets

open class Pet(
    val speed: Int,
    val name: String,
    val maxHealth: Int
) {
    fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
    }

    fun makeSound() {
        println("$name подает голос.")
    }
}