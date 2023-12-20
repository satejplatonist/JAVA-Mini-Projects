package java_project_2;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.util.Map;
import java.util.HashMap;

public enum BurgerType 
{
   TURKEY_BURGER(150),
   POTROBELLO_MUSHROOM(200),
   ELK_BURGER(100),
   VEGIE_BURGER(125),
   MID_SALMON(140),
   BEAN_BURGER(175),
   CHEESE_BURGER(225),
   BEYOND_MEAT(250);
	
   final int type_value;	
   
   BurgerType(int type)
   {
	   type_value=type;
   }
   
   private HashMap<BurgerType,Integer> baseBurgerMap()
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
   
   protected HashMap<BurgerType,Integer> burgerTypePriceReturner()
   {
	   HashMap<BurgerType,Integer> Burger_type_Price_Imfo = baseBurgerMap();
	   
   }
}
