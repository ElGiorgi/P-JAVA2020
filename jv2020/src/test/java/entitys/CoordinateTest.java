package entitys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import entitys.Coordinate;

class CoordinateTest {
	
	private static Coordinate coordinateTest;
	
	@BeforeAll
	private static void initilizeDefault() {
		coordinateTest = new Coordinate();
	}	
	
	@Test
	@DisplayName("😎 Empiezan los tests 😎")
	@Order (1)
	void defaultConstructorTest() {			
		assertTrue("El constructor por defecto no inicializa la coordenada en el centro",
				   coordinateTest.getX() == 0 && coordinateTest.getY() == 0);
	}
	
	//Tests de constructores con datos correctos
	
	@ParameterizedTest(name = "{index} => x={0}, y={1}")
	@Order (2)
	@CsvSource( {"10, 5,", "7, 50,", "99, 100"} )
	public void genericConstructorTest(int x, int y) {
		Coordinate test = new Coordinate(x, y);		
		assertEquals(test.getX(), x);
		assertEquals(test.getY(), y);		
	}	
	
	@Test
	@Order (3)
	void cloneConstructorTest() {
		Coordinate clone = new Coordinate(coordinateTest);
		assertEquals("El constructor copia no clona el objeto debidamente", coordinateTest, clone);	
		
	}	
	
	@Test
	@Order (4)
	void getXTest() {
		int numTest = coordinateTest.getX();		
		assertEquals("El método getX() no devuelve el valor correcto", numTest, 0);		
	}
	
	@Test
	@Order (5)
	void getYTest() {
		assertEquals("El método getY() no devuelve el valor correcto", coordinateTest.getY(), 0);		
	}

}
