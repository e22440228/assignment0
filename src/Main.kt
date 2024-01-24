fun main() {
    println("Hello World!")
    val squ = Square("square")

    squ.setDimensions(5,5)
    squ.printDimensions()

    val cir = Circle("cir")
    cir.setDimensions(9)
    cir.printDimensions()

    val tri = Triangle("tri")
    tri.setDimensions(6,5,4)
    tri.printDimensions()

    val equTri : Shape = EquilateralTriangle("equTri");



}