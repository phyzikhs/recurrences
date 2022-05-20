package elements

/** higher order recurrence relation */
case class HORRelation() {

  def firstOrder(alpha1: Double, a0: Double): (n: Int) => BigDecimal = {
    ???
  }

  /**
   * given the second order recurrence relation i.e
   * (how to find the nth term given 2 initial conditions and the nth relationship),
   * creates a formula to find the nth term
   */
  def secondOrder(alpha1: Double, alpha2: Double, a0: Double, a1: Double): (n: Int)=>BigDecimal = {
    ???
  }
}
