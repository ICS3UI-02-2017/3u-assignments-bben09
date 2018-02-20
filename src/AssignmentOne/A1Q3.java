/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentOne;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City kw = new City();
    RobotSE clarence = new RobotSE(kw, 3, 0, Direction.EAST);
    new Thing(kw, 3, 1);
    new Wall(kw, 3, 2, Direction.WEST);
    new Wall(kw, 3, 2, Direction.NORTH);
    new Wall(kw, 2, 3, Direction.WEST);
    new Wall(kw, 1, 3, Direction.WEST);
    new Wall(kw, 1, 3, Direction.NORTH);
    new Wall(kw, 1, 3, Direction.EAST);
    new Wall(kw, 2, 4, Direction.NORTH);
    new Wall(kw, 2, 4, Direction.EAST);
    new Wall(kw, 3, 4, Direction.EAST);
    clarence.move();
    clarence.pickThing();
    clarence.turnLeft();
    clarence.move();
    clarence.turnRight();
    clarence.move();
    clarence.turnLeft();
    clarence.move(2);
    clarence.turnRight();
    clarence.move();
    clarence.putThing();
    clarence.move();
    clarence.turnRight();
    clarence.move();
    clarence.turnLeft();
    clarence.move();
    clarence.turnRight();
    clarence.move(2);
    clarence.turnLeft();
    
    
    
    }
}
