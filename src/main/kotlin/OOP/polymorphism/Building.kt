package OOP.polymorphism

//superclass
open class Building(val type: String){
   open fun openDoor(){
        println("$type door is opening")
    }
}


//subclass
class House(type: String) : Building(type) {
    override fun openDoor(){
        println("$type house door is opening")
    }
}
class Apartments(type: String) : Building(type){
    override fun openDoor(){
        println("$type apartment door is opening")
    }
}

 class Office(type: String) : Building(type){
     override fun openDoor() {
        println("$type office is closed")
     }
 }
fun main(args: Array<String>) {
    var building1 : Building = House ("The bungalow")
    building1.openDoor()//calls the overriden


    var building2:Building = Apartments("Studio")
    building2.openDoor()

    var building3:Building = Office("The Board room")
    building3.openDoor()

}