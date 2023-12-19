package java_project_2;
import java.util.Scanner;
import java.lang.NullPointerException;

public enum DrinkSize 
{
     LARGE(3) , MEDIUM(2) , SMALL(1);
     
     final int size;
     
     DrinkSize(int size)
     {
    	 this.size=size;
     }
     
     public static DrinkSize getSizeOfDrink()
     {
    	System.out.println("Enter the size of drink");
    	int key = 1;
    	try
    	{
    		key = Integer.parseInt(System.console().readLine());
    		if(key==1) {return DrinkSize.SMALL;}
    		else if(key==2) {return DrinkSize.MEDIUM;}
    		else if(key==3) {return DrinkSize.LARGE;}
    	}
    	catch(NullPointerException e)
    	{
    		@SuppressWarnings("resource")
			Scanner scannerObj = new Scanner(System.in);
    		key = scannerObj.nextInt();
    		if(key==1) {return DrinkSize.SMALL;}
    		else if(key==2) {return DrinkSize.MEDIUM;}
    		else if(key==3) {return DrinkSize.LARGE;}
    	}
    	return DrinkSize.SMALL;
     }
}
