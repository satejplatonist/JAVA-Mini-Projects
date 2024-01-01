package java_project_2;
import java.util.Scanner;

import java.lang.NullPointerException;
import java.util.Map.Entry;
import java.util.HashMap;

public enum BurgerType 
{
   TURKEY_BURGER("TURKEY BURGER"),
   POTROBELLO_MUSHROOM("POTROBELLO MUSHROOM"),
   ELK_BURGER("ELK BURGER"),
   VEGIE_BURGER("VEGIE BURGER"),
   MID_SALMON("MID SALMON"),
   BEAN_BURGER("BEAN BURGER"),
   CHEESE_BURGER("CHEESE BURGER"),
   BEYOND_MEAT("BEYOND MEAT");
   
   
	
   final String type_value;	
   
   BurgerType(String type)
   {
	   type_value=type;
   }
   
   public static HashMap<BurgerType,Integer> baseBurgerMap()
   {
	   HashMap<BurgerType,Integer> Burger_type_Price_Imfo = new HashMap<>();
	   Burger_type_Price_Imfo.put(TURKEY_BURGER,150);
	   Burger_type_Price_Imfo.put(POTROBELLO_MUSHROOM,200);
	   Burger_type_Price_Imfo.put(ELK_BURGER, 100);
	   Burger_type_Price_Imfo.put(VEGIE_BURGER, 125);
	   Burger_type_Price_Imfo.put(MID_SALMON, 140);
	   Burger_type_Price_Imfo.put(BEAN_BURGER, 175);
	   Burger_type_Price_Imfo.put(CHEESE_BURGER, 225);
	   Burger_type_Price_Imfo.put(BEYOND_MEAT, 250);
	   return Burger_type_Price_Imfo;
   }
   
   public static Object[] burgerTypePriceReturner()
   {
	   HashMap<BurgerType,Integer> Burger_type_Price_Imfo = baseBurgerMap();
	   PairTemplate<BurgerType,Integer> pair = new PairTemplate<>();
	   System.out.println("Enter Burger you want");
	   String value = "mid Burger"; 
	   try
	   {
		  value=System.console().readLine();
		  for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
		  {
			  if((BurgerType)entry.getKey()== getType(value))
			   {
				   pair.put(getType(value),entry.getValue());
				   return pair.get();
			   }
		  }
		 
	   }
	   catch(NullPointerException e)
	   {
		   @SuppressWarnings("resource")
		   Scanner scanObj = new Scanner(System.in);
		   value = scanObj.nextLine();
		   for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
		   {
			   if((BurgerType)entry.getKey()== getType(value))
			   {
				   pair.put(getType(value),entry.getValue());
				   return pair.get();
			   }
		   }
	   }
	   
	   Object[] array = {BurgerType.CHEESE_BURGER,225};
	   return array;
   }
   
   private static BurgerType getType(String value)
   {
	   return switch (value.toUpperCase()) 
	   {
	     case "TURKEY BURGER":{yield TURKEY_BURGER;} 
	     case "POTROBELLO MUSHROOM":{yield  POTROBELLO_MUSHROOM;}
	     case "ELK BURGER":{yield ELK_BURGER;}
	     case "VEGIE BURGER":{yield VEGIE_BURGER;}
	     case "MID SALMON":{yield MID_SALMON;}
	     case "BEAN BURGER":{yield BEAN_BURGER;}
	     case "CHEESE BURGER":{yield CHEESE_BURGER;}
	     case "BEYOND MEAT":{yield BEYOND_MEAT;}	     
	     default:
		    throw new IllegalArgumentException("Unexpected value: " + value);
	   };
   }
}
