@main def main:Unit = {
    val x = Rational(6);
    print(x.neg);
}

case class Rational(number:Int){
    val neg:Int = -number
}