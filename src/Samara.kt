class Samara(
    peperoniPrize: Double,
    romanPrize: Double,
    sicilianPrize: Double,
    fourcheezPrize: Double,
   //// val coffeePrize: Double,
    val discount: Double,
    val sauce1Prize: Double,
    val sauce2Prize: Double
) : Pizza(peperoniPrize, romanPrize, sicilianPrize, fourcheezPrize) {
    var coffeeCount = 0
    var checkCount = 0
    var sauce1Count = 0
    var sauce2Count = 0

    override fun peppperoni() {
        super.peppperoni()
        println("в Самаре")
        calculateTotalSum()
        printCheck()
    }

    override fun fourcheez() {
        super.fourcheez()
        println("в Самаре")
        calculateTotalSum()
        printCheck()
    }

    override fun roman() {
        super.roman()
        println("в Самаре")
        calculateTotalSum()
        printCheck()
    }

    override fun sicilian() {
        super.sicilian()
        println("в Самаре")
        calculateTotalSum()
        printCheck()
    }

    fun buyCoffee() {
        coffeeCount++
        println("Спасибо за покупку кофе")
    }

    fun showCheck() {
        checkCount++
        println("Спасибо за показ чека")
        totalSum *= (1 - discount)
    }

    fun buySauce1() {
        sauce1Count++
        println("Спасибо за покупку соуса 1")
        totalSum += sauce1Prize
    }
//
    fun buySauce2() {
        sauce2Count++
        println("Спасибо за покупку соуса 2")
        totalSum += sauce2Prize
    }



    override fun showStats() {
        super.showStats()
        println("Количество проданных кофе: $coffeeCount")
        println("Количество показанных чеков: $checkCount")
        println("Количество проданных соусов 1: $sauce1Count")
        println("Количество проданных соусов 2: $sauce2Count")
        println("Общая сумма выручки: $totalSum")
    }
}