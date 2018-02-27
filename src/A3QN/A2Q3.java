/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A3QN;

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
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create city
        City kw = new City();

        //create robot
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);
        
        //integer to make karel do command 4 times
        for (int i = 0; i < 4; i++) {
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move(4);
            karel.turnLeft();
            karel.move();
            karel.turnLeft();                
        }
        
    }
}
