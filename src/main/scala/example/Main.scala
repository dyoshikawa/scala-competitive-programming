package example

import scala.io.StdIn._

object Main extends App {
  def start(inputs: Seq[String]): String = {
    inputs(0)
  }

  println(start(Seq(readLine(), readLine())))
}