import java.io.*;
import java.util.*;

public class Furniture {
    public String name;  // can make private and use accessors and manipulators y
    private String location_X;
    private String location_Y;
    private String storage;
    
    public Furniture (String name, int location_x, int location_y) {
        this.name = name;
        // this.location_X = location_x;
        // this.location_Y= location_y;
        
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
    public void directions(String locationX, String locationY){
        if(this.name.toLowerCase()== "computer"|| this.name.toLowerCase()== "desk"){
            this.location_X = "0" ;
            this.location_Y= "north";
        }
        if (this.name.toLowerCase()==" "){
            
        }
        }

        
    }
    
 
  }
  public static void main(String args[]){
        
    }
}
