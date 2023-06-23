//nested loop needs to be worked upon

import scala.util.control.Breaks

object NestedLoopBreakable {
  def main(args :Array[String]){
    val age =61;
    val outbreak = new Breaks;
    val inbreak =new Breaks;
    outbreak.breakable {
      if (age >20&& age<60){
        println("age is more then 20")
        outbreak.break()
        inbreak.breakable{
        if (age <100) {
          println("he is in line with age bar ");
          inbreak.break()
        }
        }
      }

    }
  }
}
