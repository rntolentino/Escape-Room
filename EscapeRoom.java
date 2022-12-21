import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

import java.awt.Point;
  
public class EscapeRoom {
  //attributes
  private Boolean exit;
  public String name;
  Scanner user_input = new Scanner(System.in);

  private Player user;
  private static Point userPoint;
  private Point northPoint;
  private Point southPoint;
  private Point eastPoint;
  private Point westPoint;

  private Furniture rug;
  private Furniture door;
  private Furniture desk;
  private Furniture window;
  private Furniture bookcase;
  private Furniture computer;
  private Furniture trashCan;
  private Furniture lamp;

  boolean stillPlaying = true;
  String user_response = "";
  private int north, south, east, west;


  /**
  * Constructor 
  */
  public EscapeRoom(){
    this.name = null;
    this.userPoint = new Point(0, 0);
    this.westPoint = new Point(-3, 0);

    //Creating instance of player in EscapeRoom
    this.user = EscapeRoom.addPlayer(new Player (this.name, this.userPoint)); 

    //Creating instance of all furniture in EscapeRoom
    this.rug = EscapeRoom.addFurniture(new Furniture("rug", new Point(0,0))); 
    this.door= EscapeRoom.addFurniture(new Furniture("door", new Point(0,3)));
    this.desk= EscapeRoom.addFurniture( new Furniture("desk", new Point(-3,0)));
    this.desk= EscapeRoom.addFurniture( new Furniture("window", new Point(3,0)));
    this.desk= EscapeRoom.addFurniture( new Furniture("bookcase", new Point(0,-3)));
    this.desk= EscapeRoom.addFurniture( new Furniture("computer", new Point(-3,0)));
    this.desk= EscapeRoom.addFurniture( new Furniture("trashcan", new Point(-3,0)));
    this.desk= EscapeRoom.addFurniture( new Furniture("lamp", this.westPoint));

    //Dimensions of the room 
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
    this.name = user_input.nextLine(); 
    System.out.println("Hello, " + name);  
    System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the east. And a desk to the west."); 
    gameLoop();
  }
  
  public void gameLoop() {
    do {
      // System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
      System.out.println("The player is at " + this.userPoint);
      String response = user_input.nextLine();  
      if(response.toLowerCase().contains("walk")){
        EscapeRoom.setLocation(user.walk(response));
        // this.userPoint = location;
      }

      if (response.toLowerCase().contains("reset")){
        resetGame(response);
      }

      if(response.toLowerCase().contains("inspect")){
        if (response.toLowerCase().contains("inspect lamp")){
          if (userPoint.equals(westPoint)){
            // System.out.println("The player is at " + this.userPoint);
            // System.out.println("The lamp it at " + this.userPoint);
            System.out.println("There is a paper under the lamp");
          }
          else{
            System.out.println("You are not close enough to the lamp");
          }
        } 
        if (response.toLowerCase().contains("inspect computer")){
          System.out.println("There is a login screen");
        }
        if (response.toLowerCase().contains("inspect trashcan")){
          System.out.println("There is a thumbdrive inside the trashcan");
        }
        if (response.toLowerCase().contains("inspect rug")){
          System.out.println("There seems to be a loose board under it is a box. In the box is a key.");
        }
        if (response.toLowerCase().contains("inspect bookcase")){
          System.out.println("There is a safe on one of the shelves of the bookcase. You need a key to open the safe.");
        }
        if (response.toLowerCase().contains("inspect desk")){
          System.out.println("There is a lamp and a computer on the desk. Next to the desk there is a trashcan.");
        }
        if (response.toLowerCase().contains("inspect pin-pad")){
          System.out.println("Find code");
        
      }
    }

      if(response.toLowerCase().contains("grab")){
        if (response.toLowerCase().contains("grab paper")){
          user.grab("Paper that has a phrase written on it. The phrase says username: helloworld");
        }
        if (response.toLowerCase().contains("grab thumbdrive")){
          user.grab("Thumb drive has a file on it.");
        }
        if (response.toLowerCase().contains("grab key")){
          user.grab("Key for safe.");
        }
        if (response.toLowerCase().contains("grab post-it")){
          user.grab("Post-it that has a phrase written on it. The phrase says password: iguessyoufoundme");
        }
      }

      if(response.toLowerCase().contains("use")){
        if (response.toLowerCase().contains("use paper")){
          user.use("Paper that has a phrase written on it. The phrase says username: helloworld");
        }
        if (response.toLowerCase().contains("use thumbdrive")){
          user.use("Thumb drive has a file on it. On the file is a pin ");
        }
        if (response.toLowerCase().contains("use key")){
          user.use("Key for safe.");
          System.out.println("There is a post-it in the safe.");
        }
        
      //   if (response.toLowerCase().contains("grab post-it")){
      //     user.grab("Post-it that has a phrase written on it. The phrase says password: iguessyoufoundme");
      //   }
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



  public static Point setLocation(Point newPoint){
    return userPoint = newPoint;
  }
  
  private static Player addPlayer(Player p) {
    System.out.println("Adding player...");
    Player user = p;
    p.getName();
    return user; 
  }

  private static Furniture addFurniture(Furniture f) {
    System.out.println("Adding furniture...");
    Furniture rug = f;
    f.getName();
    f.getLocation();
    return f; 
  }

  public void stores (String item){
    if (item.toLowerCase().contains("inspect lamp ")){
      if (userPoint.equals(westPoint)){
        System.out.println("The player is at " + EscapeRoom.userPoint);
        System.out.println("The lamp it at " + this.westPoint);
        System.out.println("There is a paper under the lamp");
      }
      else{
        System.out.println("You are not close enough to the lamp");
      }
    } 
    if (item.toLowerCase().contains("inspect computer ")){
      System.out.println("There is a login screen");
    }
    if (item.toLowerCase().contains("inspect trashcan ")){
      System.out.println("There is a thumbdrive inside the trashcan");
    }
    if (item.toLowerCase().contains("inspect rug ")){
      System.out.println("There seems to be a safe under the rug");
    }
    if (item.toLowerCase().contains("inspect bookcase ")){
      System.out.println("There is a safe on one of the shelves of the bookcase. You need a key to open the safe.");
    }
    if (item.toLowerCase().contains("inspect desk ")){
      System.out.println("There is a lamp and a computer on the desk. Next to the desk there is a trashcan.");
    }
    if (item.toLowerCase().contains("inspect pin-pad ")){
      System.out.println("Find code");
    }
  }
  
  // private static void addItem(Item b) {
  //   System.out.println("Adding item...");  
  //   b.getName();

  // }


  public void endGame(boolean exit) {
    if (exit = true){
      user_input.close();
      System.out.println("You have successfully escaped!"); 
      System.out.println("GAME OVER");
    }
    if (exit = false){
      user_input.close();
      System.out.println("You have failed to escape :("); 
      System.out.println("GAME OVER");
    }
  }
  
  public void resetGame(String user_input) {
    if (user_input.contains("reset")) {
      EscapeRoom room = new EscapeRoom();
      room.startGame();
      user.undo();
    }
  }
  
  /* main method (for testing) */
  public static void main(String[] args) {
    EscapeRoom room = new EscapeRoom();
    // Furniture rug = new Furniture("rug", new Point(0,0));
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
    

