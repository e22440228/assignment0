import kotlin.math.*
class Circle(_name : String) : Shape(_name) {

    private var radius = 0
    fun setDimensions(_radius : Int){
        radius = _radius
    }
    override fun getArea(): Double {
        val area = Math.pow(radius.toDouble(),2.0).times(Math.PI)
        return area
    }
    override fun printDimensions() {
        println("The area of $name is ${getArea()}")
    }
}