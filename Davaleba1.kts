import kotlin.math.pow
import kotlin.math.sqrt

class Point(val x: Int, val y: Int){

    override fun toString(): String{
        return "X: $x; Y: $y"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Point){
            val xDifference = other.x - x
            val yDifference = other.y - y
            if(xDifference == 0 && yDifference == 0 ) {
                return true
            }
        }
        return false
    }

    fun distanceFromRoot():Double {
        return sqrt((0 - x.toDouble()).pow(2) + (0-y.toDouble()).pow(2))
    }
}