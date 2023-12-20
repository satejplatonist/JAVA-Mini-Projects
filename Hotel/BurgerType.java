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
   
   protected HashMap<BurgerType,Integer> baseBurgerMap()
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
   
   protected Object[] burgerTypePriceReturner()
   {
	   HashMap<BurgerType,Integer> Burger_type_Price_Imfo = baseBurgerMap();
	   PairTemplate<BurgerType,Integer> pair = new PairTemplate<>();
	   System.out.println("Enter Burger you want");
	   String value = "mid Burger"; 
	   try
	   {
		  value=System.console().readLine();
		  BurgerType tempBurgerType = BurgerType.valueOf(value);
		  for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
		  {
			  if(entry.getKey()== tempBurgerType)
			  {
				  pair.put(tempBurgerType,entry.getValue());
				  return pair.get();
			  }
		  }
		 
	   }
	   catch(NullPointerException e)
	   {
		   @SuppressWarnings("resource")
		   Scanner scanObj = new Scanner(System.in);
		   value = scanObj.nextLine();
		   BurgerType tempBurgerType = BurgerType.valueOf(value);
		   for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
		   {
			   if(entry.getKey()== tempBurgerType)
			   {
				   pair.put(tempBurgerType,entry.getValue());
				   return pair.get();
			   }
		   }
	   }
	   
	   Object[] array = {BurgerType.CHEESE_BURGER,225};
	   return array;
   }
}
