import java.util.Calendar

fun main(args: Array<String>) {
    //write a simple kotlin program enter year born and it displays your age

    println("Enter your year of birth")
    var birthyear:Int = readLine()!!.toInt()

    var currentyear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentyear - birthyear
    println("You are $age years old")





}