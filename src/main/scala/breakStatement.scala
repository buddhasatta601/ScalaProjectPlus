import scala.util.control.Breaks
object breakStatement {
  def main(args : Array[String]):Unit={
    val i =0;
    Breaks.breakable {
          do {
            println("come to me o danny boy");
            Breaks.break;;
          }
        while (i < 10);
    }

  }
}
