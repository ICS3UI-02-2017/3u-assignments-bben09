/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A3QN;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author daupb7975
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //create city
        City kw = new City();

        //create robot
        RobotSE clarence = new RobotSE(kw, 0, 0, Direction.EAST);
        
        kw.showThingCounts(true);

        //spawn 10 things where clarence is
        for (int i = 0; i < 10; i++) {
            new Thing(kw, 0, 0);
        }
            //for loop to make clarence move 10 things
            for (int a = 0; a < 10; a++) {
                //code to make clarence pick thing move drop and go back
                clarence.pickThing();
                clarence.move();
                clarence.putThing();
                clarence.turnAround();
                clarence.move();
                clarence.turnAround();
            }
        
    }
}
