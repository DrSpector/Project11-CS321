import java.util.ArrayList;

public class Database {

	private static ArrayList<Immigrant> ImmList = new ArrayList<Immigrant>();
	
	

	
	
	public static Immigrant getImmigrant(String firstName, String lastName, String aNum)
	{
		//Find Immigrant using this info in ImmList
		Immigrant searchedImmigrant = new Immigrant(firstName,lastName,aNum);
		if(!ImmList.contains(searchedImmigrant))
			return null;
		
		return ImmList.get(ImmList.indexOf(searchedImmigrant));
	}
	
	//ToDo
	public static boolean setImmigrant(Immigrant i)
	{
		if(!ImmList.contains(i))
			return false;
		ImmList.remove(i);
		ImmList.add(i);
		return true;
	}
}
