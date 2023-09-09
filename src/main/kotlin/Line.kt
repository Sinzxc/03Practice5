open class Line(): Point() {
    var point1: Point = Point()
    var point2: Point = Point()
    //
    constructor(_point1: Point, _point2: Point): this(){
        point1 = _point1
        point2 = _point2
    }

    override  fun toString():String{
       return "Line ${Pair(point1.x,point1.y)}, ${Pair(point2.x,point2.y)}"
    }
}