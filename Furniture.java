import java.io.*;
import java.util.*;
import java.awt.Point;//Think we should just import point to make the coords situation easier (http://www.java2s.com/Tutorial/Java/0261__2D-Graphics/Pointclass.htm)

public class Furniture {
  public String name;  // can make private and use accessors and manipulators y
  private String location_X;
  private String location_Y;
  private Point location; 
  private ArrayList<String> storage = new ArrayList<String>();

  // Furniture rug = new Furniture("rug", new Point(0, 0));


  /**
  * Constructor 
  */
  public Furniture (String name, Point location){
    this.name = name;
    this.location = location;   
  }

  public Point getLocation(){
    return this.location;
  }

  public String getName(){
    return this.name;
  }
  
  
    /**
    the goal for this section is to create a memory area for the items to be stored and remembered so that 
    they can then be added to inventory. Once again, not completely sure on how to execute this. 
    **/

    // methods
    /**
    the goal here is to be able to give location to the items in item.java in the escape room.
    This method is a bit confusing since we would probably need to do some inheritance or something 
    that'd allow us to connect the classes alltogether. 
    **/
    
  public void location(){
    if(this.name.toLowerCase().contains("door")|| this.name.toLowerCase().contains("pin-pad")){
      this.location_X = "north" ;
      this.location_Y= "0";
      System.out.println( "You have hit the door that has a pin-pad on it , it is located in the "+location_X + " part of the room" );
    }
    if (this.name.toLowerCase().contains("bookcase") ){
      this.location_X = "0" ;
      this.location_Y= "south";
      System.out.println( "You have hit the bookcase that has a safe, it is located in the "+ location_Y + " part of the room" );
    }
    if (this.name.toLowerCase().contains("window")){
      this.location_X = "east" ;
      this.location_Y= "0";
      System.out.println("You have hit the window, it is located in the "+ location_X + " part of the room" );

    }
    if (this.name.toLowerCase().contains("lamp")|| this.name.toLowerCase().contains("desk")|| this.name.toLowerCase().contains("computer")|| this.name.toLowerCase().contains("trashcan")){
      this.location_X = "0" ;
      this.location_Y= "west";
      System.out.println( "You have hit the desk that contains a lamp and computer. There is a trashcan, with a thumbdrive inside, next to the desk. These things are located in the "+location_Y + " part of the room" );
    }
    if (this.name.toLowerCase().contains("rug")){
      // if (user.getLocation().equals(rug.getLocation()))
      System.out.println( "You are standing in the center of the room. Under your feet there is a rug." );
    }
  }
  public void stores (String item){
    if (item.toLowerCase().contains("inspect lamp")){
      System.out.println("There is a paper under the lamp.");
    } 
    if (item.toLowerCase().contains("inspect computer")){
      System.out.println("There is a login screen.");
    }
    if (item.toLowerCase().contains("inspect trashcan")){
      System.out.println("There is a thumbdrive inside the trashcan.");
    }
    if (item.toLowerCase().contains("inspect rug ")){
      System.out.println("There seems to be a box under the rug. In the box is a key.");
    }
    if (item.toLowerCase().contains("inspect bookcase ")){
      System.out.println("There is a safe on one of the shelves of the bookcase. You need a key to open the safe.");
    }
    if (item.toLowerCase().contains("inspect desk ")){
      System.out.println("There is a lamp and a computer on the desk. Next to the desk there is a trashcan.");
    }
    if (item.toLowerCase().contains("inspect pin-pad ")){
      System.out.println("Find code.");
    }
  }

    
      

    


        
    
    
 
  
  public static void main(String args[]){
    // Furniture desk = new Furniture("desk");
    // desk.location();
    // desk.stores("inspect lamp");
    // System.out.println("done 1 ");

    // Furniture window = new Furniture("window");
    // window.location();
    // System.out.println("done 2 ");

    // Furniture bookcase = new Furniture("bookcase");
    // bookcase.location();
    // bookcase.stores("inspect bookcase");
    // System.out.println("done 3 ");

    // Furniture door = new Furniture("door");
    // door.location();
    // System.out.println("done 4 ");

    // Furniture pinpad = new Furniture("pin-pad");
    // pinpad.location();
    // System.out.println("done 5 ");

    // Furniture computer = new Furniture("computer");
    // computer.location();
    // computer.stores("inspect computer");
    // System.out.println("done 6 ");

    // Furniture trashcan = new Furniture("trashcan");
    // trashcan.location();
    // System.out.println("done 7 ");

    // Furniture lamp = new Furniture("lamp");
    // lamp.location();
    // lamp.stores("inspect lamp");
    // System.out.println("done 8 ");

    Furniture rug = new Furniture("rug", new Point(0, 0));
    rug.location();
    rug.stores("inspect rug");
    System.out.println("done 9");

  }
}
