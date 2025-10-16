
import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
    // Creates a Scanner object - feel free to delete if not using!
Scanner input = new Scanner(System.in);   
    
boba boba = new boba();
    
mochi mochi = new mochi();
   
    System.out.print("Product: ");
    String product = input.nextLine();
 /*
 * if statement to branch into ordering boba
 */
    if (product.toLowerCase().equals("boba")){
      boba.setProduct("boba");
      
      System.out.print("Tea: ");
      String tea = input.nextLine();
      boba.setTea(tea);
  
      System.out.print("Quantity: ");
      int quantity = input.nextInt();
      boba.setQuantity(quantity);
      
      System.out.print("Price: ");
      double price = input.nextDouble();
      boba.setPrice(price);
  
      System.out.print("Cup Size: ");
      String cupSize = input.next();
      boba.setCupSize(cupSize);
      
      System.out.print("Has Boba? ");
      boolean hasBoba = input.nextBoolean();
      boba.setHasBoba(hasBoba);
      
      System.out.println();
      System.out.println("~~~ Successfully Placed Order ~~~");
      System.out.println();

      System.out.println(boba);

       /*
 * else if statement to branch into ordering mochi
 */
    } else if (product.toLowerCase().equals("mochi")) {

      mochi.setProduct("mochi");
      
      System.out.print("Flavor: ");
      String flavor = input.nextLine();
      mochi.setFlavor(flavor);
      
      System.out.print("Quantity: ");
      int quantity = input.nextInt();
      mochi.setQuantity(quantity);
      
      System.out.print("Price: ");
      double price = input.nextDouble();
      mochi.setPrice(price);
  
      System.out.print("Filling: ");
      String filling = input.next();
      mochi.setFilling(filling);
      
      System.out.print("Has Ice Cream? ");
      boolean hasIceCream = input.nextBoolean();
      mochi.setHasIceCream(hasIceCream);
      
      System.out.println();
      System.out.println("~~~ Successfully Placed Order ~~~");
      System.out.println();
  
      System.out.println(mochi);
 /*
 * else statement to branch into an order not being able to be placed
 */
    } else {
      System.out.println("Sorry order could not be placed");
      
    }


    // Closes the Scanner object
    input.close();
    
  }
}