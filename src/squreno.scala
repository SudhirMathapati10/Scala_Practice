// Print the square of numbers from 1 to 5 using a "for" loop

object sum1 {
  def main(args: Array[String]): Unit = {
    var total = 0
    for(i<- 1 to 5) {
      {
        total= i * i
      }
      println(total)
    }
  }

}
