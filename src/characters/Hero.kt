package characters

import world.Quest

class Hero(
    name: String = "безымянный",
    val gender: String = "мужской",
    var role: String = "отсутствует",
    hp: Int = 1,
    var mp: Int = 1,
    var level: Int = 1,
    element: String = "обнинск",
    val experience: Int = 0
) : GameCharacter(name, hp, element) {

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
        if (element == enemy.element) {
            enemy.takeDamage(damage/2)
        } else {
            enemy.takeDamage(damage)
        }
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается")

        println("$name атакует первым")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает")
        this.takeDamage(15)

        println("Дуэль завершена")
        println("Состояние героев:")
        this.showStats()
        opponent.showStats()
    }

    fun isAlive() : Boolean {
        return hp > 0
    }

    fun canAcceptQuest(quest: Quest) : Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "легкий" -> level >= 1
            "средний" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept) {
            println("$name ожет принять квест «${quest.title}»!")
        } else {
            println("$name не может принять квест «${quest.title}». Требуется более высокий уровень.")
        }

        return canAccept
    }
}