package OOP

class House(type:String,owner:String,location:String,price:Int) {

    init {
        println("$type owned by  $owner is located in $location worth $price")
    }

}

fun main(args: Array<String>) {
    var owner1 = House("Mansion","Tim","Kilimani",5300000)
    var owner2 = House("Apartments","Barbara","Ngong",2300000)
}