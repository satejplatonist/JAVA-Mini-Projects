package java_project_2;

import java.util.Scanner;
import java.lang.NullPointerException;
import java.util.ArrayList;

public enum BurgerToppings 
{
   CHEESE("cheese"),TOMATO_ONIONS("tomato onions"),KETCHUP("ketchup");
	
   final String temp;
   
   private BurgerToppings(String temp) 
   {
	  this.temp=temp;
   }
   
   protected static BurgerToppings getDrinkType()
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
		   @SuppressWarnings("resource")
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
   
   public static BurgerToppings[] getListOfToppings()
   {
	   ArrayList<BurgerToppings> listOfToppings = new ArrayList<>(3);
	   String value = "cheese"; 
	   try
	   {
		   char choice = 'y';
		   while(true)
		   {
			   if(choice=='y' || choice=='Y')
			   {
				   System.out.println("enter topping name : {[ ** only 3 are allowed ]}");
				   value=System.console().readLine();
				   BurgerToppings tempBurgerTopping = BurgerToppings.valueOf(value);
				   listOfToppings.add(tempBurgerTopping);
				   System.out.println("enter your choice : ");
				   choice=System.console().readLine().charAt(0);
			   }
			   else {break;}
		   }
		   
		   var BurgerToppingArray = listOfToppings.toArray(new BurgerToppings[listOfToppings.size()]);
		   return BurgerToppingArray;
	   }
	   catch(NullPointerException e)
	   {
		   @SuppressWarnings("resource")
		   Scanner scanObj = new Scanner(System.in);
		   char choice = 'y';
		   while(true)
		   {
			   if(choice=='y' || choice=='Y')
			   {
				   System.out.println("enter topping name : {[ ** only 3 are allowed ]}");
				   value=scanObj.nextLine();
				   BurgerToppings tempBurgerTopping = BurgerToppings.valueOf(value);
				   listOfToppings.add(tempBurgerTopping);
				   System.out.println("enter your choice : ");
				   choice=scanObj.nextLine().charAt(0);
			   }
			   else {break;}
		   }
		   
		   var BurgerToppingArray = listOfToppings.toArray(new BurgerToppings[listOfToppings.size()]);
		   return BurgerToppingArray;
	   }
   }
}
