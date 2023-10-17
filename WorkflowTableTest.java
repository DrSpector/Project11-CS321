import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class WorkflowTableTest {

	WorkflowTable wft;
	Immigrant a,b,c;
	
	public static void main(String[] args)
	{	
		
		
		org.junit.runner.JUnitCore.main("DataEntryTest");
	}
	
	@Before
	public void testInit()
	{
		wft = new WorkflowTable();
		a = new Immigrant("Jeff","Stevens","A54f6");
		b = new Immigrant("Waldo","Warrenton","GF4TR");
		
	}
	
	@Test
	public void Immigrant()
	{
		assertNotNull(wft);
	}
	
	@Test
	public void setNext1()
	{
		assertEquals(1,wft.setNext(a));
	}
	
	@Test
	public void setNext2()
	{
		assertNotEquals(-1,wft.setNext(null));
	}
	
	@Test
	public void getFirst1()
	{
		assertEquals(a,wft.getFirst());
	}
		
	@Test
	public void getFirst2()
	{
		assertNotEquals(b,wft.getFirst());
	}
	
	//Test that a is still in index 0
	@Test
	public void getFirst3()
	{
		assertEquals(a,wft.getFirst());
	}
	
	
	@Test
	public void removeFirst1()
	{
		assertEquals(a, wft.removeFirst());
		assertNotEquals(a,wft.getFirst());
		
		wft.setNext(a);
	}
	
	@Test
	public void removeFirst2()
	{
		assertNotEquals(b,wft.removeFirst());
	}
	
	public void removeFirst3()
	{
		assertNull(wft.removeFirst());
	}
	
	
	
}
