fun main(args: Array<String>) {

    println("Enter Your Weight")
    var num1:Float = readLine()!!.toFloat()

    println("Enter Your Height")
    var num2:Float = readLine()!!.toFloat()


    var result = num1 / (num2 * num2)
    println(result)

}