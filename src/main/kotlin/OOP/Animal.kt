package OOP

open class Animal(color:String, legs:String, breed:String, gender:String) {

    init {
        println("color is $color and it has $legs of $breed breed and its a $gender")
    }

}

class Dog(name:String) :Animal(color = "white", legs = "4legs", breed = "husky", gender = "male"){

}

     fun nameofthedog(){
         //println("color is $color and it has $legs of $breed breed and its a $gender")
     }

fun main(args: Array<String>) {
    var dog1 = Dog("Bosco")
}