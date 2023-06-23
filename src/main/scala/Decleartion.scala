import com.sun.tools.javac.tree.TreeInfo.args

class Decleartion {

  var name ="buddha";
  var age =20;
  def show(): Unit = {
    println("The name of the person in "+name);
    println("The age of the person is"+age);
  }
}


object Main{
  def main(args :Array[String]): Unit = {
    var Decleartion2
    = new Decleartion();
    Decleartion2.show();
  }

}