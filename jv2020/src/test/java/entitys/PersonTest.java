package entitys;


import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entitys.User.RoleUser;
import utils.EasyDate;

public class PersonTest {

	private static User personTest1; 
	private User personTest2; 
	
	
	@BeforeAll
	static void iniciarlizeGlobalData() {
		personTest1 = new User(
						new Nif("00000008P"), 
						"Pepe", 
						"Márquez Alón", 
						new Address("Alta", "10", "30012", "Murcia"), 
						new Mail("pepe@gmail.com"), 
						new EasyDate(1990, 11, 12),
						new EasyDate(2020, 02, 05), 
						new Password("Miau#32"), 
						RoleUser.ADMIN
					);
	}
	
	
	@AfterAll
	public static void clearGlobalData() {
		personTest1 = null;
	}
	
	@BeforeEach
	public void initializeTestData() {	
		this.personTest2 = new User();
	}
	
	@AfterEach
	public void clearTestData() {
		this.personTest2 = null;
	}
	
	// Test's CON DATOS VALIDOS
	
	@Test
	void testSetNif() {	
		// TODO Auto-generated method stub	
	}
	
	@Test
	void testSetName() {	
		this.personTest2.setName("Juan");
		assertEquals(this.personTest2.getName(), "Juan");
	}
	
	@Test
	void testSetSurnames() {	
		// TODO Auto-generated method stub	
	}
	
	@Test
	void testSetAddress() {	
		// TODO Auto-generated method stub	
	}
	
	@Test
	void testSetMail() {	
		// TODO Auto-generated method stub	
	}
	
	@Test
	void testSetBirthDate() {	
		// TODO Auto-generated method stub	
	}
	
	@Test
	void testClone() {
		// TODO Auto-generated method stub
	}
	
	
	@Test
	void testEqualsObject() {	
		// TODO Auto-generated method stub
	}
	
	
	// Test's CON DATOS NO VALIDOS
	
	@Test
	public void testSetNifNull() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetNifNotValid() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetNameNull() {
		try {
			this.personTest2.setName(null);
			fail("No debe llegar aquí...");
		} 
		catch (AssertionError e) { 
		}
	}
	
	@Test
	public void testSetNameNotValid() {
		try {
			this.personTest2.setName("n0 valid4");
			fail("No debe llegar aquí...");
		} 
		catch (ModelsException e) { 
		}
	}
	
	@Test
	public void testSetSurnamesNull() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetSurnamesNotValid() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetAddressNull() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetAddressNotValidl() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetMailNull() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetMailNotValid() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetBirthDateNull() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void testSetBirthDateNotValid() {
		// TODO Auto-generated method stub
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
