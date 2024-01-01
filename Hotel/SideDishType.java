package java_project_2;
import java.util.Scanner;
import java.lang.NullPointerException;

public enum SideDishType 
{
   ONION_RINGS(1) , 
   CAPRESE_PASTA_SALAD(2) , 
   GRILLED_MUSHROOMS(3) , 
   POTATO_CHIPS(4) , 
   FRENCH_FRIES(5) ;
	
   final int type;
   
   private SideDishType(int type) 
   {
	  this.type = type;
   }
   
   public static SideDishType getSideDishType()
   {
	   System.out.println("Enter the side dish to order :");
	   String value = "french fries";
	   try
	   {
		   value = System.console().readLine();
		   value.toLowerCase();
		   return switch (value)
		   {
			   case "onion rings"-> {yield SideDishType.ONION_RINGS;}
			   case "caprese pasta salad"->{yield SideDishType.CAPRESE_PASTA_SALAD;}
			   case "grilled mushroom"->{yield SideDishType.GRILLED_MUSHROOMS;}
			   case "potato chips"->{yield SideDishType.POTATO_CHIPS;}
			   case "french fries"->{yield SideDishType.FRENCH_FRIES;}
			   default ->
			   {
				   yield SideDishType.FRENCH_FRIES;
			   }
		   };
	   }
	   catch(NullPointerException e)
	   {
		   @SuppressWarnings("resource")
		   Scanner scannerObj = new Scanner(System.in);
		   value = scannerObj.nextLine();
		   value.toLowerCase();
		   return switch (value)
		   {
			   case "onion rings"-> {yield SideDishType.ONION_RINGS;}
			   case "caprese pasta salad"->{yield SideDishType.CAPRESE_PASTA_SALAD;}
			   case "grilled mushroom"->{yield SideDishType.GRILLED_MUSHROOMS;}
			   case "potato chips"->{yield SideDishType.POTATO_CHIPS;}
			   case "french fries"->{yield SideDishType.FRENCH_FRIES;}
			   default ->
			   {
				   yield SideDishType.FRENCH_FRIES;
			   }
		   };
	   }
   }
   
}
