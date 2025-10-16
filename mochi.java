/*
 * sub class
 */
public class mochi extends order{

  /*
 * instance variables
 */
private String flavor;
private String filling;
private boolean hasIceCream;

  /*
 * non-paramterized constructor
 */
public mochi (){
  this("green tea", "red bean", false);
}

  /*
 * parameterized constructor
 */
    public mochi(String flavor, String filling, boolean hasIceCream) {
    super();
  this.flavor = flavor;
  this.filling = filling;
  this.hasIceCream = hasIceCream;
  }

  /*
 * parameterized constructor
 */
public mochi(int quantity, double price, String product, String flavor, String filling, boolean hasIceCream){
  super(quantity, price, product);
  this.flavor = flavor;
  this.filling = filling;
  this.hasIceCream = hasIceCream;
  }

  /*
 * getter method for the flavor of the mochi
 */
   public String getFlavor() {
    return flavor;
  }

  /*
 * mutator method for the flavor of the mochi (updates)
 */
  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  /*
 * getter method for the filling of the mochi
 */
  public String getFilling() {
    return filling;
  }

  /*
 * mutator method for the filling of the mochi (updates)
 */
  public void setFilling(String filling){
    this.filling = filling;
  }

  /*
 * getter method for the condition has ice cream
 */
  public boolean getHasIceCream(){
    return hasIceCream;
  }

   /*
 * mutator method for the condition has ice cream (updates)
 */
  public void setHasIceCream(boolean hasIceCream){
    this.hasIceCream = hasIceCream;
  }
 /*
 * toString method
 */
   public String toString() {
    return super.toString() + "\nFlavor: " + flavor + "\nFilling: " + filling + "\nHas Ice Cream:" + hasIceCream;
}
}