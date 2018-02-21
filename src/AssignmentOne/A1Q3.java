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

        //create city
        City kw = new City();

        //create robot
        RobotSE clarence = new RobotSE(kw, 3, 0, Direction.EAST);

        //create thing
        new Thing(kw, 3, 1);

        //create mountain
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);

        //move clarence to thing and pick it up
        clarence.move();
        clarence.pickThing();

        //take clarence to top of mountain
        clarence.turnLeft();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.turnLeft();
        clarence.move(2);
        clarence.turnRight();
        clarence.move();

        //put thing down on top of mountain
        clarence.putThing();

        //move clarence to base of mountain
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
