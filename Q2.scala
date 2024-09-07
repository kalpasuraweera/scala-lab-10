@main def main:Unit = {
    val y = Rational(5,8)
    val z = Rational(2,7)
    val x = y-z
    println(x)
}

case class Rational(n:Int,d:Int){
    def -(r:Rational): Rational = Rational((r.n*d - n*r.d),r.d*d)
    override def toString:String = f"$n/$d"
}