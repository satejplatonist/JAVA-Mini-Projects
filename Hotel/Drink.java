package java_project_2;


public class Drink extends DrinkPrice
{
   DrinkPrice totalPriceDrink;
   public Drink()
   {
	   totalPriceDrink = new DrinkPrice();
	   totalPriceDrink.PriceDrink();
   }
   
   public void printDrinkPrice()
   {
	   System.out.println("Total Price of Drink is : " + totalPriceDrink.getPriceOfDrink());
   }
   
   public int totalPriceReturner()
   {
	   return totalPriceDrink.getPriceOfDrink();
   }
   
   public void listOfDrinks()
   {
	   System.out.println("List of drinks :");
	   for(DrinkType drinks:DrinkType.values())
	   {
		   System.out.println(drinks);
	   }
   }
   
   public void listofDrinksWithPrice()
   {
	   System.out.println("List of drinks with price:");
	   for(DrinkType drinks:DrinkType.values())
	   {
		   System.out.println(drinks);
	   }
   }
   
   public String getNameOfDrink()
   {
	   return drinkType.name();
   }
   
   public String getSizeOfDrink()
   {
	   return getSizeDrink().name();
   }
   
   public int basePrice()
   {
	   return getBasePriceItem();
   }
}

class DrinkPrice
{
	private int drinkPrice;
	DrinkType drinkType;
	DrinkSize drinkSize;
	private int basePriceOfItem=0;
	private int differenceFactor=0;
	    
    public DrinkPrice()
    {
    	drinkPrice=0;
    	drinkType = DrinkType.getDrinkType();
    	drinkSize = DrinkSize.getSizeOfDrink();
    }
	    
    void PriceDrink()
    {
    	switch (drinkType) 
    	{
			case COCA_COLA:
				drinkPrice = 20;
				basePriceOfItem=drinkPrice;
				switch (drinkSize) 
				{
					case SMALL:
						drinkPrice += 0;
						break;
					case MEDIUM:
						drinkPrice += 15;
						break;
					case LARGE:
						drinkPrice += 30;
						break;
	
					default:
						break;
				}
				break;
				
			case SPRITE:
				drinkPrice = 20;
				basePriceOfItem=drinkPrice;
				switch (drinkSize) 
				{
					case SMALL:
						drinkPrice += 0;
						break;
					case MEDIUM:
						drinkPrice += 15;
						break;
					case LARGE:
						drinkPrice += 30;
						break;
	
					default:
						break;
				}
				break;
				
			case THUMBS_UP:
				drinkPrice = 19;
				basePriceOfItem=drinkPrice;
				switch (drinkSize) 
				{
					case SMALL:
						drinkPrice += 0;
						break;
					case MEDIUM:
						drinkPrice += 12;
						break;
					case LARGE:
						drinkPrice += 24;
						break;
	
					default:
						break;
				}
				break;
				
			case MIRINDA:
				drinkPrice = 18; 
				basePriceOfItem=drinkPrice;
				switch (drinkSize) 
				{
					case SMALL:
						drinkPrice += 0;
						break;
					case MEDIUM:
						drinkPrice += 17;
						break;
					case LARGE:
						drinkPrice += 32;
						break;
	
					default:
						break;
				}
				break;
				
			case FROOTI:
				drinkPrice = 15;
				basePriceOfItem=drinkPrice;
				switch (drinkSize) 
				{
					case SMALL:
						drinkPrice += 0;
						break;
					case MEDIUM:
						drinkPrice += 10;
						break;
					case LARGE:
						drinkPrice += 25;
						break;
	
					default:
						break;
				}
				break;
			default:
				break;
		}
    }
    
    protected int getPriceOfDrink()
    {
    	return drinkPrice;
    }
    
    protected int getBasePriceItem()
    {
    	return basePriceOfItem;
    }
    
    protected DrinkSize getSizeDrink()
    {
    	differenceFactor = drinkPrice - basePriceOfItem;
    	if(differenceFactor<10 && differenceFactor>=0)
    	{
    		return DrinkSize.SMALL;
    	}
    	else if(differenceFactor>10 && differenceFactor<20)
    	{
    		return DrinkSize.MEDIUM;
    	}
    	return DrinkSize.LARGE;
    }
}

