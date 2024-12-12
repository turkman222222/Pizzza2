import kotlin.system.exitProcess

import kotlin.system.exitProcess

fun main() {
    val spb = SPB(
        peperoniPrize = 175.0, romanPrize = 241.5,
        sicilianPrize = 167.5, fourcheezPrize = 220.4
    )
    val moskow = Moskow(
        peperoniPrize = 195.0, romanPrize = 281.5,
        sicilianPrize = 197.5, fourcheezPrize = 260.4
    )
    val kazan = Kazan(
        peperoniPrize = 150.0, romanPrize = 250.5,
        sicilianPrize = 144.5, fourcheezPrize = 240.4
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

        if (city == "1") {
            println("Выберите пиццу")
            println("1. Пепперони")
            println("2. Римская")
            println("3. Сицилийская")
            println("4. 4 сыра")
            val pizza = readLine()

            when (pizza) {
                "1" -> moskow.peppperoni()
                "2" -> moskow.roman()
                "3" -> moskow.sicilian()
                "4" -> moskow.fourcheez()
                else -> {
                    println("ERROR")
                    exitProcess(status = 1)
                }
            }
        } else if (city == "2") {
            println("Выберите пиццу")
            println("1. Пепперони")
            println("2. Римская")
            println("3. Сицилийская")
            println("4. 4 сыра")
            val pizza = readLine()

            when (pizza) {
                "1" -> spb.peppperoni()
                "2" -> spb.roman()
                "3" -> spb.sicilian()
                "4" -> spb.fourcheez()
                else -> {
                    println("ERROR")
                    exitProcess(status = 1)
                }
            }
        } else if (city == "3") {
            println("Выберите пиццу")
            println("1. Пепперони")
            println("2. Римская")
            println("3. Сицилийская")
            println("4. 4 сыра")
            val pizza = readLine()

            when (pizza) {
                "1" -> kazan.peppperoni()
                "2" -> kazan.roman()
                "3" -> kazan.sicilian()
                "4" -> kazan.fourcheez()
                else -> {
                    println("ERROR")
                    exitProcess(status = 1)
                }
            }
        } else if (city == "4") {
            println("Выберите пиццу")
            println("1. Пепперони")
            println("2. Римская")
            println("3. Сицилийская")
            println("4. 4 сыра")
            val pizza = readLine()

            when (pizza) {
                "1" -> samara.peppperoni()
                "2" -> samara.roman()
                "3" -> samara.sicilian()
                "4" -> samara.fourcheez()
                else -> {
                    println("ERROR")
                    exitProcess(status = 1)
                }
            }
            println("Хотите кофе?")
            println("1. Да")
            println("2. Нет")
            val coffee = readLine()

            if (coffee == "1") {
                samara.buyCoffee()
            } else if (coffee == "2") {
                println("Нет кофе")
            } else {
                println("ERROR")
                exitProcess(status = 1)
            }
            println("Покажите чек?")
            println("1. Да")
            println("2. Нет")
            val check = readLine()

            if (check == "1") {
                samara.showCheck()
            } else if (check == "2") {
                println("Нет скидки")
            } else {
                println("ERROR")
                exitProcess(status = 1)
            }
            println("Выберите соус")
            println("1. Соус 1")
            println("2. Соус 2")
            val sauce = readLine()

            if (sauce == "1") {
                samara.buySauce1()
            } else if (sauce == "2") {
                samara.buySauce2()
            } else {
                println("ERROR")
                exitProcess(status = 1)
            }
            println("Ваш отчет о покупке:")
            samara.printCheck()
        } else {
            println("ERROR")
            exitProcess(status = 1)
        }
        println("Хотите Повторить покупку?")
        println("1. Да")
        println("4. Нет")
        val statss = readLine()

        if (statss == "1") {
            if (city == "1") {
                moskow.showStats()
            } else if (city == "2") {
                spb.showStats()
            } else if (city == "3") {
                kazan.showStats()
            } else if (city == "4") {
                samara.showStats()
            }
        }
    }
}