import java.util.Scanner; 
import java.util.ArrayList;

public class Item {
  
  //attributes 
  public String name;
  public String type;
  private int locationX;
  private int locationY;
  private ArrayList <String> storage ;
  static Scanner usersInput = new Scanner(System.in);
  private has_clue 
  // public static void main(String[] args);
 
  //building the constructor 
  public Item (String name, String type, int locationX, int locationY) {
    // this.pin = 0102; 
    if (name != null) { this.name = name; }
    this.type = type;
    this.locationX = locationX;
    this.locationY = locationY;
    storage = new Hashtable<>();
      
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
  if (usersinput == "inspect rug") {
    System.out.println("There is a paper under the rug with a password.");
  } else if (usersinput == "inspect lamp"){
    System.out.println("There is a paper under the rug with a username.");
  } else if (usersinput == "inspect desk"){
    System.out.println("There is a computer monitor here and a lamp. A bookbag is leaning against the desk. This desk has drawers.");
  } else if (usersinput == "inspect drawers"){
    System.out.println("Hmmmm... There appears to be nothing here.");
  } else if (usersinput == "inspect computer"){
    System.out.println("Looks like we need a username and password to use the computer. Could there be something important on it...?");
} else if (usersinput == "inspect bookbag"){
    System.out.println("You look inside the bookbag. There appears to be nothing here.");
  } else if (usersinput == "inspect trashcan"){
    System.out.println("There is a thumb drive here...");
}  else if (usersinput == "inspect bookcase"){
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

 
