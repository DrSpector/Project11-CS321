
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
	
	//ToDo Finish calls
	public void setStatus(String s){
		status = s;
		//Call setImmigrant
		//Call setNext
		
	}
	
	public boolean equals(Object o)
	{
		if (!(o instanceof Immigrant))
			return false;
		Immigrant c = (Immigrant) o;
		return this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName) && this.alienID.equals(c.alienID);
	}
	
	public static void main(String[] args) {
		Immigrant a = new Immigrant("Long", "John", "123asdf");
		
        System.out.println(a);
    }
	
	
}
