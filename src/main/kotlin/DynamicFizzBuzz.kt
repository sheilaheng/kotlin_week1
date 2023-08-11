fun main(args: Array<String>) {

    println("Enter First Number")
    var num1: Int = readLine()!!.toInt()

    println("Enter Second Number")
    var num2: Int = readLine()!!.toInt()


    for (x in num1..num2) {

        if (x % 3 == 0 && x % 5 == 0) {
            println("$x is FizzBuzz")
        } else if (x % 3 == 0) {
            println("$x is Fizz")

        } else if (x % 5 == 0) {
            println("$x is Buzz")
        } else {
            println(x)

        }
    }

}