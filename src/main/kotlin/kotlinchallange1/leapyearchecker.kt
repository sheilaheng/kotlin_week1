package kotlinchallange1

import java.util.*

fun main(args: Array<String>) {
    println("Enter Year")
    var year = readLine()!!.toInt()

    if (year == null) {
        println("Year must be entered")
    } else {
        val leap = if (year % 4 == 0) {


            if (year % 100 == 0) {
                (year % 400 == 0)

            } else true



        } else false;


        println(if (leap) "$year is a leap year." else "$year is not a leap year.")
    }

}