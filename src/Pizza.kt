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
    var totalSum: Double = 0.0

    fun calculateTotalSum() {
        totalSum = (pepperonicount * peperoniPrize) + (fourcheezcount * fourcheezPrize) + (romancount * romanPrize) + (siciliancount * sicilianPrize)
    }

    fun printCheck() {
        println("Ваш чек:")
        println("Пепперони: $pepperonicount x $peperoniPrize = ${pepperonicount * peperoniPrize}")
        println("4 сыра: $fourcheezcount x $fourcheezPrize = ${fourcheezcount * fourcheezPrize}")
        println("Римская: $romancount x $romanPrize = ${romancount * romanPrize}")
        println("Сицилийская: $siciliancount x $sicilianPrize = ${siciliancount * sicilianPrize}")
        println("Итого: $totalSum")
    }

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

    open fun showStats() {
        println("Количество проданных пепперони: $pepperonicount")
        println("Количество проданных 4 сыра: $fourcheezcount")
        println("Количество проданных римских пицц: $romancount")
        println("Количество проданных сицилийских пицц: $siciliancount")
    }
}