/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import becker.robots.icons.Icon;
import java.awt.Color;

/**
 * Learning how to use the Robots
 * @author daupb7975
 */
public class RobotExamples {
    private static Icon Clarence;
    private static Icon C;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Create a City for the Robot
        City kw = new City();
        
        // put a robot in kw
        RobotSE clarence = new RobotSE(kw, 1, 1, Direction.EAST);
        
        //create a wall
        new Wall(kw, 2, 5, Direction.WEST);
        
        //make thing
        new Thing(kw, 2, 4);
        
       //cahnge colour
        clarence.setColor(Color.red);
        
        //make clarence move
        clarence.move(3);
        
        //make clarence turn
        clarence.turnRight();
        
        clarence.move(1);
        
        clarence.pickThing();
        
        clarence.setColor(Color.orange);
        
        clarence.move();
        
        clarence.turnLeft();
        
        clarence.move();
        
        clarence.turnLeft();
        
        clarence.move();
        
        clarence.putThing();
        
        clarence.setColor(Color.red);
        
        clarence.turnRight();
        
        clarence.move();
       
     
    }

    private static void Wall(City kw, int i, int i0, Direction direction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
