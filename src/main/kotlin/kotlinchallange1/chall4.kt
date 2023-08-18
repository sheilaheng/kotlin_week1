package kotlinchallange1

fun main(args: Array<String>) {
    println("Enter number")
    var num = readLine()!!.toInt()

    if (num == null){
        println("Enter number")
    } else {
            var reversed = 0

            while (num != 0) {
                val digit = num % 10
                reversed = reversed * 10 + digit
                num /= 10
            }

            println("Reversed Number: $reversed")
        }


    }
