open class Point(_x:Double, _y: Double): Source() {
    var x: Double? = null
        set(value) {field = value}
        get() {return field}
    var y: Double? = null
        set(value) {field = value}
        get() {return field}

    init {
        x = _x
        y = _y
    }

    constructor(): this(0.0,0.0)
    constructor(_x: Double): this(_x, 0.0)

    override  fun toString():String{
        return "Point ($x,$y)"
    }
}