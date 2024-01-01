package java_project_2;

import java.util.Map.Entry;
import java.util.HashMap;

public class Burger extends BurgerPrice
{
	 private BurgerPrice burgerPrice;
     public Burger() {burgerPrice = new BurgerPrice();}
     
     public void printBurgerPrice()
     {
    	 System.out.println("total price of burger : " + burgerPrice.getBurgerPrice());
     }
     
     public int burgerPrice()
     {
    	 return burgerPrice.getBurgerPrice();
     }
     
     public void YourBurgerOrder()
     {
    	 System.out.println("Details of your burger order : ");
    	 getYourBurgerOrder();
     }
     
     public void getYourBurgerOrder()
     {
    	 System.out.println("Burger Type : " + burgerPrice.burgerType_t[0] +"::"+ "Burger Size : "+ burgerPrice.burgerType_t[1] );
    	 System.out.println("Toppings  : ");
    	 for(BurgerToppings burger_T : burgerPrice.burgerToppings_t)
    	 {
    		 System.out.print(burger_T + " ");
    	 }
    	 System.out.println("price of toppings : " + burgerPrice.getToppingPrice());
    	 printBurgerPrice();
     }
     
     public static void printBurgerTypes()
     {
    	 System.out.println("list of burger Types : ");
    	 HashMap<BurgerType,Integer> Burger_type_Price_Imfo = BurgerType.baseBurgerMap();
    	 for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
    	 {
    		 System.out.println(entry.getKey());
    	 }
     }
     
     public static void printBurgerPriceTypes()
     {
    	 System.out.println("list of burger Types and price : ");
    	 HashMap<BurgerType,Integer> Burger_type_Price_Imfo = BurgerType.baseBurgerMap();
    	 for(Entry<BurgerType,Integer> entry : Burger_type_Price_Imfo.entrySet())
    	 {
    		 System.out.println(entry.getValue() +" "+ entry.getKey());
    	 }
     }
}

class BurgerPrice
{
	protected BurgerSize burgerSize_t;
	protected BurgerToppings[] burgerToppings_t = new BurgerToppings[3];
	protected Object[] burgerType_t = new Object[2];
	
	private int burgerPrice_t;

	public BurgerPrice() 
	{
		burgerType_t = BurgerType.burgerTypePriceReturner();
		burgerSize_t = BurgerSize.getSizeOfBurger();
		burgerToppings_t = BurgerToppings.getListOfToppings();
		burgerPrice_t=0;
	}
	
	public void burgerPriceSetter()
	{
		switch((BurgerType)burgerType_t[0])
		{
		   case TURKEY_BURGER:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case POTROBELLO_MUSHROOM:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case ELK_BURGER:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case VEGIE_BURGER:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case MID_SALMON:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case BEAN_BURGER:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case CHEESE_BURGER:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   case BEYOND_MEAT:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		   default:
			   burgerPrice_t = (int)burgerType_t[1] + getSizePrice()+getToppingPrice();
			   break;
		
		}
	}
	
	protected int getSizePrice()
	{
		return switch(burgerSize_t)
	    		   {
	    		      case SMALL-> {yield 0;}
	    		      case MEDIUM-> {yield 25;}
	    		      case LARGE-> {yield 40;}
	    		      default-> {yield 0;}
	    		   };
	}
	
	protected int getToppingPrice()
	{
		if(burgerToppings_t.length == 0)
	 	{
	 		 return 0;  
	 	}
		return 25 * burgerToppings_t.length;
	}
	
	public int getBurgerPrice()
	{
		return burgerPrice_t;
	}
}
