package Login;
import java.io.IOException;
import java.lang.NullPointerException;
import java.util.Scanner;

public class LoginDashBoard 
{
    public static void LoginBoard()
    {
    	char choice = 'y';
    	int login_ch = 0;
    	while(choice == 'y' || choice == 'Y')
    	{
    		
    		printBoard();
    		
    		System.out.print(" @# Enter :");
    		try {login_ch = Integer.parseInt(System.console().readLine());}
    		catch(NullPointerException e)
    		{
    			@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
    			login_ch = scanner.nextInt();
    		}
    		
    		switch(login_ch)
    		{
    		case 1:
    			Registration __instance1__ = Registration.getRegistration();
    			for(int i=0;i<3;i++)
    			{
    				try 
    				{
						if(__instance1__.Register() == true)
						{
							System.out.println("## REGISTRATION done sucessfully ......");
							break;
						}
					} 
    				catch (IOException e) 
    				{
						System.out.println(e.getMessage());
					}
    			}
    			break;
    		case 2:
    			Login __instance__ = Login.getLogin();
    			for(int i=0;i<3;i++)
    			{
    				if(__instance__.login() == true) 
    				{
    					System.out.println("## LOGIN done sucessfully ......");
    					break;
    				}
    				else if(i>=2)
    				{
    					Registration __instance_temp__ = Registration.getRegistration();
    					try 
    					{
							if(__instance_temp__.Register() == false){System.out.println("RETRY AGAIN TOO MANY TRIES !!!");return;}
							else {System.out.println("## REGISTRATION done sucessfully ......");}
						} 
    					catch (IOException e) 
    					{
    						System.out.println(e.getMessage());
						}
    					break;
    				}
    			}
    		    break;	
    		    
    		default:
    			Login __instance2__ = Login.getLogin();
    			for(int i=0;i<3;i++)
    			{
    				if(__instance2__.login() == true) 
    				{
    					System.out.println("## LOGIN done sucessfully ......");
    					break;
    				}
    				else if(i>=2)
    				{
    					Registration __instance_temp__ = Registration.getRegistration();
    					try 
    					{
							if(__instance_temp__.Register() == false){System.out.println("RETRY AGAIN TOO MANY TRIES !!!");return;}
							else {System.out.println("## REGISTRATION done sucessfully ......");}
						} 
    					catch (IOException e) 
    					{
    						System.out.println(e.getMessage());
						}
    					break;
    				}
    			}
    		    break;	
    		    
    		};
    		
    		System.out.println("[y/Y] for yes and [n/N] for no ....");
    		try 
    		{ 
    			System.out.println("[y/Y] for yes and [n/N] for no ....");
    			@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
    			choice = scanner.nextLine().charAt(0);
    		}
    		catch(NullPointerException ew)
    		{
    			System.out.println(ew.getMessage());
    			return;
    		}
    	}
    }
    
    private static void printBoard()
    {
    	System.out.println("Enter 1 if you are new Please REGISTER YOURSELF ......");
    	System.out.println("Enter 2 if you have registered Please LOGIN ....");
    }
}
