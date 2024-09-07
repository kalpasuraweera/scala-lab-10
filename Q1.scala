@main def main:Unit = {
    val x = Rational(6,7);
    val y = x.neg;
    println(x)
    println(y)
}

case class Rational(n:Int,d:Int){
    def neg:Rational = Rational(-n,d)
    override def toString:String = f"$n/$d"
}