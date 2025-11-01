class Hero {
    var name: String = "Неизвестный"
    var gender: String = "Не указан"
    var role: String = "Бродяга"
    var hp: Int = 100
    var mp: Int = 50
    var level: Int = 1
    var element: String = "Огонь"

    fun sayHello() {
        println("Я $name, мой путь только начинается!")
    }

    fun showStats() {
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage() {
        println("$name получает урон!")
        hp -= 10
        println("Осталость здоровья: $hp")
    }

    fun castSpell() {
        if (mp != 0) {
            mp -= 10
            println("Герой кастует фаербол")
        }
    }

    fun heal() {
        if (mp >= 10) {
            println("Лечусь! Восстановлено здоровье, потрачено 10 маны.\nЗдоровье: $hp | Мана: $mp")
        } else {
            println("НЕдостаточно маны! У вас только $mp")
        }
    }

    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")
        hp-=amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
        die()
    }

    fun die() {
        if (hp == 0) println("Герой умер")
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name атакует врага ${enemy.name} заклинанеим $spellName!")
        enemy.takeDamage(damage)
    }
}