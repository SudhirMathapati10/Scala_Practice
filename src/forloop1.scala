//Print even numbers from 2 to 10 using a "while" loop.

object forloop1 {
  def main(args: Array[String]): Unit = {
    for(i<- 2 to 10)
      if (i%2 == 0)
      {
        println(i ,"is a Even Number")
      }
  }

}
