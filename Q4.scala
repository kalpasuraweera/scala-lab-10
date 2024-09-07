@main def main:Unit = {
    val myBank = Bank()
    println("Negative")
    myBank.negativeBalances()
    println("Positive")
    myBank.positiveBalances()
    myBank.updateInterest()
    println("Updated")
    myBank.allBalances()
}

case class Bank(){
    var accounts:List[Account]= List(Account("A1",100),Account("A2",-100),Account("A3",550),Account("A4",-12))
    def negativeBalances():Unit = accounts.foreach(account=> if(account.balance < 0) println(account))
    def positiveBalances():Unit = accounts.foreach(account=> if(account.balance > 0) println(account))
    def allBalances():Unit = accounts.foreach(account=> println(account))
    def updateInterest():Unit = accounts.foreach(account=> if(account.balance < 0){account.updateInterest(1)}else{account.updateInterest(0.05)})

}
case class Account(id:String, b:Double = 0){
    var balance = b
    def updateInterest(i:Double):Unit = balance += balance*(i)/100
    override def toString:String = f"Account $id Balance is : $balance"
}