import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania1() throws Exception {
		double a = 1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("b³êdny wynik dodawania", 2.8, wynik, 0.01);
	}
	
	@Test
	public void testDodawania2() throws Exception {
		double a = 3.2;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("b³êdny wynik dodawania", 4.8, wynik, 0.01);
	}
	
	@Test
	public void testOdejmowania1() throws Exception {
		double a = 3.2;
		double b = 1.6;
		
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("b³êdny wynik odejmowania", 1.6, wynik, 0.01);
	}
	@Test
	public void testOdejmowania2() throws Exception {
		double a = -1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("b³êdny wynik odejmowania", -2.8, wynik, 0.01);
	}
	
	@Test
	public void testMnozenia1() throws Exception {
		double a = 3.2;
		double b = 1.6;
		
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("b³êdny wynik mnozenia", 5.12, wynik, 0.001);
	}
	@Test
	public void testMnozenia2() throws Exception {
		double a = 3.2;
		double b = 0;
		
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("b³êdny wynik mnozenia", 0, wynik, 0.001);
	}
	@Test
	public void testDzielenia() throws Exception {
		double a = 3.2;
		double b = 0.8;
		
		double wynik = classUnderTest.divide(a, b);
		
		Assert.assertEquals("b³êdny wynik dzielenia", 4, wynik, 0.001);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() throws Exception {
		double a = 3.2;
		double b = 0;
		
		classUnderTest.divide(a, b);
	
	}

}
