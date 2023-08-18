fun main(args: Array<String>) {

    println("Enter word or sentence")
    val word:String = readLine()!!.toString()

    if (word.isBlank()){
        println("Field must be entered")
    } else {
        var result = word.uppercase()
        println("the result is $result")
    }

}