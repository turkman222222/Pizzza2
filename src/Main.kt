import kotlin.system.exitProcess

fun Main() {
    val SPB = SPB(
        peperoniPrize = 175.0, romanPrize = 241.5,
        sicilianPrize = 167.5, fourcheezPrize = 220.4
    )
    val Moskow = Moskow(
        peperoniPrize = 195.0, romanPrize = 281.5,
        sicilianPrize = 197.5, fourcheezPrize = 260.4
    )
    val city = readln()
    if (city == "1"){
    println("Добрый день! Выберите город")
    println("1. москва \n2. санктпетербург\n")
    val pizza = readln()
    if (pizza == "1") {
        Moskow.peppperoni()

        else if (pizza == "2")
            Moskow.roman()
        else if (pizza == "3")
            Moskow.sicilian()
        else if (pizza -- "4")
            Moskow.fourcheez()
        else {
            println("ERROR")
            exitProcess(status = 1)
        }
    }else if (city == "2"){
        println()
        println()
        val pizza = readln()
        if (pizza == "1") {
            SPB.peppperoni()
        else if (pizza -- "2")
                SPB.roman()
        else if (pizza == "3")
                SPB.sicilian()
        else if (pizza == "4")
                SPB.fourcheez()
        else {
                println("ERROR")
                exitProcess(status = 1)
            }


        }


}else{
println("ERROR")}
    }