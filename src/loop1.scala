// Prime or Not

object loop1 {
    def main(args: Array[String]): Unit = {
      val a=61
      var count = 0;
      for(i <- 1 to 100){
        if(a%i == 0){
          count=count+1
        }
      }
      if(count==2){
        println(a," is Prime")
      }
      else{
        println(a," is Not Prime")
      }

    }

}
