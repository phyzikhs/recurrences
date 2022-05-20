package elements

import elements.Term.{Coefficient, Variable, Power}

final case class Term(coefficient: Coefficient = Coefficient(1), variable: Variable, power: Power = Power(1)) {
  def /(c: Coefficient): Term =
    Term(coefficient / c, variable, power)

  def /(v: Variable): Term = {
    if (v==variable)
      Term(coefficient, variable, power-1)
    else ???
  }
}

object Term {
  final case class Coefficient(value: BigDecimal) {
    def +(o: Coefficient): Coefficient =
      Coefficient(value+o.value)
    def +(t: BigDecimal): Coefficient =
      Coefficient(value+t)

    def /(o: Coefficient): Coefficient =
      Coefficient(value / o.value)
    def /(t: BigDecimal): Coefficient =
      Coefficient(value / t)
  }

  final case class Power(n: Int) {
    def +(p: Power): Power =
      Power(n+p.n)
    def +(v: Int): Power =
      Power(n+v)

    def -(p: Power): Power =
      Power(n-p.n)
    def -(v: Int): Power =
      Power(n-v)
  }

  final case class Variable(name: String) {

  }
}