object threeVar {
  //Declare and initialize 3 three variable and print the biggest number
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 5
    var c = 15

    if(a>=b && b>=c){
      println(a)
    }
    else if(b>=c && c>=a){
      println(b)
    }
    else{
      println(c)
    }
  }

}
