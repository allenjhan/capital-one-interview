object Sieve extends App{

  def allPrime(n: Int): IndexedSeq[Int] = {
    if (n < 2) IndexedSeq()
    else {
      (2 to n).filter(isPrime)
    }
  }

  def isPrime(k: Int): Boolean = {
    (2 to Math.sqrt(k).toInt).forall(x => k%x != 0)
  }

  println(allPrime(19))


}
