import java.util.Scanner; 
import java.util.ArrayList;
import java.awt.Point;

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
 
  //The constructor 
  public Item (String name, String type, int locationX, int locationY ) { 
    if (name != null) { this.name = name; }
    this.type = type;
    this.locationX = locationX;
    this.locationY = locationY;
    // make a parameter for clue 
      
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
    String person_res= users_input.nextLine();
  if (person_res == "inspect rug") {
    System.out.println("There is a paper under the rug with a password.");
  } else if (person_res == "inspect lamp"){
    System.out.println("There is a paper under the rug with a username.");
  } else if (person_res == "inspect desk"){
    System.out.println("There is a computer monitor here and a lamp. A bookbag is leaning against the desk. This desk has drawers.");
  } else if (person_res == "inspect drawers"){
    System.out.println("Hmmmm... There appears to be nothing here.");
  } else if (person_res == "inspect computer"){
    System.out.println("Looks like we need a username and password to use the computer. Could there be something important on it...?");
} else if (person_res == "inspect bookbag"){
    System.out.println("You look inside the bookbag. There appears to be nothing here.");
  } else if (person_res == "inspect trashcan"){
    System.out.println("There is a thumb drive here...");
}  else if (person_res == "inspect bookcase"){
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

 
