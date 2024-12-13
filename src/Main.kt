import kotlin.system.exitProcess

fun main() {
    val spb = SPB(
        peperoniPrize = 175.0, romanPrize = 241.5,
        sicilianPrize = 167.5, fourcheezPrize = 220.4,
        coffeePrize = 50.0,
        discount = 0.1,
        sauce1Prize = 20.0,
        sauce2Prize = 30.0
    )
    val moskow = Moskow(
        peperoniPrize = 195.0, romanPrize = 281.5,
        sicilianPrize = 197.5, fourcheezPrize = 260.4,
        coffeePrize = 50.0,
        discount = 0.1,
        sauce1Prize = 20.0,
        sauce2Prize = 30.0
    )
    val kazan = Kazan(
        peperoniPrize = 150.0, romanPrize = 250.5,
        sicilianPrize = 144.5, fourcheezPrize = 240.4,
        coffeePrize = 50.0,
        discount = 0.1,
        sauce1Prize = 20.0,
        sauce2Prize = 30.0
    )
    val samara = Samara(
        peperoniPrize = 180.0, romanPrize = 270.5,
        sicilianPrize = 170.5, fourcheezPrize = 250.4,
        coffeePrize = 50.0,
        discount = 0.1,
        sauce1Prize = 20.0,
        sauce2Prize = 30.0
    )

    while (true) {
        println("Добрый день! Выберите город")
        println("1. Москва")
        println("2. Санкт-Петербург")
        println("3. Казань")
        println("4. Самара")
        println("5. Выход")
        val city = readLine()

        when (city) {
            "1" -> moskowMenu(moskow)
            "2" -> spbMenu(spb)
            "3" -> kazanMenu(kazan)
            "4" -> samaraMenu(samara)
            "5" -> exitProcess(0)
            else -> println("ERROR")
        }

        println("Хотите повторить покупку?")
        println("1. Да")
        println("2. Нет")
        val repeat = readLine()
        if (repeat != "1") break
    }
}

fun moskowMenu(moskow: Moskow) {
    pizzaSelection(moskow)
    handleAdditionalPurchases(moskow)
}

fun spbMenu(spb: SPB) {
    pizzaSelection(spb)
    handleAdditionalPurchases(spb)
}

fun kazanMenu(kazan: Kazan) {
    pizzaSelection(kazan)
    handleAdditionalPurchases(kazan)
}

fun samaraMenu(samara: Samara) {
    pizzaSelection(samara)
    handleAdditionalPurchases(samara)
}

fun pizzaSelection(pizzaShop: Pizza) {
    println("Выберите пиццу")
    println("1. Пепперони")
    println("2. Римская")
    println("3. Сицилийская")
    println("4. 4 сыра")
    val pizza = readLine()

    when (pizza) {
        "1" -> pizzaShop.peppperoni()
        "2" -> pizzaShop.roman()
        "3" -> pizzaShop.sicilian()
        "4" -> pizzaShop.fourcheez()
        else -> println("ERROR")
    }
}

fun handleAdditionalPurchases(pizzaShop: Pizza) {
    println("Хотите кофе?")
    println("1. Да")
    println("2. Нет")
    val coffee = readLine()
    if (coffee == "1") {
        pizzaShop.buyCoffee()
    }

    println("Покажите чек?")
    println("1. Да")
    println("2. Нет")
    val check = readLine()
    if (check == "1") {
        pizzaShop.showCheck()
    }

    println("Выберите соус")
    println("1. Соус 1")
    println("2. Соус 2")
    val sauce = readLine()
    when (sauce) {
        "1" -> pizzaShop.buySauce1()
        "2" -> pizzaShop.buySauce2()
        else -> println("ERROR")
    }

    println("Ваш отчет о покупке:")
    pizzaShop.printCheck()
    pizzaShop.showStats()
}