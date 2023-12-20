package java_project_2;

import java.util.Scanner;

public enum BurgerToppings 
{
   CHEESE("cheese"),TOMATO_ONIONS("tomato onions"),KETCHUP("ketchup");
	
   final String temp;
   
   private BurgerToppings(String temp) 
   {
	  this.temp=temp;
   }
   
   public static BurgerToppings getDrinkType()
   {
	   System.out.println("Enter the toppings to add :");
	   String value = "cheese";
	   try
	   {
		   value = System.console().readLine();
		   value.toLowerCase();
		   return switch (value)
		   {
			   case "cheese"-> {yield BurgerToppings.CHEESE;}
			   case "tomato onions"->{yield BurgerToppings.TOMATO_ONIONS;}
			   case "ketchup"->{yield BurgerToppings.KETCHUP;}
			   default ->
			   {
				   yield BurgerToppings.CHEESE;
			   }
		   };
	   }
	   catch(NullPointerException e)
	   {
		   Scanner scannerObj = new Scanner(System.in);
		   value = scannerObj.nextLine();
		   value.toLowerCase();
		   return switch (value)
		   {
			   case "cheese"-> {yield BurgerToppings.CHEESE;}
			   case "tomato onions"->{yield BurgerToppings.TOMATO_ONIONS;}
			   case "ketchup"->{yield BurgerToppings.KETCHUP;}
			   default ->
			   {
				   yield BurgerToppings.CHEESE;
			   }
		   };
	   }
   }
}
