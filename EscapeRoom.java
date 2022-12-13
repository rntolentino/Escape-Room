import java.util.Scanner;
  
public class EscapeRoom {
  //attributes
  private Boolean exit;
  static Scanner userInput = new Scanner(System.in);


  public void startGame() {
    System.out.println("-----------------------------------");
    System.out.println("         Java Escape Room");
    System.out.println("-----------------------------------");
    System.out.println(" ");
    System.out.println("Welcome to our Escape Room! What is you name?");
    
    String name = userInput.nextLine();  
    System.out.println("Hello, " + name);  
    addPlayer(new Player(name));
    System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the west. And a desk to the east.");  
  }
  
  private void addPlayer(Player player) {
    System.out.println("Adding player...");  
    addPlayer(new Player(name));
    System.out.println("You are standing in the center of a room above a rug. There is a door to the north. A bookcase to the south. A window to the west. And a desk to the east.");  
}

  public String getName(){
    return this.name;
}


public void endGame(boolean exit) {
    if(exit = true)  {
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
    

