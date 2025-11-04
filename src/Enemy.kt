class Enemy {
    var name: String = "Враг"
    var hp: Int = 50
    var element: String = "Ветер"

    fun takeDamage(amount: Int) {
        println("Получено $amount урона")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }
}