fun main() {
    val naruto: Hero = Hero()
    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150
    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")

    val sasuke = Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp = 180
    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")

    val godjo = Hero()
    godjo.name = "Годжо Сатору"
    godjo.gender = "Мужской"
    godjo.role = "Маг Проклятий"
    godjo.hp = 160
    godjo.mp = 300
    println("Имя: ${godjo.name} \nПол: ${godjo.gender} \nКласс: ${godjo.role}\nЗдоровье: ${godjo.hp}\nМана: ${godjo.mp}")

    val hero = Hero()
    print("Введите имя героя: ")
    hero.name = readln()
    print("Введите пол героя: ")
    hero.gender = readln()
    print("Введите класс героя: ")
    hero.role = readln()
    print("Введит здоровье героя: ")
    hero.hp = readln().toInt()
    print("Введите ману героя: ")
    hero.mp = readln().toInt()
    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}")

    val elementHero = Hero()
    elementHero.name = "Утер"
    elementHero.gender = "Мужской"
    elementHero.role = "паладин"
    elementHero.hp = 450
    elementHero.mp = 600
    elementHero.level = 50
    elementHero.element = "свет"
    println("Имя: ${elementHero.name} \nПол: ${elementHero.gender} \nКласс: ${elementHero.role}\nЗдоровье: ${elementHero.hp}\nМана: ${elementHero.mp} \nУровень ${elementHero.level} \nСтихия: ${elementHero.element}")
}