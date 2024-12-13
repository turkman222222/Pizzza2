open class Pizza(
    val peperoniPrize: Double,
    val romanPrize: Double,
    val sicilianPrize: Double,
    val fourcheezPrize: Double,
    val coffeePrize: Double,
    val discount: Double,
    val sauce1Prize: Double,
    val sauce2Prize: Double
) {
    var pepperonicount = 0
    var fourcheezcount = 0
    var romancount = 0
    var siciliancount = 0
    var totalSum: Double = 0.0
    var coffeeCount = 0
    var checkCount = 0
    var sauce1Count = 0
    var sauce2Count = 0

    fun calculateTotalSum() {
        totalSum = (pepperonicount * peperoniPrize) +
                (fourcheezcount * fourcheezPrize) +
                (romancount * romanPrize) +
                (siciliancount * sicilianPrize) +
                (coffeeCount * coffeePrize) +
                (sauce1Count * sauce1Prize) +
                (sauce2Count * sauce2Prize)

        // Применение скидки, если она задана
        if (totalSum > 0) {
            totalSum -= totalSum * discount
        }
    }

    fun printCheck() {
        println("Ваш чек:")
        println("Пепперони: $pepperonicount x $peperoniPrize = ${pepperonicount * peperoniPrize}")
        println("4 сыра: $fourcheezcount x $fourcheezPrize = ${fourcheezcount * fourcheezPrize}")
        println("Римская: $romancount x $romanPrize = ${romancount * romanPrize}")
        println("Сицилийская: $siciliancount x $sicilianPrize = ${siciliancount * sicilianPrize}")
        println("Кофе: $coffeePrize x $coffeeCount = ${coffeeCount * coffeePrize}")
        println("Соус 1: $sauce1Count x $sauce1Prize = ${sauce1Count * sauce1Prize}")
        println("Соус 2: $sauce2Count x $sauce2Prize = ${sauce2Count * sauce2Prize}")
        println("Итого: $totalSum")
    }

    open fun peppperoni() {
        pepperonicount++
        println("Спасибо за покупку пепперони")
        calculateTotalSum()
    }

    open fun fourcheez() {
        fourcheezcount++
        println("Спасибо за покупку 4 сыра")
        calculateTotalSum()
    }

    open fun roman() {
        romancount++
        println("Спасибо за покупку римской пиццы")
        calculateTotalSum()
    }

    open fun sicilian() {
        siciliancount++
        println("Спасибо за покупку сицилийской пиццы")
        calculateTotalSum()
    }

    open fun buyCoffee() {
        coffeeCount++
        println("Спасибо за покупку кофе")
    }

    open fun showCheck() {
        checkCount++
        println("Спасибо за показ чека")
    }

    open fun buySauce1() {
        sauce1Count++
        println("Спасибо за покупку соуса 1")
    }

    open fun buySauce2() {
        sauce2Count++
        println("Спасибо за покупку соуса 2")
    }

    open fun showStats() {
        println("Количество проданных пепперони: $pepperonicount")
        println("Количество проданных 4 сыра: $fourcheezcount")
        println("Количество проданных римских пицц: $romancount")
        println("Количество проданных сицилийских пицц: $siciliancount")
        println("Количество проданных кофе: $coffeeCount")
        println("Количество показанных чеков: $checkCount")
        println("Количество проданных соусов 1: $sauce1Count")
        println("Количество проданных соусов 2: $sauce2Count")
        println("Общая сумма выручки: $totalSum")

        // Подсчет процентов
        val totalPurchases = coffeeCount + checkCount
        val coffeePercentage = if (totalPurchases > 0) (coffeeCount.toDouble() / totalPurchases * 100) else 0.0
        val checkPercentage = if (totalPurchases > 0) (checkCount.toDouble() / totalPurchases * 100) else 0.0

        println("Процент покупателей, купивших кофе: $coffeePercentage%")
        println("Процент покупателей, показавших чек: $checkPercentage%")
    }
}