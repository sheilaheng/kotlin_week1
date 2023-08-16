fun main(args: Array<String>) {

    println("Enter number")
    val number: Int = readLine()!!.toInt()


    if (number == null) {
        println("Please enter a valid number")
    } else {
        var isEven = ((number % 2) == 0)

        val result = "Value entered is " + (if (isEven) "Even" else "Odd")

        println(result)
    }
}
