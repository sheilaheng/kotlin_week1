package OOP

class House(owner:String,location:String,price:Int) {

    init {
        println("House owned by  $owner,is located in $location worth $price")
    }

}

fun main(args: Array<String>) {
    var owner1 = House("Tim","Kilimani",5300000)
    var owner2 = House("Barbara","Ngong",2300000)
}