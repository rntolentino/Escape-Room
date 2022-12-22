import java.util.ArrayList;
import java.awt.Point;
/**
 * Player class that constructs a player and gives it features that has drop items, grab items, use items and walk. 
 * This class contains methods drop, grab, undo, use and walk. The method grab adds things to the players
 * invetory, while drop does the opposite. The use method allows the player to use items. The walk method allows 
 * the player to walk and creates instances of furnture using the furniture class. 
 * @author Renee Owusu Poku
 * @author Vanessa Pliego
 * @author Rachel Tolentino
*/
public class Player { 
  // Attributes
  public String name;  // can make private and use accessors and manipulators y
  private Point location;
  private ArrayList <String> inventory = new ArrayList<String>();
 
  /**
  * Constructor 
  */

  public Player (String name, Point point){
    this.name = name;
    this.location = new Point(0, 0);
    
  }

  // Accessors & Manipulators 
  /**
   * Sets the name 
   * @param name2 Name of Player
   */
  public void setName(String name2) {
    this.name = name2;
  }

  /**
   * Gets the name 
   * @return  the name of the player
  */
  public String getName(){
    return this.name;
  }

  /**
   * Gets the location of player
   * @return players location
  */
  public Point getLocation(){
    return this.location;
  }
  
  // Methods 
  /**
   * Grabs an item and adds it to inventory
   * @param item The item grabbed 
   */
  public void grab(String item){
    System.out.println("You have grabbed " + item +" it is being added to your inventory");
    this.inventory.add(item);
    System.out.println("Your inventory"+this.inventory);
  }

  /**
   * Removes item from inventory 
   * @param item The item
   * @return The item dropped
   */
  public String drop(String item){
    this.inventory.remove(item);
    System.out.println("You have dropped " + item );
    return (item);
     
  }

  /**
   * Allows user to use things in their inventory
   * @param item The item in question
   */
  public void use(String item){
    if (inventory.contains(item) == true){
      System.out.println("USED");

    }
  }

 /**
   * Allows player to walk based on direction given. Creates instances of furniture based on the location
   * Calls upon the Furniture class location method to provide a description of the location they have
   * walked to.
   * @param direction Direction that player wants to walk in. 
   * @return Point The Location of the Player 
  */
  public Point walk(String direction){
    if (direction.toLowerCase().contains("walk north") || direction.toLowerCase().contains("north")){
      System.out.println("walking north");
      System.out.println(" ");
      this.location.x = 0;
      this.location.y = 3;
      Furniture door = new Furniture("door", new Point(0,3));
      door.location();
    }
    if (direction.toLowerCase().contains( "walk south")|| direction.toLowerCase().contains("south")){
      System.out.println("walking south");
      System.out.println(" ");
      this.location.x = 0;
      this.location.y = -3;
      Furniture bookcase = new Furniture("bookcase", new Point(0,-3));
      bookcase.location();
    } 
    if (direction.toLowerCase().contains("walk west") || direction.toLowerCase().contains("west")){
      System.out.println("walking west");
      System.out.println(" ");
      this.location.x = -3;
      this.location.y = 0;
      Furniture desk = new Furniture("desk", new Point(-3,0));
      desk.location();
    }
    if (direction.toLowerCase().contains("walk east") || direction.toLowerCase().contains("east")){
      System.out.println("walking east");
      System.out.println(" ");
      this.location.x = 3;
      this.location.y = 0;
      Furniture window = new Furniture("window", new Point(3,0));
      window.location();

    }
    return this.location;
  }
  


  /**
   * Re-sets the attributes, basically gives default values
   */
  public void undo(){
    this.name = ("Steve");

  }
    

  // Main
  public static void main(String[]args){
    Player pet  = new Player("Jochy", new Point(0, 0));
    System.out.println(pet);
    pet.grab("star");
    pet.grab("banana");
    pet.drop("banana");
    pet.use("star");
    pet.walk("north");
    pet.undo();
  }
}
