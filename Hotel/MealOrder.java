package java_project_2;
import java.util.Scanner;
import java.lang.NullPointerException;
import java.util.ArrayList;
import java.util.List;

public class MealOrder 
{
    protected List<Burger> burgerList;
    protected List<Drink> drinkList;
    protected List<SideItem> sideItemList;
    protected List<DeluxeBurger> deluxeList;
    protected int mealTotalPrice;
    
    public MealOrder() 
    {
    	burgerList = new ArrayList<Burger>();
    	drinkList = new ArrayList<Drink>();
    	sideItemList = new ArrayList<SideItem>();
    	deluxeList = new ArrayList<DeluxeBurger>();
    	mealTotalPrice=0;
	}
    
    public void MENU()
    {
    	char choice ='y';
    	while(true)
    	{
    		if(choice=='y' || choice=='Y')
    		{
    			printChoices();
    			try
    			{
    				System.out.println("Enter your choice : ");
    				int x = Integer.parseInt(System.console().readLine());   
    				executeChoice(x);
    				System.out.println("Enter y or Y to continue");
    				choice = System.console().readLine().charAt(0);
    			}
    			catch(NullPointerException e)
    			{
    				System.out.println("Enter your choice : ");
    				Scanner scanObj = new Scanner(System.in);
    				int x = scanObj.nextInt();
    				executeChoice(x);
    				System.out.println("Enter y or Y to continue");
    				choice = scanObj.nextLine().charAt(0);
    			}
    		}
    		else {System.out.println("THANKS FOR VISITING !!!");break;}
    	}
    }
    
    private void printChoices()
    {
    	System.out.println("Enter 1 to view List of Meals");
    	System.out.println("Enter 2 to order Meal");
    	System.out.println("Enter 3 to order Burger");
    	System.out.println("Enter 4 to order Drink");
    	System.out.println("Enter 5 to order SideItem");
    	System.out.println("Enter 6 to order Deluxe Burger");
    	System.out.println("Enter 7 to get BILL ");
    	System.out.println("Enter 8 to get Burger Prices");
    	System.out.println("Enter 9 to get Drink Prices");
    	System.out.println("Enter 10 to get SideItem Prices");
    	System.out.println("Enter 11 to view List of Meals with price");
    }
    
    private void executeChoice(int choice)
    {
    	switch (choice) 
    	{
    	case 1:
    		Burger.printBurgerTypes();
    		Drink.listOfDrinks();
    		SideItem.printSideItemList();
    		return;
    	case 2:
    		burgerList.add(new Burger());
    		drinkList.add(new Drink());
    		sideItemList.add(new SideItem());
    		return;
    	case 3:
    		burgerList.add(new Burger());
    		return;
    	case 4:
    		drinkList.add(new Drink());
    		return;
    	case 5:
    		sideItemList.add(new SideItem());
    		return;
    	case 6:
    		deluxeList.add(new DeluxeBurger());
            return;
    	case 7:
    		mealTotalPrice=0;
    		for(Burger b : burgerList)
    		{
    			b.printBurgerPrice();
    			mealTotalPrice+=b.burgerPrice();
    		}
    		for(Drink d : drinkList)
    		{
    			d.printDrinkPrice();
    			mealTotalPrice+=d.totalPriceReturner();
    		}
    		for(SideItem s : sideItemList)
    		{
    			s.printSideItemPrice();
    			mealTotalPrice+=s.totalPriceReturner();
    		}
    		for(DeluxeBurger db : deluxeList)
    		{
    			db.printDeluxePrice();
    			mealTotalPrice+=db.getPriceDeluxe();
    		}
    		System.out.println("Total price of  Meal is : " + mealTotalPrice);
    		return;
    	case 8:
    		for(Burger b : burgerList)
    		{
    			b.printBurgerPrice();
    		}
    		return;
    	case 9:
    		for(Drink d : drinkList)
    		{
    			d.printDrinkPrice();
    		}
    		return;
    	case 10:
    		for(SideItem s : sideItemList)
    		{
    			s.printSideItemPrice();
    		}
    	case 11:
    		Burger.printBurgerPriceTypes();
    		Drink.listofDrinksWithPrice();
    		SideItem.printSideItemListPrice();
    		return;
		}
    }

}
