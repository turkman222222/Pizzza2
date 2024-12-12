class SPB(
    peperoniPrize: Double,
    romanPrize: Double,
    sicilianPrize: Double,
    fourcheezPrize: Double
) : Pizza(peperoniPrize, romanPrize, sicilianPrize, fourcheezPrize) {
    override fun peppperoni() {
        super.peppperoni()
        println("в СПБ")
        calculateTotalSum()
        printCheck()
    }

    override fun fourcheez() {
        super.fourcheez()
        println("в СПБ")
        calculateTotalSum()
        printCheck()
    }

    override fun roman() {
        super.roman()
        println("в СПБ")
        calculateTotalSum()
        printCheck()
    }

    override fun sicilian() {
        super.sicilian()
        println("в СПБ")
        calculateTotalSum()
        printCheck()
    }
}
/////