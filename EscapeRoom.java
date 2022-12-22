import java.util.Scanner;
import javax.tools.DocumentationTool.Location;
import java.awt.Point;
/**
 * EscapeRoom is a class that creates the escape room. We create instances of the furniture class and 
 * an instance of the player class, to create a player and teh furniture in the room. This class allows
 * the player to use clues, grab clues and inspect furniture for clues. Contains methods that can reset 
 * the game, start game and conduct the game . A method that starts the game by giving a description and allowing  the player to interact 
 * with the map. A game loop method that allows the game to continure going. A method that ends the game
 * based on whether the user flew out the window.  A method that adds furniture and another one that adds a player
 * @author Renee Owusu Poku
 * @author Vanessa Pliego
 * @author Rachel Tolentino
*/
public class EscapeRoom {
  //attributes
  public String name;
  Scanner user_input = new Scanner(System.in);

  //
  private Player user;
  private static Point userPoint;
  private Point northPoint;
  private Point southPoint;
  private Point eastPoint;
  private Point westPoint;
  private Point centerPoint;

  //
  private Furniture rug;
  private Furniture door;
  private Furniture desk;
  private Furniture window;
  private Furniture bookcase;
  private Furniture computer;
  private Furniture trashCan;
  private Furniture lamp;

  //
  boolean stillPlaying = true;
  Boolean exit = false;
  boolean compStatus = false;
  boolean command;
  String user_response = " ";
  private int north, south, east, west;


  /**
  * Constructor of EscapeRoom
  */
  public EscapeRoom(){
    this.name = null;
    EscapeRoom.userPoint = new Point(0, 0);
    this.centerPoint = new Point(0,0);
    this.northPoint = new Point(0,3);
    this.southPoint = new Point(0, -3);
    this.eastPoint = new Point(3, 0);
    this.westPoint = new Point(-3, 0);

    //Creating instance of player in EscapeRoom
    this.user = EscapeRoom.addPlayer(new Player (this.name, EscapeRoom.userPoint)); 

    //Creating instance of all furniture in EscapeRoom
    this.rug = EscapeRoom.addFurniture(new Furniture("rug", new Point(0,0))); 
    this.door = EscapeRoom.addFurniture(new Furniture("door", new Point(0,3)));
    this.desk = EscapeRoom.addFurniture( new Furniture("desk", new Point(-3,0)));
    this.window = EscapeRoom.addFurniture( new Furniture("window", new Point(3,0)));
    this.bookcase = EscapeRoom.addFurniture( new Furniture("bookcase", new Point(0,-3)));
    this.computer = EscapeRoom.addFurniture( new Furniture("computer", new Point(-3,0)));
    this.trashCan = EscapeRoom.addFurniture( new Furniture("trashcan", new Point(-3,0)));
    this.lamp = EscapeRoom.addFurniture( new Furniture("lamp", this.westPoint));

    //Dimensions of the room 
    this.north = 3;
    this.south = -3;
    this.east = 3;
    this.west = -3;
  }

  
  //Manipulator 
  /**
   * Sets the location,used for Point
   * @return sets the users point as the new point
  */
  public static Point setLocation(Point newPoint){
    return userPoint = newPoint;
  }


  /**
   * Creates/prints out the banner displayed at the beginning of the game. Asks for the players name.
   * Greets the player then gives them a description of the escape room, calls gameloop after.
  */
  public void startGame() {
    System.out.println("-----------------------------------");
    System.out.println("         Java Escape Room");
    System.out.println("-----------------------------------");
    System.out.println(" ");
    System.out.println("Welcome to our Escape Room! What is you name?");
    this.name = user_input.nextLine(); 
    System.out.println("Hello, " + name);  
    System.out.println(" ");  
    System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the east. And a desk to the west."); 
    gameLoop();
  }

