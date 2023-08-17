package OOP.abstraction

abstract class SeaCreatures(val name:String) {
    // abstract method/function
    abstract fun  makesound()

    //general method
    fun describe(){
        print("$name is a sea creature")
    }
}

//sub class of a sea creature
class Fish(name: String) : SeaCreatures(name){
    override fun makesound() {
        println("$name makes a blup blup sound")
    }
}

class Whale(name: String) : SeaCreatures(name){
    override fun makesound() {
        println("$name makes a deep underwater noise")
    }
}

fun main(args: Array<String>) {
    var creature1 : SeaCreatures = Fish("Nemo")
    var creature2 : SeaCreatures = Whale("Octavia")

    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()
}