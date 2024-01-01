package java_project_2;

public class SideItem extends SideItemPrice
{
   SideItemPrice totalSideItemPrice;
   
   public SideItem()
   {
	   totalSideItemPrice= new SideItemPrice();
	   totalSideItemPrice.priceSideDish();
   }
   
   public void printSideItemPrice()
   {
	   System.out.println("Total Price of Drink is : " + totalSideItemPrice.getPriceOfSideItem());
   }
   
   public int totalPriceReturner()
   {
	   return totalSideItemPrice.getPriceOfSideItem();
   }
   
   public String getNameOfItem()
   {
	   return (sideDishType.name());
   }
   
   public static void printSideItemList()
   {
	   for(SideDishType side_item : SideDishType.values())
	   {
		   System.out.println(side_item);
	   }
   }
   
   public static void printSideItemListPrice()
   {
	   for(SideDishType side_item : SideDishType.values())
	   {
		   System.out.println(side_item + " :: " + getEachItemPrice(side_item));
	   }
   }
}

class SideItemPrice
{
	private int sideItemPrice;
	SideDishType sideDishType;
	
	public SideItemPrice()
	{
		sideItemPrice=0;
		sideDishType = SideDishType.getSideDishType();
	}
	
	public void priceSideDish()
	{
		switch(sideDishType)
		{
			case ONION_RINGS:
				sideItemPrice = 50;
				break;
			case CAPRESE_PASTA_SALAD:
				sideItemPrice = 70;
				break;
			case GRILLED_MUSHROOMS:
				sideItemPrice = 60;
				break;
			case POTATO_CHIPS:
				sideItemPrice = 55;
				break;
			case FRENCH_FRIES:
				sideItemPrice = 45;
				break;
			default:
				sideItemPrice = 45;
				break;
		};
	}
	
	protected int getPriceOfSideItem()
    {
    	return sideItemPrice;
    }
	
	protected static int getEachItemPrice(SideDishType sideDishType1)
	{
		return switch(sideDishType1)
		{
			case ONION_RINGS->{yield 50;}
				
			case CAPRESE_PASTA_SALAD->{yield 70;}
				
			case GRILLED_MUSHROOMS->{yield 60;}
				
			case POTATO_CHIPS->{yield 55;}
				
			case FRENCH_FRIES->{yield 45;}
				
			default->{yield 45;}
				
		};
	}
	
	protected boolean Scheme()
	{
        return true;// yet to add features
	}
}
