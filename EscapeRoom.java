import java.util.Scanner;
  
public class EscapeRoom {
  //attributes
  private Boolean exit;
  public String name;
  Scanner userInput = new Scanner(System.in);

  private Player user;
  boolean stillPlaying = true;
  String userResponse = "";


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
    this.name = userInput.nextLine();  

    do {
      // System.out.println("You are still playing. Follow the instructions if you want to win/lose...");

      System.out.println("Hello, " + name);  
      System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the west. And a desk to the east."); 
      String response = userInput.nextLine();  

      if(response.toLowerCase().contains("walk")){
        user.walk(response);
        
        
      }
      if (response.toLowerCase().contains("reset")){
        resetGame(response);
      }

      // if(response.contains ("inspect")){
      //   //user.walk(response);
      // if(response.contains ("use")){
      //   //user.walk(response);

      //Stopping condition for game loop 
      if (response.toLowerCase().contains("END GAME") || response.toLowerCase().contains("LOSE")){
        stillPlaying = false;
      }
    
    } while (stillPlaying);
    //   // Tidy up
    //   userInput.close();
    // }
  }


  //public userLocation()
  
  private static Player addPlayer(Player p) {
    System.out.println("Adding player...");
    Player user = p;
    p.getName();
    return user; 
  }
  
  // private static void addItem(Item b) {
  //     System.out.println("Adding item...");  
  //     b.getName();

  // }


  public void endGame(boolean exit) {
    if (exit = true){
      userInput.close();
      System.out.println("You have successfully escaped!"); 
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
    room.startGame();

  }
}
    

