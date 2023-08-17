open class Color(
    var name:String,
    var symbol:String,
    var hexcode:String
){
   open fun returnColor(name:String, symbol:String, hexcode: String) {
       println("color created with name is $name symbol is $symbol and hexcode is $hexcode")
   }
    fun changeName(newName:String){
       name = newName
    }
}
class RainBow():Color("", "", ""){
    override open fun returnColor(name: String, symbol: String, hexcode: String) {
        super.returnColor(name, symbol, hexcode)
        println("The RainBow Colors are:")
            println("Red")

    }

}
fun main(){
    val myrainBow = RainBow()
    myrainBow.returnColor("white", "Peace", "#FFFFFF")
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