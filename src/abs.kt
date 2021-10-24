import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.roundToLong

abstract class Shape(val shapeName:String,val shapeColor:String){

    fun info(){
       println("the $shapeName is $shapeColor")
    }

    abstract fun computeArea():Double
}



class Circle(val radios:Double):Shape ("circle","green"){
    override fun computeArea(): Double {
        return   PI *radios.pow(2)
    }

}
class Traingle(val height:Double,val width:Double):Shape("traingle","Red") {

    override fun computeArea(): Double {
        return (height * width) / 2
    }
}

fun main(){
    val c1=Circle(5.0)
    c1.info()
    println(c1.computeArea())
    val t1=Traingle(20.0,33.0)
    t1.info()
    println(t1.computeArea())
}


