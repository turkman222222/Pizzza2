class Kazan(
    peperoniPrize: Double,
    romanPrize: Double,
    sicilianPrize: Double,
    fourcheezPrize: Double
) : Pizza(peperoniPrize, romanPrize, sicilianPrize, fourcheezPrize) {
    override fun peppperoni() {
        super.peppperoni()
        println("в Казани")
    }

    override fun fourcheez() {
        super.fourcheez()
        println("в Казани")
    }

    override fun roman() {
        super.roman()
        println("в Казани")
    }

    override fun sicilian() {
        super.sicilian()
        println("в Казани")
    }

    fun showSauce() {
        println("Выберите соус")
        println("1. Томатный")
        println("2. Сметанный")
        val sauce = readLine()

        when (sauce) {
            "1" -> println("Томатный соус")
            "2" -> println("Сметанный соус")
            else -> println("ERROR")
        }
    }
}