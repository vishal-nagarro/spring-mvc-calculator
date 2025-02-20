package springmvc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import springmvc.service.CalculatorService;

public class CalculatorTest {
	private CalculatorService calc;
	
	 @Before
	    public void setUp() {
	        calc = new CalculatorService();
	    }
	    
	 @Test
	    public void testAddition() {
	        assertEquals(4, calc.add(2, 2));
	        assertEquals(-1, calc.add(-3, 2));
	        assertEquals(0, calc.add(0, 0));
	        assertEquals(-5, calc.add(-2, -3));
	        assertEquals(100, calc.add(60, 40));
	    }
	    
	    @Test
	    public void testSubtraction() {
	        assertEquals(0, calc.subtract(2, 2));
	        assertEquals(-5, calc.subtract(-3, 2));
	        assertEquals(3, calc.subtract(5, 2));
	        assertEquals(-1, calc.subtract(-3, -2));
	        assertEquals(20, calc.subtract(50, 30));
	    }
	    
	    @Test
	    public void testMultiplication() {
	        assertEquals(6, calc.multiply(2, 3));
	        assertEquals(-6, calc.multiply(-2, 3));
	        assertEquals(6, calc.multiply(-2, -3));
	        assertEquals(0, calc.multiply(0, 5));
	        assertEquals(100, calc.multiply(10, 10));
	    }
	    
	    @Test
	    public void testDivision() {
	        assertEquals(2, calc.divide(6, 3));
	        assertEquals(-2, calc.divide(-6, 3));
	        assertEquals(2, calc.divide(-6, -3));
	        assertEquals(0, calc.divide(1, 2));
	        assertEquals(5, calc.divide(25, 5));
	    }
	    
	    @Test(expected = ArithmeticException.class)
	    public void testDivisionByZero() {
	    	calc.divide(5, 0);
	    }
}
