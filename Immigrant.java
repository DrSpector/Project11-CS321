
public class Immigrant{

	private String firstName;
	private String lastName;
	private String alienID;
	private String status;
	private Immigrant searchedImmigrant;
	
	public Immigrant(String fN, String lN, String AID)
	{
		firstName = fN;
		lastName = lN;
		alienID = AID;
		status = null;
	}
	
	public Immigrant createImmigrant(String firstName, String lastName, String Anum)
	{
		searchedImmigrant = Database.getImmigrant(firstName, lastName, Anum);	
		return searchedImmigrant;
	}
	
	public boolean validateInfo()
	{
		return this.firstName != null && this.lastName != null && this.alienID != null;
		
		
	}
	
	public int compareTo(Immigrant o)
	{
		
		return this.firstName.compareTo(o.firstName);
	}	
	public void setStatus(String s){
		status = s;
		//Call setImmigrant
		//Call setNext
		
	}
	
	
	
	
}
