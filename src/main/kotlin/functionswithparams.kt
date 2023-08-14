fun main(args: Array<String>) {

 addnums(400, 600)
}


//function to print
fun addnums(num1: Int, num2: Int) {
    val sum = calculateSum(num1, num2)
    println("Sum: $sum")
}

//function to add
fun calculateSum(num1: Int, num2: Int): Int {
    return num1 + num2
}
