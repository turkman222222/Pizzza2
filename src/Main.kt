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
    val Kazan = Kazan(
        peperoniPrize = 205.0, romanPrize = 291.5,
        sicilianPrize = 207.5, fourcheezPrize = 270.4
    )

    println("Добрый день! Выберите город")
    println("1. Москва")
    println("2. Санкт-Петербург")
    println("3. Казань")
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
            "1" -> Kazan.peppperoni()
            "2" -> Kazan.roman()
            "3" -> Kazan.sicilian()
            "4" -> Kazan.fourcheez()
            else -> {
                println("ERROR")
                exitProcess(status = 1)
            }
        }
    } else {
        println("ERROR")
        exitProcess(status = 1)
    }

    println("Хотите показать статистику? (да/нет)")
    val stat = readLine()

    if (stat == "да") {
        println("Статистика по пиццериям:")
        println("Пиццерия в Москве:")
        println("Количество показанных чеков: ${moskow.checkCount}")
        println("Общая сумма скидок: ${moskow.discountSum}")
        println("Количество проданных кофе: ${moskow.coffeeCount}")
        println("Общая сумма выручки за кофе: ${moskow.coffeeSum}")
        println("Выручка по пиццерии: ${moskow.revenue}")

        println("Пиццерия в Санкт-Петербурге:")
        println("Количество показанных чеков: ${spb.checkCount}")
        println("Общая сумма скидок: ${spb.discountSum}")
        println("Количество проданных кофе: ${spb.coffeeCount}")
        println("Общая сумма выручки за кофе: ${spb.coffeeSum}")
        println("Выручка по пиццерии: ${spb.revenue}")

        println("Пиццерия в Казани:")
        println("Количество показанных чеков: ${Kazan.checkCount}")
        println("Общая сумма скидок: ${Kazan.discountSum}")
        println("Количество проданных кофе: ${Kazan.coffeeCount}")
        println("Общая сумма выручки за кофе: ${Kazan.coffeeSum}")
        println("Выручка по пиццерии: ${Kazan.revenue}")
    }
}