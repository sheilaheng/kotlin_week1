fun main(args: Array<String>) {

    println("Enter your marks")

    var marks:Int = readLine()!!.toInt()

    if (marks in 1..29){
        print("Scored E")
    }
    else if (marks in 30..39) {
        print("Scored D")
    }

    else if (marks in 40..59) {
        print("Scored B")
    }

    else if (marks in 60..70) {
        print("Scored B+")
    }

    else if (marks in 71..100) {
        print("Scored A")
    }

    else{
        print("Invalid marks entered")
    }



}