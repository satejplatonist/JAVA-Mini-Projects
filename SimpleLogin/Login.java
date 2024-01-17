package Login;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Login 
{
	private String UserName;
	private String Password;
	private static Login login = null;
	
	private Login() {}
	
	public static Login getLogin()
	{
		if(login == null)
		{
			login = new Login();
		}
		return login;
	}
	
	public boolean login()
	{
		try
		{
			@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("------------------\n");
			System.out.println("Enter user name :");
			UserName = scanner1.nextLine();
			
			System.out.println("Enter password :");
			Password = scanner1.nextLine();
			System.out.println("\n------------------");
			
			try 
			{
				if(UserCheck() == false) {return false;}
				else {return true;}
			} 
			catch (IOException e) 
			{
				System.out.println(e.getMessage());
			}
		}
		catch(NullPointerException e1)
		{
			System.out.println(e1.getMessage());
			return false;
		}
		return true;
	}
	
	private boolean UserCheck() throws IOException
	{
		String temp = " ";
		String[] array = new String[3];
		try(BufferedReader buff_reader = new BufferedReader(new FileReader("Login.txt")))
		{
			while(buff_reader.ready())
			{
				temp = buff_reader.readLine();
				array = temp.split(" ",5);
				if(array[0].equals(UserNameEncryption()) && array[1].equals(PasswordEncryption()))
				{
					return true;
				}
			}
			return false;
		}
	}
	
	private String PasswordEncryption()
    {
		String temp_pass = ((Password.indexOf('a', 7) )/3)/9 * 9.7593748837474 - 88 + Password.charAt(2) + 
	            Password.concat("#!@567" + Password.substring(4, 5) + Password.substring(1, 3)+		
	            Password.substring(4, 6) + "oo0");
    	return temp_pass;
    }
	    
	private String UserNameEncryption()
    {
    	String tt_ = UserName.substring(7, UserName.length());
    	String temp_user = UserName.charAt(4) + UserName.charAt(7) + UserName.charAt(9) + UserName.charAt(0)
    	+ UserName.charAt(1) + UserName.charAt(6) + UserName.charAt(5) + UserName.charAt(8) + 
    	UserName.charAt(1) + UserName.charAt(2) +UserName.charAt(2) + UserName.charAt(3) + tt_ ;
    	return temp_user;
    }
}
