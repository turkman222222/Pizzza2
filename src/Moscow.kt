class Moskow (
    peperoniPrize: Double, romanPrize: Double,
    sicilianPrize: Double, fourcheezPrize:Double

):Pizza(
    peperoniPrize,romanPrize,
    sicilianPrize,fourcheezPrize

){
    override fun peppperoni() {
        pepperonicount++
        println("спасибо за покупку пепперони в Москве")
    }

    override fun fourcheez() {
        fourcheezcount++
        println("спасибо за покупку 4 сыра в Москве")
    }

    override fun roman() {
        romancount++
        println("спасибо за покупку римской пиццы в Москве")
    }

    override fun sicilian() {
        siciliancount++
        println("спасибо за покупку сицилийской в Москве")
    }
}