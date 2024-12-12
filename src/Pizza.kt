open class Pizza(
    val peperoniPrize: Double,
    val romanPrize: Double,
    val sicilianPrize: Double,
    val fourcheezPrize: Double
) {
    var pepperonicount = 0
    var fourcheezcount = 0
    var romancount = 0
    var siciliancount = 0
    var checkCount = 0
    var discountSum = 0.0
    var coffeeCount = 0
    var coffeeSum = 0.0
    var revenue = 0.0

    open fun peppperoni() {
        pepperonicount++
        println("Спасибо за покупку пепперони")
    }

    open fun fourcheez() {
        fourcheezcount++
        println("Спасибо за покупку 4 сыра")
    }

    open fun roman() {
        romancount++
        println("Спасибо за покупку римской пиццы")
    }

    open fun sicilian() {
        siciliancount++
        println("Спасибо за покупку сицилийской пиццы")
    }

    open fun showCheck() {
        checkCount++
        println("Спасибо за показ чека")
    }

    open fun buyCoffee() {
        coffeeCount++
        println("Спасибо за покупку кофе")
    }
}
