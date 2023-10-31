import java.util.Scanner;

public class Driver
{
    public static void main( String[] args )
    {
	Scanner keyboard = new Scanner(System.in);
	
	Database database = new Database();
	database.setImmigrant(new Immigrant("Jon","Smith","A1245"));
	database.setImmigrant(new Immigrant("Ron","Smith","A1246"));
	database.setImmigrant(new Immigrant("Bon","Smith","A1247"));
	database.setImmigrant(new Immigrant("Hon","Smith","A1248"));

        int input = 0; //keyboard.nextInt();
	if(input == 0)
		DEScreen.main();
	else if(input == 1)
		RScreen.main(null);
    }
}