abstract class Pizza(
    val pepperoniPrize: Double,val romanPrize: Double,
    val sicilianPrize: Double,val fourcheezPrize: Double,
)

{
    var pepperonicount = 0
    var romancount = 0
    var siciliancount = 0
    var fourcheezcount =0



    abstract fun peppperoni()
    abstract fun roman()
    abstract fun sicilian()
    abstract fun fourcheez()
}