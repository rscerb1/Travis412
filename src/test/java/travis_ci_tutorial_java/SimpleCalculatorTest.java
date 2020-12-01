package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.subtract(1, 1), 0);
		assertEquals(calc.divide(10, 2), 5);
		assertEquals(calc.multiply(2, 2), 4);
	}
}
