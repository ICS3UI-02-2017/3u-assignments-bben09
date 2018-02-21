/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A2QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author daupb7975
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //spawn robot
        RobotSE clarence = new RobotSE(kw, 3, 5, Direction.EAST);

        while (clarence.getAvenue() != 0) {
            while (!clarence.isFacingNorth()) {
                clarence.turnLeft();
            }
        }
        clarence.move();

        while (clarence.getStreet() != 0) {
            while (!clarence.isFacingWest()) {
                clarence.turnLeft();
            }
        }
        clarence.move();
    }
}
