import java.util.Scanner;
  
public class EscapeRoom {
  //attributes
  private Boolean exit;
  public String name;
  static Scanner userInput = new Scanner(System.in);
  private Player user;

  public EscapeRoom(){
    this.name = null;
    this.user = EscapeRoom.addPlayer(new Player (this.name)); //Creating instance of player in EscapeRoom

  }

  public void startGame() {
    System.out.println("-----------------------------------");
    System.out.println("         Java Escape Room");
    System.out.println("-----------------------------------");
    System.out.println(" ");
    System.out.println("Welcome to our Escape Room! What is you name?");

    do {
      this.name = userInput.nextLine();  
      System.out.println("Hello, " + name);  
      // EscapeRoom.addPlayer(new Player (name)); //Creating instance of player in EscapeRoom
      System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the west. And a desk to the east."); 
      String response = userInput.nextLine();  

      if(response.toLowerCase().contains("walk")){
        user.walk(response);
        
      }
      // if(response.contains ("inspect")){
      //   //user.walk(response);
      // if(response.contains ("use")){
      //   //user.walk(response);

      if (userInput.equals("WIN") || userInput.equals("LOSE") ){
        exit = false;
      }
    } while (exit);​
      // Tidy up
      userInput.close();
      
      // Once you exit the loop, you may need to deal with various possible stopping conditions
      if (userInput.equals("WIN")) {
        System.out.println("Yay, you won!");
      } 
      else (userInput.equals("LOSE")) {
        System.out.println("Better luck next time.");
      }
  }

  // public userLocation()
  
  private static Player addPlayer(Player p) {
    //System.out.println("Adding player...");
    Player user = p;
    p.getName();
    return user; 
  }


  
// private static void addItem(Item b) {
//     System.out.println("Adding item...");  
//     b.getName();

// }


public void endGame(boolean exit) {
    if(exit = true)  {
    userInput.close();
    System.out.println("You have successfully escaped!"); 
    System.out.println("GAME OVER");
    }
  }
  
  public void resetGame(String userInput) {
    if (userInput == "reset") {
      startGame();
    }
  }

  // public void addPlayer(Player p) {
  //   return p;
  // }

  
  /* main method (for testing) */
  public static void main(String[] args) {
    EscapeRoom room = new EscapeRoom();
    room.startGame();


    //room.addPlayer(new Player(name, "blue"));

    
  }
}
    

