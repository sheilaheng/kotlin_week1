fun main(args: Array<String>) {
    println("Enter first number")
    var num_1: Int = readLine()!!.toInt()
    println("Enter second number")
    var num_2: Int = readLine()!!.toInt()
    numsum(num_1, num_2)
}


//function to print
fun numsum(num1: Int, num2: Int) {
    val sum = calculateSum(num1, num2)
    println("Sum: $sum")
}


    //function to add
    fun sumNumbers(num1: Int, num2: Int): Int {
        return num1 + num2



    }


