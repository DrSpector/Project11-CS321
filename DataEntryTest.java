import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class DataEntryTest {

	Immigrant[] ImmArray = new Immigrant[]{new Immigrant("Jerry","Smith","86ADF"),
			new Immigrant("Waldo","Warenton","32A65"),
			new Immigrant("Patrick","Guzman","55Y4A")	
			};
	
	
	//@BeforeClass
	//public static void main(String[] args)
	{
		Database.setImmigrant(new Immigrant("Jerry","Smith","86ADF"));
		Database.setImmigrant(new Immigrant("Waldo","Warenton","32A65"));
		Database.setImmigrant(new Immigrant("Patrick","Guzman","55Y4A"));
		

	}
	
	
	@Test
	public void getInfo1()
	{
		assertEquals(Database.getImmigrant("Jerry","Smith","86ADF"),ImmArray[0]);
		assertEquals(Database.getImmigrant("Waldo","Warenton","32A65"),ImmArray[1]);
		assertEquals(Database.getImmigrant("Patrick","Guzman","55Y4A"),ImmArray[2]);
		
	}
	
	@Test
	public void getInfo2()
	{
		assertNotEquals(Database.getImmigrant("Jorry","Smith","86ADF"),ImmArray[0]);
		assertNotEquals(Database.getImmigrant("Waldo","Warennton","32A65"),ImmArray[1]);
		assertNotEquals(Database.getImmigrant("Patrick","Guzman","55B4A"),ImmArray[2]);
		
	}

}
