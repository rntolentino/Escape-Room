import java.util.ArrayList;

public class Player { 
  // Attributes
  public String name;  // can make private and use accessors and manipulators y
  private int locationX;
  private int locationY;
  private ArrayList <String> inventory = new ArrayList<String>();
  private ArrayList <String> relevantClues = new ArrayList<String>();
  Furniture door = new Furniture("door");
  Furniture desk = new Furniture("desk");
  Furniture window = new Furniture("window");
  Furniture bookcase = new Furniture("bookcase");
  Furniture computer = new Furniture("computer");
  Furniture trashcan = new Furniture("trashcan");
  Furniture lamp = new Furniture("lamp");

  /**
  * Constructor 
  */
  public Player (String name) {
    this.name = name;
    this.locationX = 0 ;
    this.locationY= 0 ;
    
  }

  // Accessors & Manipulators 
  /**
   * Sets the name 
   * @param name2 Name of Player
   */
  public void setName(String name2) {
    this.name = name2;
  }
  
  public String getName(){
    return this.name;
  }
  
  // Methods 
  /**
  * Creates the list of clues that are relevant to the game.
  */
  public void createRelevantClues() {
    relevantClues.add("placeholder");
    relevantClues.add("placeholder");
    relevantClues.add("placeholder");
  }
  
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
      System.out.println("placeholder ");
    }
  }

  /**
   * Allows player to walk based on direction given
   * @param direction Direction that player wants to walk in. 
   * @return A boolean, true signifies Player has moved
   */
  public void walk(String direction){
    if (direction.toLowerCase().contains("walk north") || direction.toLowerCase().contains("north")){
      this.locationY +=1;
      System.out.println(locationY);
      door.location();

      // return(true);
    }
    if (direction.toLowerCase().contains( "walk south")|| direction.toLowerCase().contains("south")){
      this.locationY -=1;
      System.out.println(locationY);
      bookcase.location();
      //return(true);
    } 
    if (direction.toLowerCase().contains("walk west") || direction.toLowerCase().contains("west")){
      this.locationX -=1;
      System.out.println(locationX);
      desk.location();
  
      //return(true);
    }
    if (direction.toLowerCase().contains("walk east") || direction.toLowerCase().contains("east")){
      this.locationX += 1;
      System.out.println(locationX);
      window.location();
      //return(true);
    }
    else {
      System.out.println("Give a valid direction");
      //return (false);
    }
  }

  /**
   * Re-sets the attributes, basically gives default values
   */
  public void undo(){
    this.name= "Steve";
    this.locationX = 0 ;
    this.locationY= 0 ;
  }
    

  // Main
  public static void main(String[]args){
    Player pet  = new Player("Jochy");
    System.out.println(pet);
    pet.grab("star");
    pet.grab("banana");
    pet.drop("banana");
    pet.createRelevantClues();
    pet.use("star");
    pet.walk("north");
    pet.undo();
  }
}
