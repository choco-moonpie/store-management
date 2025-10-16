/*
 * superclass
 */
public class order{
/*
 * instance variables
 */
private int quantity;
private double price;
private String product;

/*
 * non-paramertized constructor
 */
  public order(){
    quantity = 0;
    price = 0.0;
    product = "unkown";
  }
  /*
 * parameterized constructor
 */
  public order(int quantity, double price, String product){
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }
/*
 * getter method for the order quantity
 */
  public int getQuanity(){
   return quantity;
  }
/*
 * getter method for the order price
 */
  public double getPrice(){
    return price;
  }
/*
 * getter method for the product (boba or mochi)
 */
  public String getProduct(){
    return product;
  }
/*
 * Mutator method for the quantity of the order
 */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
 /* Mutator method for the price of the order
 * 
 */ 
  public void setPrice(double newPrice){
  if (newPrice < 0.0) {
    this.price = 0.0;
  }else if (newPrice>= 0 ){
  this.price = newPrice;
}
  }
  /*
 * Mutator method for the product type (boba or mochi)
 */
 public void setProduct(String product){
   this.product = product;
 }
  /*
 * toString method
 */
  public String toString() {
    return "Quantity: " + quantity + "\nPrice: " + price + "\nProduct: " + product;
  }
}
    