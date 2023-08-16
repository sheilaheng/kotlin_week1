fun main(args: Array<String>) {
    println("Enter your name")
    var name:String = readLine()!!.toString()
    if (name.isBlank() || name.isNullOrBlank()){
        println("Please enter a valid name")
    } else{
        print("Welcome back $name")
    }



}

