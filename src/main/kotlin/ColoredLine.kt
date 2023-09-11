class ColoredLine(): Line() {
    var line: Line = Line()
    var color: Color? = null
        set(value) {field = value}
        get() {return field}

    constructor(_point1: Point, _point2: Point, _color: Color): this(){
        line = Line(point1, point2)
        color = _color
    }

    override  fun toString():String{
        return "Line ${Pair(point1.x,point1.y)}, ${Pair(point2.x,point2.y)}, color: $color"
    }
}