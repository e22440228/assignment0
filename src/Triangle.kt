import kotlin.math.sqrt

open class Triangle(_name : String) : Shape(_name){
    var sLength = 0
    private var firstSide = 0
    private var secondSide = 0
    private var thirdSide = 0
    fun setDimensions (_firstSide : Int,_secondSide : Int, _thirdSide : Int){
        firstSide = _firstSide
        secondSide = _secondSide
        thirdSide = _thirdSide
        sLength = firstSide + secondSide + thirdSide
    }
    override fun getArea() : Double{
        val area = sqrt((sLength*(sLength-firstSide)*(sLength-secondSide)*(sLength-thirdSide)).toDouble())
        return area
    }

    override fun printDimensions() {
        println("The area of $name is ${getArea()}")    }

}