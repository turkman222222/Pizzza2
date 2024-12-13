class SPB(
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
        println("в СПБ")
    }

    override fun fourcheez() {
        super.fourcheez()
        println("в СПБ")
    }

    override fun roman() {
        super.roman()
        println("в СПБ")
    }

    override fun sicilian() {
        super.sicilian()
        println("в СПБ")
    }
}
