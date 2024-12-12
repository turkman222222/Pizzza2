class Moskow(
    peperoniPrize: Double,
    romanPrize: Double,
    sicilianPrize: Double,
    fourcheezPrize: Double
) : Pizza(peperoniPrize, romanPrize, sicilianPrize, fourcheezPrize) {
    override fun peppperoni() {
        super.peppperoni()
        println("в Москве")
    }

    override fun fourcheez() {
        super.fourcheez()
        println("в Москве")
    }

    override fun roman() {
        super.roman()
        println("в Москве")
    }

    override fun sicilian() {
        super.sicilian()
        println("в Москве")
    }
}