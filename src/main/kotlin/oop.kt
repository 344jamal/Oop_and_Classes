open class Color(
    var name:String,
    var symbol:String,
    var hexcode:String
){
    init {
        println("Color created with name = $name, symbol = $symbol, and hexcode = $hexcode" )
    }
    fun changeName(newName:String){
       name = newName
    }
}
class RainBow():Color("Red", "Life", "#FF0000"){
    init {
       println("Red")
    }
}
fun main(){
    val mycolor = Color("White", "WHT", "#ffffff")
    val myrainBow = RainBow()
    myrainBow.changeName("Orange")
    println(myrainBow.name)
    myrainBow.changeName("Yellow")
    println(myrainBow.name)
    myrainBow.changeName("Green")
    println(myrainBow.name)
    myrainBow.changeName("Blue")
    println(myrainBow.name)
    myrainBow.changeName("Indigo")
    println(myrainBow.name)
    myrainBow.changeName("Violet")
    println(myrainBow.name)





}