fun main() { // шаг 5
//    val naruto: Hero = Hero()
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
//    naruto.name = "Наруто Узумаки"
//    naruto.gender = "Мужской"
//    naruto.role = "Хокаге"
//    naruto.hp = 200
//    naruto.mp = 150
//    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role}\nЗдоровье: ${naruto.hp}\nМана: ${naruto.mp}")
//
//    val sasuke = Hero()
//    sasuke.name = "Саске Учиха"
//    sasuke.gender = "Мужской"
//    sasuke.role = "Шиноби-отступник"
//    sasuke.hp = 120
//    sasuke.mp = 180
//    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role}\nЗдоровье: ${sasuke.hp}\nМана: ${sasuke.mp}")
//
//    val godjo = Hero()
//    godjo.name = "Годжо Сатору"
//    godjo.gender = "Мужской"
//    godjo.role = "Маг Проклятий"
//    godjo.hp = 160
//    godjo.mp = 300
//    println("Имя: ${godjo.name} \nПол: ${godjo.gender} \nКласс: ${godjo.role}\nЗдоровье: ${godjo.hp}\nМана: ${godjo.mp}")
//
//    val hero = Hero()
//    print("Введите имя героя: ")
//    hero.name = readln()
//    print("Введите пол героя: ")
//    hero.gender = readln()
//    print("Введите класс героя: ")
//    hero.role = readln()
//    print("Введит здоровье героя: ")
//    hero.hp = readln().toInt()
//    print("Введите ману героя: ")
//    hero.mp = readln().toInt()
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp}")
//
//    val hero = Hero()
//    hero.name = "Утер"
//    hero.gender = "Мужской"
//    hero.role = "паладин"
//    hero.hp = 450
//    hero.mp = 600
//    hero.level = 50
//    hero.element = "свет"
//    println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role}\nЗдоровье: ${hero.hp}\nМана: ${hero.mp} \nУровень ${hero.level} \nСтихия: ${hero.element}")
//
//    hero.sayHello()
//    hero.showStats()
//    hero.meditate()
//    hero.takeDamage()
//    hero.castSpell()
//    hero.heal()

//    val hero = Hero()
//    hero.greet(hero.name)
//    hero.greet("Наруто")

//    val hero = Hero()
//    hero.takeDamage(30)
//    hero.takeDamage(20)

    val naruto = Hero()
    naruto.name = "Наруто"
    naruto.role = "Шиноби"
    naruto.element = "Ветер"

    val orochimaru = Enemy()
    orochimaru.name = "Орочимару"
    naruto.showStats()
    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)
}