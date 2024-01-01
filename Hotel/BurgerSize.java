package java_project_2;

import java.util.Scanner;

public enum BurgerSize 
{
	LARGE(3) , MEDIUM(2) , SMALL(1);
    
    final int size;
    
    BurgerSize(int size)
    {
   	 this.size=size;
    }
    
    public static BurgerSize getSizeOfBurger()
    {
   	System.out.println("Enter the size of Burger");
   	int key = 1;
   	try
   	{
   		key = Integer.parseInt(System.console().readLine());
   		if(key==1) {return BurgerSize.SMALL;}
   		else if(key==2) {return BurgerSize.MEDIUM;}
   		else if(key==3) {return BurgerSize.LARGE;}
   	}
   	catch(NullPointerException e)
   	{
   		@SuppressWarnings("resource")
		Scanner scannerObj = new Scanner(System.in);
   		key = scannerObj.nextInt();
   		if(key==1) {return BurgerSize.SMALL;}
   		else if(key==2) {return BurgerSize.MEDIUM;}
   		else if(key==3) {return BurgerSize.LARGE;}
   	}
   	return BurgerSize.SMALL;
    }
}
