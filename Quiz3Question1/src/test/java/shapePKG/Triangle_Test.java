package shapePKG;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import shapePKG.Triangle;

public class Triangle_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testgetPerimeter() throws TriangleException {
		Triangle triangle1 = new Triangle(3,4,5);
		double perimeter1 = 12;
		assertEquals(perimeter1, triangle1.getPerimeter(), 0);
	}
	
	@Test
	public void testgetPerimeterAgain() throws TriangleException {
		Triangle triangle2 = new Triangle(6,8,10);
		double perimeter2 = 24;
		assertEquals(perimeter2, triangle2.getPerimeter(), 0);
	}
	
	@Test
	public void testgetArea() throws TriangleException {
		Triangle triangle3 = new Triangle(9,12,15);
		double area1 = 54;
		assertEquals(area1, triangle3.getArea(),0);
	}
	
	@Test
	public void testgetAreaAgain() throws TriangleException {
		Triangle triangle4 = new Triangle(12,16,20);
		double area2 = 96;
		assertEquals(area2, triangle4.getArea(),0);
	}

}