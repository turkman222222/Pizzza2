class Kazan(
    peperoniPrize: Double,
    romanPrize: Double,
    sicilianPrize: Double,
    fourcheezPrize: Double,
    coffeePrize: Double,
    discount: Double,
    sauce1Prize: Double,
    sauce2Prize: Double
) : Pizza(peperoniPrize, romanPrize, sicilianPrize, fourcheezPrize, coffeePrize, discount, sauce1Prize, sauce2Prize) {
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
}