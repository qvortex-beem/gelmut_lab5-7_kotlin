package magic

import magic.Spell

fun main() {
//    val fireWall = Spell("Огненная стена", 5, 5, "\uD83D\uDD25")
//    fireWall.cast()
//    val waterHit = Spell("Водяной удар", 10,1, "\uD83C\uDF0A")
//    waterHit.cast()
//
//    println(fireWall.area())
//    println(waterHit.area())

    val fireball = Spell("Огненная стена", 3, 3, "\uD83D\uDD25")
    val heal = InstantSpell("лечение", "\uD83D\uDC9A", 5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}