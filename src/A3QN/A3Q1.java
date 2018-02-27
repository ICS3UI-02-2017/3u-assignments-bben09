/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A3QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author daupb7975
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          //create city
        City kw = new City();

        //create robot
        RobotSE clarence = new RobotSE(kw, 0, 2, Direction.WEST);

        //spawn walls to make box
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        
        for (int i = 0; i < 2; i++) {
            clarence.move(2);
            clarence.turnLeft();
            clarence.move(3);
            clarence.turnLeft();
            clarence.move(3);
            clarence.turnLeft();
            clarence.move(3);
            clarence.turnLeft();
            clarence.move();
        }
    }
}
