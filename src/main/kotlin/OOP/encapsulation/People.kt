package OOP.encapsulation
//offering protection of data to an outside world
class People(private val name:String, private val age:Int) {

    fun getpersoninfo() : String {

        return "Name :$name , Age $age "

    }
}

fun main(args: Array<String>) {
    val person1 = People("Joe",23)
    println(person1.getpersoninfo())

}