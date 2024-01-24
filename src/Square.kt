class Square(_name : String) : Shape(_name){
    private var length  = 0
    private var height  = 0
    fun setDimensions(_length : Int, _height : Int){
        length = _length
        height = _height
    }
    override fun getArea(): Double {
        val area = ( length * height ).toDouble()
        return area
    }
    override fun printDimensions(){
        println("The area of $name is ${getArea()}")
    }


}