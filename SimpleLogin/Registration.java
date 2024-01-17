package Login;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class Registration 
{
    private String User_Name;
    private String Password;
    Boolean ADMIN = false;
    
    private static Registration register_t = null;
    
    private Registration() {}
    
    public static Registration getRegistration()
    {
    	if(register_t == null)
    	{
    		register_t = new Registration();
    	}
    	return register_t;
    }
    
    public boolean Register() throws IOException 
    {
    	try
    	{
    		
    		@SuppressWarnings("resource")
			Scanner scanner1 = new Scanner(System.in);
    		System.out.println("------------------\n");
    		System.out.println("Enter user name :");
    		User_Name = scanner1.nextLine();
    		if(userNameFormatCheck(User_Name)== false) {return false;}
    		
    		System.out.println("Enter password :");
    		Password = scanner1.nextLine();
    		if(passwordFormatCheck(Password) == false) {Password = null; return false;}
    		if(recheckPassword() == false) {return false;}
    		
    		System.out.println("Enter Your ADMIN credentials : ");
    		char admin_u = scanner1.nextLine().charAt(0);
    		if(admin_u == 'y' || admin_u == 'Y') {ADMIN = true;}
    		
    		if(AccountExistence()== false) {return false;}
    		
    		registertoLOGINFile();
    		System.out.println("\n------------------\n");
    		return true;
    		
    	}
    	catch(NullPointerException e1)
    	{
    		System.out.println(e1.getMessage());
    		return false;
    	}
    }
    
    private boolean userNameFormatCheck(String userName)
    {
    	if(userName.contains("@gmail.com"))
    	{
    	    return true; 
    	}
    	else { return false; }
    }
    
    private boolean passwordFormatCheck(String password)
    {
    	if(password.length()>8)
    	{
    	   if(password.contains("!") || password.contains("@") || password.contains("#") || 
    		  password.contains("$") || password.contains("%") || password.contains("^") ||
    		  password.contains("&") || password.contains("*") || password.contains("?") ||
    		  password.contains("/") || password.contains(".") || password.contains(","))
    	   {
    		   if(password.contains("0") || password.contains("1") || password.contains("2") || 
    		      password.contains("3") || password.contains("4") || password.contains("5") ||
    		      password.contains("6") || password.contains("7") || password.contains("8") ||
    		      password.contains("9"))
    		   {
    			   return true;
    		   }
    		   else {System.out.println(" ## Password should contain atleast one numerical"); return false;}
    	   }
    	   else {System.out.println(" ## Password should contain atleast one special character"); return false;}
    	}
    	System.out.println(" ## Password length should be more than 8 characters ");return false;
    }
    
    private boolean recheckPassword()
    {
    	try
    	{
    		@SuppressWarnings("resource")
			Scanner scanner1_ = new Scanner(System.in);
    		System.out.println(" AAA Re - Enter password :");
    		String PasswordTemp;
    		PasswordTemp = scanner1_.nextLine();
    		System.out.println(PasswordTemp + " " + Password);
    		System.out.println("sdfghjk");
    		if(PasswordTemp.equals(Password)) {System.out.println("true");return true;}
    		return false;
    	}
    	catch(NullPointerException e1)
    	{
    		System.out.println(e1.getMessage());
    		return false;
    	}
    }
    
    private boolean AccountExistence() throws IOException
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
					System.out.println("{ !!! } Account Already Registered");
					return false;
				}
			}
			return true;
		}
    }
    
    private void registertoLOGINFile()
    {
    	try 
    	{
			FileWriter file_writer_ = new FileWriter("Login.txt",true);
			file_writer_.write(UserNameEncryption() + " " + PasswordEncryption() + " " + ADMIN + 
					           System.lineSeparator());
			file_writer_.close();
		} 
    	catch (IOException e) 
    	{
			System.out.println(e.getMessage());
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
    	String tt_ = User_Name.substring(7, User_Name.length());
    	String temp_user = User_Name.charAt(4) + User_Name.charAt(7) + User_Name.charAt(9) + User_Name.charAt(0)
    	+ User_Name.charAt(1) + User_Name.charAt(6) + User_Name.charAt(5) + User_Name.charAt(8) + 
    	User_Name.charAt(1) + User_Name.charAt(2) +User_Name.charAt(2) + User_Name.charAt(3) + tt_ ;
    	return temp_user;
    }
}
