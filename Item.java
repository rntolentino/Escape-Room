import java.util.Scanner; 
import java.util.ArrayList;

public class Item {
  
  //attributes 
  public String name;
  public String type;
  private int locationX;
  private int locationY;
  private ArrayList <String> storage ;
  static Scanner users_input = new Scanner(System.in);
  private Boolean has_clue; 
  // public static void main(String[] args);
 
  //building the constructor 
  public Item (String name, String type, int locationX, int locationY, ) { 
    if (name != null) { this.name = name; }
    this.type = type;
    this.locationX = locationX;
    this.locationY = locationY;
    
      
}


  //methods 
//this will create a list of clues that will be hidden within some items. 
  /**
  private void createrelevantClues(){
    relevantClues.add("key");
    relevantClues.add("username: rrv120");
    relevantClues.add("thumb drive");
    relevantClues.add("password: escap1ng");
  }
**/
  
  //this will inspect an item grabbed and will notify the player if it is useful or not
  public void inspectItem(String item){
  if (users_input == "inspect rug") {
    System.out.println("There is a paper under the rug with a password.");
  } else if (users_input == "inspect lamp"){
    System.out.println("There is a paper under the rug with a username.");
  } else if (users_input == "inspect desk"){
    System.out.println("There is a computer monitor here and a lamp. A bookbag is leaning against the desk. This desk has drawers.");
  } else if (users_input == "inspect drawers"){
    System.out.println("Hmmmm... There appears to be nothing here.");
  } else if (users_input == "inspect computer"){
    System.out.println("Looks like we need a username and password to use the computer. Could there be something important on it...?");
} else if (users_input == "inspect bookbag"){
    System.out.println("You look inside the bookbag. There appears to be nothing here.");
  } else if (users_input == "inspect trashcan"){
    System.out.println("There is a thumb drive here...");
}  else if (users_input == "inspect bookcase"){
    System.out.println("There is a key here...");
  } else{
    System.out.println("Is there anything else you'd like to inspect?");

  }

}

  /**
public void itemtype
This method will allow us to distinguish between furniture items and technology. Currently unsure on how to make this work or if it makes sense to implement this. 
 **/ 
}

 
