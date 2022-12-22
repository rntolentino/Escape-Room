import java.io.*;
import java.util.*;
import java.awt.Point;//Think we should just import point to make the coords situation easier (http://www.java2s.com/Tutorial/Java/0261__2D-Graphics/Pointclass.htm)
/**
 * The furniture class allows the player to locate the furniture and construct furniture. The method locate provides
 * description of what the user sees once they walk in a certain direction.
 * @author Renee Owusu Poku
 * @author Vanessa Pliego
 * @author Rachel Tolentino
*/
public class Furniture {
  // attributes 
  public String name;  // can make private and use accessors and manipulators y
  private String compLocation;
  private Point location; 



  /**
  * Constructor 
  */
  public Furniture (String name, Point location){
    this.name = name;
    this.location = location;   
  }

  //Accessors and Manipulators 
  /**
   * Gets the location of furniture 
   * @return the location of the furniture 
  */
  public Point getLocation(){
    return this.location;
  }

  /**
   * Gets the name of the furniture 
   * @return the nameo
  */
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
  
  /**
  * Describes the location the player has arrived to, based on the furniture located there. 
  */
  public void location(){
    if(this.name.toLowerCase().contains("door")|| this.name.toLowerCase().contains("pin-pad")){
      this.compLocation = "north";
      System.out.println( "You are in the " + compLocation + " part of the room");
      System.out.println( "You are standing in front of the door");
    }
    if (this.name.toLowerCase().contains("bookcase") ){
      this.compLocation = "south";
      System.out.println( "You are in the " + compLocation + " part of the room");
      System.out.println( "You are standing in front of the bookcase." );

    }
    if (this.name.toLowerCase().contains("window")){
      this.compLocation = "east" ;
      System.out.println( "You are in the " + compLocation + " part of the room");
      System.out.println("You are standing in front of an open window. Its very chilly!" );

    }
    if (this.name.toLowerCase().contains("lamp")|| this.name.toLowerCase().contains("desk")|| this.name.toLowerCase().contains("computer")|| this.name.toLowerCase().contains("trashcan")){
      this.compLocation= "west";
      System.out.println( "You are in the " + compLocation + " part of the room");
      System.out.println( "You are standing in front of a desk. On top of the desk is a lamp and computer. " );
    }
    if (this.name.toLowerCase().contains("rug")){
      System.out.println( "You are standing in the center of the room. Under your feet there is a rug." );
    }
    System.out.println( " ");
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

    // Furniture rug = new Furniture("rug", new Point(0, 0));
    // rug.location();
    // rug.stores("inspect rug");
    // System.out.println("done 9");

  }
}
