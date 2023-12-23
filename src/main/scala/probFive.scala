object probFive {
/*Write a java program that performs the following tasks.
a. Store a number in a variable
b. If value is not in range (100-1000) prints wrong number else follows
the steps
c. Check even or odd
d. If even divide the number by 3 and print the remainder
e. If odd divide the number by 2 and print the remainder */
def main(args: Array[String]): Unit = {
  var a = scala.io.StdIn.readInt()
  println("The value of a is " + a)
  if(a>=100 && a<=1000){
    if(a%2==0){
      println(a%3)
    }
    else{
      println(a%2)
    }
  }
  else{
    println(a + " is a False number, Please choose correct number")
  }
}
}
