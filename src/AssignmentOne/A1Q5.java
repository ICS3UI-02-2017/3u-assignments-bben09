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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //spawn karel and maria
        RobotSE karel = new RobotSE(kw, 3, 3, Direction.EAST);
        RobotSE maria = new RobotSE(kw, 0, 1, Direction.WEST);

        //build karels house
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);

        //spawn karels dropped grocerys
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);

        //bring karel towards grocerys and begin picking them up
        karel.turnAround();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();

        //move maria to grocerys and pick them up
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();

        //move karel to other grocerys and pick them up
        karel.move();
        karel.pickThing();

        //move maria towards more grocerys and pick them up
        maria.turnLeft();
        maria.move();
        maria.pickThing();

        //turn karel towards maria
        karel.turnLeft();



    }
}
