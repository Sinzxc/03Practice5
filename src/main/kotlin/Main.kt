fun main(args: Array<String>) {
    val figures = mutableListOf<Source>(
        Point(0.0, 0.0),
        ColoredPoint(1.0, 1.0, Color.Green),
        Line(Point(0.0, 0.0), Point(1.0, 1.0)),
        ColoredLine(Point(1.0, 1.0), Point(2.0, 2.0), Color.Red),
        Polygon(Point(0.0, 0.0), Point(1.0, 1.0), Point(4.0, -2.0)))
    var testPolygon: Polygon = Polygon(Point(1.0, 2.0), Point(5.0, 6.0), Point(-7.0, 20.0), Point(-3.0, -10.0))

    testPolygon.move(3.0,2.0)
    println(testPolygon.toString())

}