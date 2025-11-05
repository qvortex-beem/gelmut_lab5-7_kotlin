package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String
) : Mission(title, reward) {

    fun printInfo() {
        println("Название квеста: ${this.title} \nВремя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}\n")
    }

    fun isHard() : Boolean {
        return difficulty.lowercase() == "сложный"
    }

    fun goldPerHour(): Int {
        require(duration >= 0 && reward >= 0) {"длительность и награда не могут быть отрицательными"}
        if (duration == 0) return 0
        return reward / duration
    }
}