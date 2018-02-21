/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A2QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //spawn robot
        RobotSE clarence = new RobotSE(kw, 1, 0, Direction.EAST);

        //create race track and hurdles
        new Wall(kw, 1, 0, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 3, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.SOUTH);
        new Wall(kw, 1, 6, Direction.SOUTH);
        new Wall(kw, 1, 7, Direction.SOUTH);
        new Wall(kw, 1, 8, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.WEST);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 7, Direction.WEST);

        //create thing
        new Thing(kw, 1, 8);
        
        //loop that makes clarence run race and stop on thing
        while (!clarence.canPickThing()) {
            if (!clarence.frontIsClear()) {
                clarence.turnLeft();
                clarence.move();
                clarence.turnRight();
                clarence.move();
                clarence.turnRight();
                clarence.move();
                clarence.turnLeft();

            } else {
                clarence.move();
            }

        }

    }
}
