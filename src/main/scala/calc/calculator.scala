package calc

object Calculator {

  def sum (a: Double , b : Double) : Double = a + b
  def subtract (a: Double, b:Double) : Double = a - b
  def mul  (a: Double, b:Double) : Double = a * b

  def div(a: Double, b: Double): Double = {
    if(b == 0) {
      throw new RuntimeException("Cannot divide by zero")
    }
    return a./(b)
  }
}