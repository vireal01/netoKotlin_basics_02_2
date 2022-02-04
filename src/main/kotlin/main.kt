fun main() {
    val likes = 123131231
    val correctForm = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $correctForm")
}