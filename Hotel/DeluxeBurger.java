package java_project_2;

public class DeluxeBurger extends Burger
{
   private final int burgerprice = 350;
   BurgerToppings[] burgerToppings_t = new BurgerToppings[2];
   
   public DeluxeBurger() 
   {
	   burgerToppings_t[0] = BurgerToppings.getToppingsType();
	   burgerToppings_t[1] = BurgerToppings.getToppingsType();
   }
   
   public int getPriceDeluxe()
   {
	   return burgerprice;
   }
   public void printDeluxePrice()
   {
	   System.out.println("total price of burger : " + getPriceDeluxe());
   }
   
}
