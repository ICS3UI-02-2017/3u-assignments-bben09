/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City kw = new City();
    RobotSE clarence = new RobotSE(kw, 0, 2, Direction.WEST);
    
        //spawn walls
         new Wall(kw, 1, 2, Direction.EAST);
         new Wall(kw, 2, 2, Direction.EAST);
         new Wall(kw, 2, 2, Direction.SOUTH);
         new Wall(kw, 2, 1, Direction.SOUTH);
         new Wall(kw, 1, 2, Direction.NORTH);
         new Wall(kw, 1, 1, Direction.NORTH);
         new Wall(kw, 1, 1, Direction.WEST);
         new Wall(kw, 2, 1, Direction.WEST);
         
         //moveing clarence around box
         clarence.move(2);
         clarence.turnLeft();
         clarence.move(3);
         clarence.turnLeft();
         clarence.move(3);
         clarence.turnLeft();
         clarence.move(3);
         clarence.turnLeft();
         clarence.move(1);
    }
}
