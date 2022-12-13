import java.io.*;
import java.util.*;

public class Furniture {
    public String name;  // can make private and use accessors and manipulators y
    private String location_X;
    private String location_Y;
    private ArrayList<String> storage = new ArrayList<String>();

    public Furniture (String name) {
        this.name = name;
        
      }

    public String getLocation_X(){
      return (this.location_X );
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
      }
    public void stores (){
      if (this.name.toLowerCase().contains("inspect lamp")){
        System.out.println("There is a paper under the lamp");
      } 
      if (this.name.toLowerCase().contains("inspect computer")){
        System.out.println("There is a login screen");
      }
      if (this.name.toLowerCase().contains("inspect trashcan")){
        System.out.println("There is a thumbdrive inside the trashcan");
      }
      if (this.name.toLowerCase().contains("inspect rug ")){
        
      }

    }
  
    
      

    


        
    
    
 
  
  public static void main(String args[]){
    Furniture desk = new Furniture("desk");
    desk.location();
    Furniture window = new Furniture("window");
    window.location();
    Furniture bookcase = new Furniture("bookcase");
    bookcase.location();
    Furniture door = new Furniture("door");
    door.location();
    Furniture pinpad = new Furniture("pin-pad");
    pinpad.location();
    Furniture computer = new Furniture("computer");
    computer.location();
    Furniture trashcan = new Furniture("trashcan");
    trashcan.location();
    Furniture lamp = new Furniture("lamp");
    lamp.location();
    }
}
