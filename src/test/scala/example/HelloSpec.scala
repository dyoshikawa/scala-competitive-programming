package example

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Main.start(Array("4", "3 8 5 1")) shouldEqual 10
  }
}
