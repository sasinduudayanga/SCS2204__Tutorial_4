object q1 {
  def interest(deposit_amount :Double):Double = deposit_amount match {
    case x if x<= 20000 => x* 0.02;
    case x if x<= 200000 => x * 0.04;
    case x if x<= 2000000 => x* 0.035;
    case x => x * 0.065;

  }

  def main(args: Array[String]): Unit = {
    println("Enter your deposit amount: ");
    var num= scala.io.StdIn.readDouble();
    println(interest(num));
  }

}