  /**
   * The game loop for the escape room game. Allows the player to walk, reset the game,
   * inspect items and furniture. Allows the user to grab and use clues. 
   * Sets the stopping conditions for the game
  */
  public void gameLoop(){
    System.out.println(" ");  

    do {
      // System.out.println("The player is at " + this.userPoint);
      command = false;
      String response = user_input.nextLine();  
      if(response.toLowerCase().contains("walk") || response.toLowerCase().contains("go")){
        EscapeRoom.setLocation(user.walk(response));
        System.out.println(" ");
        command = true;
      }

      if(response.toLowerCase().contains("reset")){
        resetGame(response);
        System.out.println(" ");
        command = true;
      }

      if(response.toLowerCase().contains("end game") || response.toLowerCase().contains("lose")){
        this.exit = false;
        this.stillPlaying = false;
        System.out.println(" ");
        command = true;
      }

      //Inspect
      if(response.toLowerCase().contains("inspect")){
        if (response.toLowerCase().contains("inspect lamp")){
          if (userPoint.equals(westPoint)){
            System.out.println("There is a paper under the lamp");
          }
          else{
            System.out.println("You are not close enough to inspect the lamp");
          }
        } 
        if (response.toLowerCase().contains("inspect computer")){
          if (userPoint.equals(westPoint)){
            System.out.println("The computer is locked and is asking for a login");
          }
          else{
            System.out.println("You are not close enough to inspect the computer.");
          }
        } 
        if (response.toLowerCase().contains("inspect trashcan") || response.toLowerCase().contains("inspect trash can")){
          if (userPoint.equals(westPoint)){
            System.out.println("There is a thumbdrive inside the trashcan.");
          }
          else{
            System.out.println("You are not close enough to inspect the trashcan.");
          }
        } 
        if (response.toLowerCase().contains("inspect rug")){
          if (userPoint.equals(centerPoint)){
            System.out.println("There seems to be a loose board. Under the loose board is a box...");
            System.out.println("In the box is a key.");
          }
          else{
            System.out.println("You are not close enough to inspect the rug.");
          }
          System.out.println(" ");
          command = true;
        }
        if (response.toLowerCase().contains("inspect bookcase") || response.toLowerCase().contains("inspect book case")){
          if(userPoint.equals(southPoint)){
            System.out.println("There is a small chest on one of the shelves of the bookcase.");
          }
          else{
            System.out.println("You are not close enough to inspect the bookcase.");
          }
        }
        if (response.toLowerCase().contains("inspect chest")){
          if(userPoint.equals(southPoint)){
            System.out.println("The chest is locked! It requires a key");
          }
          else{
            System.out.println("You are not close enough to inspect the bookcase.");
          }
        }
        if (response.toLowerCase().contains("inspect desk")){
          if(userPoint.equals(westPoint)){
            System.out.println("There is a lamp and a computer on the desk. Next to the desk there is a trashcan.");
          }
          else{
            System.out.println("You are not close enough to inspect the desk.");
          }
        }
        if (response.toLowerCase().contains("inspect door")){
          if (userPoint.equals(northPoint)){
            System.out.println("The door is locked! How will you get out?");
          }
          else{
            System.out.println("You are not close enough to inspect the door");
          }
        } 
        if (response.toLowerCase().contains("inspect pin-pad") || response.toLowerCase().contains("inspect pinpad") || response.toLowerCase().contains("inspect pin pad")){
          if(userPoint.equals(northPoint)){
            System.out.println("The pin-pad seems to be connected to the door.");
            System.out.println("Insert code:");
          }
          else{
            System.out.println("You are not close enough to inspect the pin-pad.");
          }
        }
        if (response.toLowerCase().contains("inspect window")){
          if(userPoint.equals(eastPoint)){
            System.out.println("You have fallen out of the window!");
            stillPlaying = false;
          }
          else{
            System.out.println("You are not close enough to inspect the window. Get closer :)");
          }
        }
        System.out.println(" ");
        command = true;
      }
      
        //grab
      if(response.toLowerCase().contains("grab")){
        if (response.toLowerCase().contains("grab paper")){
          user.grab("Paper that has" + '\u201C'+ " username: helloworld " +'\u201C' +"written on it");
        }
        if (response.toLowerCase().contains("grab thumbdrive")){
          user.grab("A thumbdrive, I wonder whats on it...");
        }
        if (response.toLowerCase().contains("grab key")){
          user.grab("Key for safe.");
          System.out.println(" ");
        }
        if (response.toLowerCase().contains("grab post-it")){
          user.grab("Post-it that has" + '\u201C'+ " password: iguessyoufoundme " +'\u201C' +"written on it");
        }
        System.out.println(" ");
        command = true;
      }

        //use
      if(response.toLowerCase().contains("use")){
        if (response.toLowerCase().contains("use thumbdrive") || response.toLowerCase().contains("use thumb drive")){
          if (user.checkInventory(response) == true){
            if(userPoint.equals(westPoint)){
              if (compStatus == true){
                user.use("The thumbdrive has a file with a code on it: 1202");
              }
              else{
                System.out.println("You have to unlock the computer first!");
              }
            }
            else{
              System.out.println("You can use that here, silly!");
            }
          }
          else{
            System.out.println("You can use that here, silly!");
          }
        }
        if (response.toLowerCase().contains("use key")){
          if(userPoint.equals(southPoint)){
            user.use("Key for chesk.");
            System.out.println("There is a post-it in the chest.");
          }
          else{
            System.out.println("You can use that here, silly!");
          }
        }
        if (response.toLowerCase().contains("use door")){
          if(userPoint.equals(northPoint)){
            if(exit == false){
              System.out.println("The door is locked!");
              System.out.println(" ");
            }
            else if(exit == true){
              stillPlaying = false;
              endGame(exit);
            }
          }
          else{
            System.out.println("You are not close enough to use the door");
            System.out.println(" ");

          }
        }
        if (response.toLowerCase().contains("use pin-pad") || response.toLowerCase().contains("use pinpad") || response.toLowerCase().contains("use pin pad")){
          if(userPoint.equals(northPoint)){
            System.out.println("Insert code:");

            if(response.toLowerCase().contains("1202")){
              System.out.println("CORRECT!");
              System.out.println("The door made a clicking sound");
              exit = true;
            }
            else{
              System.out.println("INCORRECT");
            }
          }   
          else{
            System.out.println("You are not close enough to use the pin-pad.");
          }
        }
        if (response.toLowerCase().contains("use computer")){
          if(userPoint.equals(westPoint)){
            System.out.println("There is a login screen");
            System.out.println("Input the username:");
            String passcode = user_input.nextLine();  
            if(passcode.toLowerCase().contains("helloworld")){
              System.out.println("Input the password:");
              passcode = user_input.nextLine(); 
              if(passcode.toLowerCase().contains("iguessyoufoundme")){
                System.out.println("The computer unlocked!");
                this.compStatus = true;
              }
              else{
                System.out.println("Wrong password");
              }
            }
            else{
              System.out.println("Wrong username");
            }
          }   
          else{
            System.out.println("You are not close enough to use the computer");
          }
        }
        System.out.println(" ");
        command = true;
      }
      else if (command == false){
        System.out.println("Invalid input! Try checking the cheatsheet for help!");
      }
      //Stopping condition for game loop
    }while (stillPlaying);
      endGame(exit);
  }



  /**
   * Adds player into the room. Contructs a player (calls on the constructor for player).
   * @param Player  new instance of player 
   * @return the user
  */
  private static Player addPlayer(Player p) {
    System.out.println("Adding player...");
    Player user = p;
    p.getName();
    return user; 
  }


  /**
   * Adds furniture to the room. Constructs furniture (calls on the constructor for furniture).
   * @param Furniture new instance of furniture 
   * @return the furniture 
  */
  private static Furniture addFurniture(Furniture f) {
    System.out.println("Adding furniture...");
    Furniture rug = f;
    f.getName();
    return f; 
  }


  /**
   * Ends the game. Tells the player whether they have escaped successfully or if they failed.
   * Closes the scanner.
   * @param boolean Tells whether the player has exited successfully  
  */
  public void endGame(boolean exit) {
    if (exit == true){
      user_input.close();
      System.out.println("You have successfully escaped!"); 
      System.out.println("CONGRATULATIONS!");
    }
    if (exit == false){
      user_input.close();
      System.out.println("You have failed to escape :("); 
      System.out.println("GAME OVER");
    }
  }


 /**
   * Resets the name when the user inputs "reset"
   * @param String the user input/response
  */ 
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

    
    room.startGame();

  }
}

