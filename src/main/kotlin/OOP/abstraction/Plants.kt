package OOP.abstraction

abstract class Plants (val name:String) {

    abstract fun grow()

    fun describe(){
        print("$name is a plant")
    }

}

class Tree(name: String) : Plants(name){
    override fun grow() {
        println("$name grows in the desert")
    }

}

class Flower(name: String) : Plants(name){
    override fun grow() {
        println("$name grows in water")
    }
}

fun main(args: Array<String>) {
    val plant1: Plants = Tree("Acacia")
    val plant2: Plants = Flower("Water lily")

    plant1.describe()
    plant1.grow()

    plant2.describe()
    plant2.grow()

}

