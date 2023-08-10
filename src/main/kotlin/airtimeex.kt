fun main(args: Array<String>) {
    println("Enter number")

    var airtime:Int = readLine()!!.toInt()
    when (airtime){
        0 -> print("sh99=1GB 24hr")
        1 -> print("Data Deals")
        2 -> print("Daily Bundles")
        3 -> print("Weekly + FRee YouTube")
        4 -> print("Okoa Data")
        5 -> print("More")
        else -> print("Invalid number entered")
    }


}