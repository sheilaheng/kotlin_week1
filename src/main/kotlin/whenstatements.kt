fun main(args: Array<String>) {

    println("Enter number to indicate floor")

    var floor:Int = readLine()!!.toInt()
    when(floor){

        1-> print("Go to first floor")
        2-> print("Go to second floor")
        3-> print("Go to third floor")
        4-> print("Go to fourth floor")
        else -> print("No floor after the fourth")
    }
}