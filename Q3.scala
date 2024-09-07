@main def main:Unit = {
    val y = Account("ACC001")
    y.deposit(100)
    y.deposit(505)
    y.withdraw(5)
    val z = Account("ACC002")
    y.transfer(z,500)
    println(y)
    println(z)
    y.transfer(z,500)
}

case class Account(id:String){
    var balance = 0
    def deposit(amount:Int):Unit = 
        balance = balance + amount
    def withdraw(amount:Int):Unit = balance - amount match{
        case x if x > 0 => balance = balance - amount
        case _ => println("No Enough Money")
    }
    def transfer(account:Account, amount:Int):Unit = balance - amount match{
        case x if x > 0 =>
        {
        balance = balance - amount
        account.deposit(amount)
        }
        case _ => println("No Enough Money")
    }
    override def toString:String = f"Account $id Balance is : $balance"
}