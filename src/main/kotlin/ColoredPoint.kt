class ColoredPoint(): Point() {
    var color: Color? = null
    var point: Point = Point()

    constructor(_x: Double, _y: Double, _color: Color): this() {
        point = Point(_x, _y)
        color = _color
    }
    constructor(_x: Double, _color: Color): this(_x, 0.0, _color)
    override  fun toString():String{
        return "Point ($x,$y), color: $color"
    }
}