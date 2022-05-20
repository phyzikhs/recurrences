import java.time.LocalTime
import scala.concurrent.duration.Duration

object Main extends App {
  def fibonacci(n: BigInt): String = {
    lazy val sqrt5 = Math.sqrt(5)
    lazy val c1 = BigDecimal((sqrt5-1)/(2*sqrt5))
    lazy val c2 = BigDecimal((1+sqrt5)/(2*sqrt5))
    lazy val root1 = BigDecimal((1-sqrt5)/2)
    lazy val root2 = BigDecimal((1+sqrt5)/2)

    (c1*Math.pow(root1.doubleValue, n.doubleValue) + c2*Math.pow(root2.doubleValue, n.doubleValue)).toString
  }

  val t1 = LocalTime.now().getNano
  for (i <- 0 to 200) {
    print(s"${fibonacci(i)}, ")
  }
  val diff = LocalTime.now().getNano - t1
  println(s"\nEfficient first 200th fibonacci took $diff nano secs")
}