Object Factorial extends App {
  @tailrec
  def factorial(i: Int, res: BigInt): BigInt = {
    if (i <= 0) res
    else factorial(i - 1, res * i)
  }

  println(factorial(5000,1))
}