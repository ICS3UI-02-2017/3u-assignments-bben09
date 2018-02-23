/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here


        //create city
        City kw = new City();

        //spawn robot
        RobotSE clarence = new RobotSE(kw, 4, 0, Direction.EAST);

        //spawn walls
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);

        //put things on walls
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        //move clarence up the stairs picking up things
        clarence.move();
        clarence.pickThing();
        clarence.turnLeft();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.pickThing();
        clarence.turnLeft();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.pickThing();
        clarence.turnLeft();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.pickThing();
        
        //move clarence down the stairs dropping the things on each stair
        clarence.move();
        clarence.putThing();
        clarence.move();
        clarence.turnRight();
        clarence.move();
        clarence.putThing();
        clarence.turnLeft();
        clarence.move();
         clarence.turnRight();
        clarence.move();
        clarence.putThing();
        clarence.turnLeft();
        clarence.move();
         clarence.turnRight();
        clarence.move();
        clarence.putThing();
        clarence.turnLeft();
        clarence.move();

    }
}
