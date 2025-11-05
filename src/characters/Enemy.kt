package characters

open class Enemy(
    name: String,
    hp: Int = 0,
    element: String = "неизвестный"
) : GameCharacter(name, hp, element) {

    fun takeDamage(amount: Int) {
        println("Получено $amount урона")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }

    fun isStrong() : Boolean {
        return hp > 100
    }

    fun getThreatLevel(): String {
        if (hp < 0) { return "некорректное значение"}
        return when {
            hp <= 50 -> "низкий"
            hp >= 150 -> "средний"
            else -> "высокий"
        }
    }


}