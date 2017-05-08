package calc

import org.scalatest._

/**
  * Created by fnovoa10 on 05/08/17.
  */
class CalculatorTest  extends FlatSpec with Matchers {

  val calc = Calculator;

  it should "get a right sum result" in {
    calc.sum(5,5) should be (10);
    calc.sum(1,5) should be (6);
    calc.sum(5,10) should be (15);
    calc.sum(10101,32312) should be (42413);
  }

  it should "get a right subtraction result" in {
    calc.subtract(100,5) should be (95);
    calc.subtract(10,10) should be (0);
    calc.subtract(-10, 100) should be (-110);
    calc.subtract(1,5) should be (-4);
  }


  it should "get a right multiplication result" in {
    calc.mul(100,5) should be (500);
    calc.mul(10,10) should be (100);
    calc.mul(-10, 100) should be (-1000);
    calc.mul(1,5) should be (5);
  }


  it should "get a right division result" in {
    calc.div(100,5) should be (20);
    calc.div(10,10) should be (1);
    calc.div(-10, 100) should be (-0.1);
    calc.div(5,1) should be (5);

  }

  it should "get an error when divide by zero" in {
    a [RuntimeException] should be thrownBy {
      calc.div(100,0);
    }
  }
}




