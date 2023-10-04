
public class Immigrant {

	String firstName;
	String lastName;
	String alienID;
	
	Immigrant createdImmigrant;
	
	public Immigrant(String fN, String lN, String AID)
	{
		firstName = fN;
		lastName = lN;
		alienID = AID;
	}
	
	public String createImmigrant(String[] info)
	{
		createdImmigrant = new Immigrant(info[0],info[1],info[2]);
		return info[2];
	}
	
	public boolean validateInfo()
	{
		return this.firstName != null && this.lastName != null && this.alienID != null;
		
		
	}
	
	public void setStatus(String s){
		return this.status = s;
	}
	
	
	
	
}
