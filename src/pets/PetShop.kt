package pets

fun main() {
//    val wolf = Wolf()
//    println(wolf.packSize)

    val pets = listOf(
        Wolf("фенрир"),
        Cat("мурзик"),
        Eagle("скайвинд"),
        Bear("балу")
    )

    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }
}