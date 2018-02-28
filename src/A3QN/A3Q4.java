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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //create robot
        RobotSE clarence = new RobotSE(kw, 3, 3, Direction.SOUTH);

        //create top left box
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);

        //create top right box
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);

        //create bottom left box
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);

        //create bottom right box
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);

        for (int i = 0; i < 4; i++) {
            clarence.move(3);
            for (int j = 0; j < 3; j++) {
                clarence.turnRight();
                clarence.move(3);

            }
        }
    }
}
