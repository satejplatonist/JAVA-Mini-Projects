package java_project_2;
import java.util.Scanner;
import java.lang.NullPointerException;

public enum DrinkType 
{
   COCA_COLA(1) ,SPRITE(2) , THUMBS_UP(3) , MIRINDA(4) , FROOTI(5);
   
   final int type;
	
   DrinkType(int type)
   {
	   this.type=type;
   }
   
   public static DrinkType getDrinkType()
   {
	   System.out.println("Enter the type of Drink");
	   String key = "coca cola";
	   try
	   {
		   key = System.console().readLine();
		   key.toLowerCase();
		   if(key=="coca cola") {return DrinkType.COCA_COLA;}
   		   else if(key=="sprite") {return DrinkType.SPRITE;}
   		   else if(key=="thunbs up") {return DrinkType.THUMBS_UP;}
   		   else if(key=="mirinda") {return DrinkType.MIRINDA;}
		   else if(key=="frooti") {return DrinkType.FROOTI;}
		   
	   }
	   catch(NullPointerException e)
	   {
		   @SuppressWarnings("resource")
		   Scanner scannerObj = new Scanner(System.in);
		   key = scannerObj.nextLine();
		   key.toLowerCase();
		   if(key=="coca cola") {return DrinkType.COCA_COLA;}
   		   else if(key=="sprite") {return DrinkType.SPRITE;}
   		   else if(key=="thunbs up") {return DrinkType.THUMBS_UP;}
   		   else if(key=="mirinda") {return DrinkType.MIRINDA;}
		   else if(key=="frooti") {return DrinkType.FROOTI;}
	   }
	   return DrinkType.COCA_COLA;
   }
}
