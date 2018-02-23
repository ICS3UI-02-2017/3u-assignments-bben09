/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A2QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //spawn robot
        RobotSE clarence = new RobotSE(kw, 4, 0, Direction.NORTH);
        //spawn castle walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);

        //Loop to make clarence move around castle making him check if front is clear or note to move or turn
        while (!clarence.canPickThing()) {
            if (clarence.frontIsClear()) {
                clarence.move();
                clarence.turnRight();
            } else {
                clarence.turnLeft();
            }
        }
    }
}
