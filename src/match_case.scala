object match_case {
  def main(args: Array[String]): Unit = {
    val a = 30
    val b = 100
    val c = b > a match{
      case true => s" $b is bigger "
      case false => s" $a is bigger "
    }
    print(c)
  }

}
