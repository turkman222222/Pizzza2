class SPB(
    peperoniPrize: Double, romanPrize: Double,
    sicilianPrize: Double, fourcheezPrize:Double

):Pizza(
    peperoniPrize,romanPrize,
    sicilianPrize,fourcheezPrize

){
    override fun peppperoni() {
        pepperonicount++
        println("спасибо за покупку пепперони в спб")
    }

    override fun fourcheez() {
        fourcheezcount++
        println("спасибо за покупку 4 сыра в спб")
    }

    override fun roman() {
        romancount++
        println("спасибо за покупку римской пиццы в спб")
    }

    override fun sicilian() {
        siciliancount++
        println("спасибо за покупку сицилийской в спб")
    }
}