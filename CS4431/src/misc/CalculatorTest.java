package misc;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions*;

public class CalculatorTest {
	private final Calculator calculator = new Calculator();
	
	@Test
	void test() {
		assertEquals(10, calculator.add(6,  4));
		assertEquals(5, calculator.subtract(10, 5));
		assertEquals(10, calculator.multiply(2, 5));
		assertEquals(2, calculator.divide(10, 5));
	}
}
