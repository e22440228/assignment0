import kotlin.math.sqrt

open class EquilateralTriangle(_name : String) : Triangle(_name){
    private var side = 0
    open fun setDimensions(_side : Int){
        side = _side
        sLength = side*3
    }

    override fun getArea(): Double {
        val area = sqrt(sLength*Math.pow((sLength-side).toDouble(),3.0))
        return area
    }
    override fun printDimensions() {
        println("The area of $name is ${getArea()}")    }
}