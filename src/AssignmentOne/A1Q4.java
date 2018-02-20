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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE clarence = new RobotSE(kw, 0, 0, Direction.SOUTH);
        RobotSE jim = new RobotSE(kw, 0, 1, Direction.SOUTH);
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        clarence.move();
        jim.move();
        jim.turnLeft();
        jim.move();
        clarence.move();
        jim.turnRight();
        jim.move();
        clarence.turnLeft();
        jim.turnRight();
        clarence.move();
        jim.move();
        
            
    }
}
