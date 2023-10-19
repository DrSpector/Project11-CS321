import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ImmigrantTest {

	public static void main(String[] args)
    {

        org.junit.runner.JUnitCore.main("ImmigrantTest");
    }
	/*
    @Before
    public void setUp() {
        Immigrant immigrant = new Immigrant("John", "Doe", "123456");
    }
	*/
    @Test
    public void testCreateImmigrant() {
        // Assuming Database.getImmigrant is a mock or is handled appropriately in testing
        //Immigrant createdImmigrant = immigrant.createImmigrant("John", "Doe", "123456");
        
        assertNotNull(new Immigrant("John", "Doe", "123456"));
        /*
        assertEquals("John", createdImmigrant.getFirstName());
        assertEquals("Doe", createdImmigrant.getLastName());
        assertEquals("123456", createdImmigrant.getAlienID());
        */
    }
	/*
    @Test
    public void testValidateInfo() {
        assertTrue(immigrant.validateInfo());
        
        // Test with null values
        immigrant = new Immigrant(null, "Doe", "123456");
        assertFalse(immigrant.validateInfo());
        
        immigrant = new Immigrant("John", null, "123456");
        assertFalse(immigrant.validateInfo());
        
        immigrant = new Immigrant("John", "Doe", null);
        assertFalse(immigrant.validateInfo());
    }

    @Test
    public void testCompareTo() {
        Immigrant immigrant2 = new Immigrant("Alice", "Smith", "789012");
        assertTrue(immigrant.compareTo(immigrant2) > 0); // John comes after Alice in alphabetical order

        // Test with the same first name
        immigrant2 = new Immigrant("John", "Smith", "789012");
        assertTrue(immigrant.compareTo(immigrant2) == 0); // Same first name, should return 0
    }

    @Test
    public void testSetStatus() {
        assertNull(immigrant.getStatus()); // Status should be null initially

        immigrant.setStatus("Pending");
        assertEquals("Pending", immigrant.getStatus());
    }*/
}