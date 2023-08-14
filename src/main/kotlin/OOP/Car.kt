package OOP

class Car(make:String,model:String,price:Int) {
    init {
        println(" $make $model costs $price")

    }

}


fun main(args: Array<String>) {
    var owner1 = Car("Toyota","Vitz",450000 )
    var owner2 = Car("Mazda","CX5",500000 )
}