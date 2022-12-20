import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import java.awt.Point;
  
public class EscapeRoom {
  //attributes
  private Boolean exit;
  public String name;
  Scanner userInput = new Scanner(System.in);

  private Player user;
  private Furniture rug;
  boolean stillPlaying = true;
  String userResponse = "";
  private int north, south, east, west;


  /**
  * Constructor 
  */
  public EscapeRoom(){
    this.name = null;
    this.user = EscapeRoom.addPlayer(new Player (this.name)); //Creating instance of player in EscapeRoom
    this.rug = EscapeRoom.addFurniture(new Furniture("rug", new Point(0,0))); //Creating instance of player in EscapeRoom
    this.north = 3;
    this.south = -3;
    this.east = 3;
    this.west = -3;

  }

  public void startGame() {
    System.out.println("-----------------------------------");
    System.out.println("         Java Escape Room");
    System.out.println("-----------------------------------");
    System.out.println(" ");
    System.out.println("Welcome to our Escape Room! What is you name?");
    this.name = userInput.nextLine(); 
    System.out.println("Hello, " + name);  
    System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the west. And a desk to the east."); 
    gameLoop();
  }
  
  public void gameLoop() {
    do {
      // System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
      String response = userInput.nextLine();  
      if(response.toLowerCase().contains("walk")){
        user.walk(response);
        
        
      }
      if (response.toLowerCase().contains("reset")){
        resetGame(response);
      }

      if(response.toLowerCase().contains("inspect")){
        if(user.getLocation().equals(rug.getLocation())){
          rug.stores(response);
        }
      }



      // if(response.contains ("use")){
      //   //user.walk(response);

      //Stopping condition for game loop 
      if (response.toLowerCase().contains("END GAME") || response.toLowerCase().contains("LOSE")){
        stillPlaying = false;
        endGame(stillPlaying);
      }
    } while (stillPlaying);
  }



  public Point getLocation(){
    return (this.getLocation());
  }
  
  private static Player addPlayer(Player p) {
    System.out.println("Adding player...");
    Player user = p;
    p.getName();
    return user; 
  }

  private static Furniture addFurniture(Furniture f) {
    System.out.println("Adding furniture...");
    Furniture user = f;
    f.getName();
    f.getLocation();
    return user; 
  }
  
  // private static void addItem(Item b) {
  //   System.out.println("Adding item...");  
  //   b.getName();

  // }


  public void endGame(boolean exit) {
    if (exit = true){
      userInput.close();
      System.out.println("You have successfully escaped!"); 
      System.out.println("GAME OVER");
    }
    if (exit = false){
      userInput.close();
      System.out.println("You have failed to escape :("); 
      System.out.println("GAME OVER");
    }
  }
  
  public void resetGame(String userInput) {
    if (userInput.contains("reset")) {
      EscapeRoom room = new EscapeRoom();
      room.startGame();
      user.undo();
    }
  }
  
  /* main method (for testing) */
  public static void main(String[] args) {
    EscapeRoom room = new EscapeRoom();
    Furniture rug = new Furniture("rug", new Point(0,0));
    // Furniture door = new Furniture("door");
    // Furniture pinPad = new Furniture("pin-pad"); //Is this correct naming?
    // Furniture desk = new Furniture("desk");
    // Furniture window = new Furniture("window");
    // Furniture bookcase = new Furniture("bookcase");
    // Furniture computer = new Furniture("computer");
    // Furniture trashcan = new Furniture("trashcan");
    // Furniture lamp = new Furniture("lamp");
    
    room.startGame();

  }
}
    

