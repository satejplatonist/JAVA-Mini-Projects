package Login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AccountDeletion 
{
    private static AccountDeletion instance = null;
    
    private AccountDeletion() {}
    
    static
	{
		try
    	{
    		if(instance == null) {instance = new AccountDeletion();}
    	}
    	catch(RuntimeException e)
    	{
    		throw new RuntimeException("$$ Exception occured in deletion process of account");
    	}
	}
    
    public static AccountDeletion getACDeletionInstance() {return instance;}
    
    public void delete()
    {
    	Login login = Login.getLogin();
		for(int i=0;i<1;i++)
		{
			if(login.login() == true) 
			{
				System.out.println("## LOGIN done sucessfully ......");
				System.out.println("## DELETING the account --------..");
				delete(login.getEncryptedUserName(),login.getEncryptedPassword());
				break;
			}
		}
			
    }
    
    private void delete(String encryptedUsername,String encryptedPassWord)
    {
    	ArrayList<String> fileData = new ArrayList<String>();
    	String[] array = new String[2];
    	try (BufferedReader reader = new BufferedReader(new FileReader("Login.txt")))
    	{
    		while(reader.ready())
    		{
    			array = reader.readLine().split(" ",5);
    			fileData.add(reader.readLine());
    			if(array[0].equals(encryptedUsername) && array[1].equals(encryptedPassWord))
    			{
    				fileData.remove(fileData.size()-1);
    			}	
    		}
    	}
    	catch(IOException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
    	try(BufferedWriter fileWrite = new BufferedWriter(new FileWriter("Login.txt")))
    	{
    		for(String x:fileData)
    		{
    			fileWrite.write(x);
    			fileWrite.newLine();
    		}
    	}
    	catch(IOException e)
    	{
    		System.out.println(e.getMessage());
    	}
    	
    }
    
    
}
