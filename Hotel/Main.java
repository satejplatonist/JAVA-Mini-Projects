package java_project_2;

import java.util.Scanner;
import java.lang.NullPointerException;

public class Main
{
	public static void main(String args[])
	{ 
      Drink drink = new Drink();
      drink.printDrinkPrice();
      System.out.println(drink.totalPriceReturner());
      
      SideItem sideItem = new SideItem();
      sideItem.printSideItemPrice();
      System.out.println(sideItem.totalPriceReturner() + sideItem.getNameOfItem());
	}
}

