/*
 * sub class
 */
public class boba extends order{

  /*
 * instance variables
 */
private String tea;
private String cupSize;
private boolean hasBoba;

  /*
 * non-parameterized constuctor
 */
public boba (){
  this("milk tea", "small", false);
}

  /*
 * parameterized constructor
 */
  public boba(String tea, String cupSize, boolean hasBoba) {
    super();
      this.tea = tea;
      this.cupSize = cupSize;
    this.hasBoba = hasBoba;
  }

  /*
 * parameterized constructor
 */
public boba(int quantity, double price, String product, String tea, String cupSize, boolean hasBoba){
  super(quantity, price, product);
  this.tea = tea;
  this.cupSize = cupSize;
  this.hasBoba = hasBoba;
  }

  /*
 * getter method for the tea of the boba drink
 */
   public String getTea() {
    return tea;
  }

  /*
 * the mutator method for the tea of the boba drink (updates)
 */
  public void setTea(String tea) {
    this.tea = tea;
  }

  /*
 * the getter method for the boba drink cup size
 */
  public String getCupSize() {
    return cupSize;
  }

  /*
 * mutator method for the boba drink cup size (updates)
 */
  public void setCupSize(String cupSize){
    this.cupSize = cupSize;
  }

  /*
 * getter method for the condition has boba 
 */
  public boolean getHasBoba(){
    return hasBoba;
  }

  /*
 * mutator method for the condition has boba to determine if the drink should contain boba (updates)
 */
  public void setHasBoba(boolean hasBoba){
    this.hasBoba = hasBoba;
  }

  /*
 * toString method
 */
   public String toString() {
    return super.toString() + "\nTea: " + tea + "\nCup Size: " + cupSize + "\nHas Boba:" + hasBoba;
   }
}