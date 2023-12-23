object probFour {
/*Declare & initialize a number. Check whether the number is in range 0-100
or not. If not in range print invalid input. Else – if the number is in range 90-
100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
60-70 print just smart, 35-60 print no smart, 0-35 print dump */
def main(args: Array[String]): Unit = {
  var a = scala.io.StdIn.readInt()
  if(a>=0 && a<=100){
    if(a>90){
      println("Super Smart")
    }
    else if(a>80 && a<=90){
      println("Smart")
    }
    else if(a>70 && a<=80){
      println("Smart enough")
    }
    else if(a>60 && a<=70){
      println("Just Smart")
    }
    else if(a>35 && a<=60){
      println("No Smart")
    }
    else{
      println("dump")
    }
  }
  else{
    println(a + " is not a valid number")
  }
}
}

