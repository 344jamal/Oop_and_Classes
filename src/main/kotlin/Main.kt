//Object is an instance of class
//class Car{
//    var color:String = ""
//    var brand:String = "Benz"
//    var model:String = ""
//    var year:String = ""
//    var bond:String = ""
//    var hosePower:Int = 0
//    var engineSize:Float = 0.0f
//    var clutch:Boolean ?= null
//
//}
//
//fun main(){
//    val rangeRover = Car()
//    rangeRover.color = "Black"
//    rangeRover.model = "Range Rover Sport"
//    rangeRover.clutch = true
//    println(rangeRover.brand)
//
//    val tesla = Car()
//    tesla.clutch = false
//}

//primary constructor
//class Car(var color:String, var model:String = "Uganda"){
//    //var color:String = ""
//    var brand:String = "Benz"
//    //var model:String = ""
//    var year:String = ""
//    var bond:String = ""
//    var hosePower:Int = 0
//    var engineSize:Float = 0.0f
//    var clutch:Boolean ?= null
//
//}
//
//fun main(){
//    val rangeRover = Car("Red")
//    rangeRover.color = "Black"
//    println(rangeRover.model)
//    rangeRover.model = "Range Rover Sport"
//    rangeRover.clutch = true
//    println(rangeRover.model)
//
//    val tesla = Car("Black")
//    tesla.clutch = false
//}
//secondary constructor
//class Car{
//    //var color:String = ""
//    var brand:String = "Benz"
//    //var model:String = ""
//    var year:String = ""
//    var bond:String = ""
//    var hosePower:Int = 0
//    var engineSize:Float = 0.0f
//    var clutch:Boolean ?= null
//
//    constructor(color:String, model:String)
//
//
//
//}
//
//fun main(){
//    val rangeRover = Car("Red", "Benz")
//    println(rangeRover)
//}

//inheritance
//open class Engine{
//    open public var pistons:Int ?= null
//    private var plugs:Int = 6
//    open protected var motors:Int = 10
//
//    open protected fun mainPurpose(){
//        println("Make the element move")
//    }
//}
//
//open class CarEngine: Engine(){
//    val engineColor:String = "Black"
//    override var pistons: Int? = null
//    override var motors: Int = 7
//
//    override fun mainPurpose() {
//        super.mainPurpose()
//    }
//
////    class VitzEngine: CarEngine(){
////        override var pistons: Int? = null
////        override var motors: Int = 10
////
////
////    }
//
//
//}
//fun main(){
//    val A = CarEngine()
//    A.pistons = 20
//}
//inheritance
open class AppCompatActivity{
    open fun onCreate(savedInstanceBundle:String) {
        println("im in the oncreate method")
    }
}

class MainActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceBundle: String) {
        super.onCreate(savedInstanceBundle)
        println("im now in the mainActivity")
    }
}
fun main(){
    val a = MainActivity()
    a.onCreate("this")
}

