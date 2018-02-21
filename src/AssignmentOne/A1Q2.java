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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //create robot
        RobotSE clarence = new RobotSE(kw, 1, 2, Direction.WEST);

        //spawn walls 
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);

        //Create thing
        new Thing(kw, 2, 2);

        //move clarence to thing
        clarence.move();
        clarence.turnLeft();
        clarence.move();
        clarence.turnLeft();
        clarence.move();

        //pick up thing
        clarence.pickThing();

        //take clarence back to bed
        clarence.turnAround();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.turnAround();

    }
}
